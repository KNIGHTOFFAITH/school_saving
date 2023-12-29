package com.sg.cloud.service;

import com.sg.cloud.entity.TbScore;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hao
 * @since 2023-12-29
 */
public interface ITbScoreService extends IService<TbScore> {

    TbScore getScoreByStudentId(Integer stuId);
}
