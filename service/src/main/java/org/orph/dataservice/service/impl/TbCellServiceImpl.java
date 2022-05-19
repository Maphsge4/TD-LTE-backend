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
 * @author machenxiang
 * @since 2022-04-17
 */
@Service
public class TbCellServiceImpl extends ServiceImpl<TbCellMapper, TbCell> implements TbCellService {

    @Override
    public void saveTbCell(MultipartFile file) {
        try {
            InputStream in = file.getInputStream();
            EasyExcel.read(in, TbCellData.class, new TbCellExcelListener(this)).sheet().doRead();
//            EasyExcel.read(in, TbCell.class, new TbCellExcelListener(this)).sheet().doRead();
        } catch (Exception e) {
        }
    }

    @Resource
    TbCellMapper tbCellMapper;

    @Override
    public void insertBatch(List<TbCell> list) {
        tbCellMapper.insertBatch(list);
    }

    @Override
    public TbCell construct(TbCellData tbCellData){
        TbCell tbCell = new TbCell();
        tbCell.setId(tbCellData.getId());
        tbCell.setCity(tbCellData.getCity());
        tbCell.setSectorId(tbCellData.getSectorId());
        tbCell.setEnodebid(tbCellData.getEnodebid());
        tbCell.setSectorName(tbCellData.getSectorName());
        tbCell.setEnodebName(tbCellData.getEnodebName());
        tbCell.setEarfcn(tbCellData.getEarfcn());
        tbCell.setPci(tbCellData.getPci());
        tbCell.setPss(tbCellData.getPss());
        tbCell.setSss(tbCellData.getSss());
        tbCell.setTac(tbCellData.getTac());
        tbCell.setVendor(tbCellData.getVendor());
        tbCell.setLongitude(tbCellData.getLongitude());
        tbCell.setLatitude(tbCellData.getLatitude());
        tbCell.setStyle(tbCellData.getStyle());
        tbCell.setAzimuth(tbCellData.getAzimuth());
        tbCell.setElecttilt(tbCellData.getElecttilt());
        tbCell.setHeight(tbCellData.getHeight());
        tbCell.setMechtilt(tbCellData.getMechtilt());
        tbCell.setTotletilt(tbCellData.getTotletilt());
        return tbCell;
    }
}
