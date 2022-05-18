package org.orph.dataservice.service;

import org.orph.dataservice.entity.TbCellKPI;
import com.baomidou.mybatisplus.extension.service.IService;
import org.orph.dataservice.importData.TbCellKPIData;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author machenxiang
 * @since 2022-04-17
 */
public interface TbCellKPIService extends IService<TbCellKPI> {
    void saveTbCellKPI(MultipartFile file);

    void insertBatch(List<TbCellKPIData> list);
}
