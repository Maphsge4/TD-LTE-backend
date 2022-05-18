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
 * @author machenxiang
 * @since 2022-04-17
 */
@Mapper
public interface TbCellMapper extends BaseMapper<TbCell> {
    void insertBatch(@Param(value="list")List<TbCellData>list);
}
