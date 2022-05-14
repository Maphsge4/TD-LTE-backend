package org.orph.dataservice.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.exception.ExcelDataConvertException;
import org.orph.dataservice.importData.TbPRBData;
import org.orph.dataservice.service.TbPRBService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TbPRBExcelListener extends AnalysisEventListener<TbPRBData> {

    private final TbPRBService tbPRBService;
    private final List<TbPRBData> tbPRBDataList;
    private final Integer batchSize;
    private final Logger logger;

    public TbPRBExcelListener(TbPRBService _tbPRBService) throws IOException {
        this.tbPRBService = _tbPRBService;
        tbPRBDataList = new ArrayList<>();
        batchSize = 3000;
        FileHandler handler = new FileHandler("tbPRBImport.log");
        handler.setFormatter(new SimpleFormatter());
        logger = Logger.getLogger("tbPRBImport");
        logger.addHandler(handler);
    }

    @Override
    public void onException(Exception exception, AnalysisContext context) {
        // 如果是某一个单元格的转换异常 能获取到具体行号
        // 如果要获取头的信息 配合invokeHeadMap使用
        if (exception instanceof ExcelDataConvertException) {
            ExcelDataConvertException excelDataConvertException = (ExcelDataConvertException) exception;
            logger.info("第" + Integer.toString(excelDataConvertException.getRowIndex())
                    + "行，第" + Integer.toString(excelDataConvertException.getColumnIndex()) + "列解析异常");
        }
    }

    @Override
    public void invoke(TbPRBData tbPRBData, AnalysisContext analysisContext) {
        if (tbPRBData.check()) {
            String year = tbPRBData.getStartTime().substring(6, 10);
            String month = tbPRBData.getStartTime().substring(0, 2);
            String day = tbPRBData.getStartTime().substring(3, 5);
            String time = tbPRBData.getStartTime().substring(11, 19);
            tbPRBData.setStartTime(year + "-" + month + "-" + day + " " + time);
            tbPRBDataList.add(tbPRBData);
            if (tbPRBDataList.size() >= batchSize) {
                tbPRBService.insertBatch(tbPRBDataList);
                tbPRBDataList.clear();
            }
        } else {
            logger.info("Illegal record! Sector_NAME : " + tbPRBData.getSectorName());
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        if (tbPRBDataList.size() > 0) {
            tbPRBService.insertBatch(tbPRBDataList);
        }
    }
}
