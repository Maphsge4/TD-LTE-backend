package org.orph.dataservice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.orph.dataservice.entity.TbCellKPI;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.orph.dataservice.importData.TbCellKPIData;
import org.orph.dataservice.importData.TbMRODataData;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dylanhz
 * @since 2021-06-15
 */
@Mapper
public interface TbCellKPIMapper extends BaseMapper<TbCellKPI> {
    void insertBatch(@Param(value="list") List<TbCellKPIData> list);
}
