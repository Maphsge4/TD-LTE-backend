package org.orph.dataservice.service;

import org.orph.dataservice.entity.TbPRB;
import com.baomidou.mybatisplus.extension.service.IService;
import org.orph.dataservice.importData.TbCellKPIData;
import org.orph.dataservice.importData.TbPRBData;
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
public interface TbPRBService extends IService<TbPRB> {
    void saveTbPRB(MultipartFile file);

    void insertBatch(List<TbPRBData> list);
}
