package org.orph.dataservice.service.impl;

import com.alibaba.excel.EasyExcel;
import org.orph.dataservice.entity.TbCellKPI;
import org.orph.dataservice.importData.TbCellKPIData;
import org.orph.dataservice.listener.TbCellKPIExcelListener;
import org.orph.dataservice.mapper.TbCellKPIMapper;
import org.orph.dataservice.service.TbCellKPIService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author machenxiang
 * @since 2022-04-17
 */
@Service
public class TbCellKPIServiceImpl extends ServiceImpl<TbCellKPIMapper, TbCellKPI> implements TbCellKPIService {

    @Override
    public void saveTbCellKPI(MultipartFile file) {
        try {
            InputStream in = file.getInputStream();
            EasyExcel.read(in, TbCellKPIData.class, new TbCellKPIExcelListener(this)).sheet().doRead();
        } catch (Exception e) {
        }
    }

    @Resource
    TbCellKPIMapper tbCellKPIMapper;

    @Override
    public void insertBatch(List<TbCellKPIData> list) {
        tbCellKPIMapper.insertBatch(list);
    }
}
