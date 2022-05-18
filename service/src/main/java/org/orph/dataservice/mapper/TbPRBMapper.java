package org.orph.dataservice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.orph.dataservice.entity.TbPRB;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.orph.dataservice.importData.TbPRBData;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author machenxiang
 * @since 2022-04-17
 */
@Mapper
public interface TbPRBMapper extends BaseMapper<TbPRB> {
    void insertBatch(@Param(value="list") List<TbPRBData> list);
}
