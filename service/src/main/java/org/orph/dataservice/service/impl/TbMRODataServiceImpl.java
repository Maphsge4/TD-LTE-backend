package org.orph.dataservice.service.impl;

import com.alibaba.excel.EasyExcel;
import org.orph.dataservice.entity.TbMROData;
import org.orph.dataservice.importData.TbMRODataData;
import org.orph.dataservice.listener.TbMRODataExcelListener;
import org.orph.dataservice.mapper.TbMRODataMapper;
import org.orph.dataservice.service.TbMRODataService;
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
public class TbMRODataServiceImpl extends ServiceImpl<TbMRODataMapper, TbMROData> implements TbMRODataService {
    @Override
    public void saveTbMROData(MultipartFile file) {
        try {
            InputStream in = file.getInputStream();
            EasyExcel.read(in, TbMROData.class, new TbMRODataExcelListener(this)).sheet().doRead();
        } catch (Exception e) {
        }
    }

    @Resource
    TbMRODataMapper tbMRODataMapper;

    @Override
    public void insertBatch(List<TbMRODataData> list) {
        tbMRODataMapper.insertBatch(list);
    }
}
