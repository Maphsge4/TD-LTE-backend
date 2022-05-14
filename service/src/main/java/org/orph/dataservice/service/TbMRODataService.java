package org.orph.dataservice.service;

import org.orph.dataservice.entity.TbMROData;
import com.baomidou.mybatisplus.extension.service.IService;
import org.orph.dataservice.importData.TbMRODataData;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dylanhz
 * @since 2021-06-15
 */
public interface TbMRODataService extends IService<TbMROData> {
    void saveTbMROData(MultipartFile file);

    void insertBatch(List<TbMRODataData> list);
}
