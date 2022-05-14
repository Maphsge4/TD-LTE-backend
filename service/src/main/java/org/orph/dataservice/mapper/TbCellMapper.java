package org.orph.dataservice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.orph.dataservice.importData.TbCellData;
import org.orph.dataservice.entity.TbCell;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dylanhz
 * @since 2021-06-14
 */
@Mapper
public interface TbCellMapper extends BaseMapper<TbCell> {
    void insertBatch(@Param(value="list")List<TbCellData>list);
}
