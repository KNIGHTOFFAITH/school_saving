package com.sg.cloud.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sg.cloud.cr.QueryCase;
import com.sg.cloud.entity.Safe;
import com.baomidou.mybatisplus.extension.service.IService;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hao
 * @since 2023-12-28
 */
public interface ISafeService extends IService<Safe> {
    Safe selectBySafeId(Integer safeId);

    Page<Safe> getAll(Integer pageNum, Integer pageSize);

    Page<Safe> getByCase(Integer pageNum, Integer pageSize, QueryCase queryCase);
}
