package com.sg.cloud.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sg.cloud.cr.QueryCase;
import com.sg.cloud.entity.Safe;
import com.sg.cloud.mapper.SafeMapper;
import com.sg.cloud.service.ISafeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hao
 * @since 2023-12-28
 */
@Service
@Slf4j
public class SafeServiceImpl extends ServiceImpl<SafeMapper, Safe> implements ISafeService {
    @Resource
    private SafeMapper safeMapper;
    @Override
    public Safe selectBySafeId(Integer safeId) {
        return safeMapper.selectBySafeId(safeId);
    }

    @Override
    public Page<Safe> getAll(Integer pageNum, Integer pageSize) {
        Page<Safe> page = new Page<>(pageNum, pageSize);
        return safeMapper.selectPage(page, null);
    }

    @Override
    public Page<Safe> getByCase(Integer pageNum, Integer pageSize, QueryCase queryCase) {
        Page<Safe> page = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<Safe> queryWrapper = new LambdaQueryWrapper<>();
        if (queryCase.getSafeType()!= null) {
            queryWrapper.eq(Safe::getSafeType, queryCase.getSafeType());
        }
        if (queryCase.getSafeTitle()!= null) {
            queryWrapper.like(Safe::getSafeTitle, queryCase.getSafeTitle());
        }
        if (queryCase.getSafeContent()!= null) {
            queryWrapper.like(Safe::getSafeContent, queryCase.getSafeContent());
        }
        return safeMapper.selectPage(page, queryWrapper);
    }
}
