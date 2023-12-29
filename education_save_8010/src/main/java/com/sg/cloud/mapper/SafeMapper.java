package com.sg.cloud.mapper;

import com.sg.cloud.entity.Safe;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hao
 * @since 2023-12-28
 */
@Mapper
public interface SafeMapper extends BaseMapper<Safe> {
    Safe selectBySafeId(@Param("safeId") Integer safeId);
}
