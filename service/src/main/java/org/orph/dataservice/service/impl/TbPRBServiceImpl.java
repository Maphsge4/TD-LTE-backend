package org.orph.dataservice.service.impl;

import com.alibaba.excel.EasyExcel;
import org.orph.dataservice.entity.TbPRB;
import org.orph.dataservice.importData.TbCellKPIData;
import org.orph.dataservice.importData.TbPRBData;
import org.orph.dataservice.listener.TbCellKPIExcelListener;
import org.orph.dataservice.listener.TbPRBExcelListener;
import org.orph.dataservice.mapper.TbPRBMapper;
import org.orph.dataservice.service.TbPRBService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dylanhz
 * @since 2021-06-15
 */
@Service
public class TbPRBServiceImpl extends ServiceImpl<TbPRBMapper, TbPRB> implements TbPRBService {

    @Override
    public void saveTbPRB(MultipartFile file) {
        try {
            InputStream in = file.getInputStream();
            EasyExcel.read(in, TbPRBData.class, new TbPRBExcelListener(this)).sheet().doRead();
        } catch (Exception e) {
        }
    }

    @Resource
    TbPRBMapper tbPRBMapper;

    @Override
    public void insertBatch(List<TbPRBData> list) {
        tbPRBMapper.insertBatch(list);
    }
}
