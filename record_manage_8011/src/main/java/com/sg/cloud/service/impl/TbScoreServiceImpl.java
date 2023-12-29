package com.sg.cloud.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.sg.cloud.entity.TbScore;
import com.sg.cloud.mapper.TbScoreMapper;
import com.sg.cloud.service.ITbScoreService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hao
 * @since 2023-12-29
 */
@Service
public class TbScoreServiceImpl extends ServiceImpl<TbScoreMapper, TbScore> implements ITbScoreService {
    @Resource
    private TbScoreMapper tbScoreMapper;
    @Override
    public TbScore getScoreByStudentId(Integer stuId) {
        LambdaQueryWrapper<TbScore> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(TbScore::getStudentId,stuId);
        return tbScoreMapper.selectOne(queryWrapper);
    }
}
