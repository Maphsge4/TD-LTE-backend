package org.orph.dataservice.service.impl;

import com.alibaba.excel.EasyExcel;
import org.orph.dataservice.importData.TbCellData;
import org.orph.dataservice.entity.TbCell;
import org.orph.dataservice.listener.TbCellExcelListener;
import org.orph.dataservice.mapper.TbCellMapper;
import org.orph.dataservice.service.TbCellService;
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
 * @since 2021-06-14
 */
@Service
public class TbCellServiceImpl extends ServiceImpl<TbCellMapper, TbCell> implements TbCellService {

    @Override
    public void saveTbCell(MultipartFile file) {
        try {
            InputStream in = file.getInputStream();
            EasyExcel.read(in, TbCellData.class, new TbCellExcelListener(this)).sheet().doRead();
        } catch (Exception e) {
        }
    }

    @Resource
    TbCellMapper tbCellMapper;

    @Override
    public void insertBatch(List<TbCellData> list) {
        tbCellMapper.insertBatch(list);
    }
}
