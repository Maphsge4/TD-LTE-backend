package org.orph.dataservice.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.exception.ExcelDataConvertException;
import org.orph.dataservice.importData.TbCellKPIData;
import org.orph.dataservice.service.TbCellKPIService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TbCellKPIExcelListener extends AnalysisEventListener<TbCellKPIData> {

    private final TbCellKPIService tbCellKPIService;
    private final List<TbCellKPIData> tbCellKPIDataList;
    private final Integer batchSize;
    private final Logger logger;

    public TbCellKPIExcelListener(TbCellKPIService _tbCellKPIService) throws IOException {
        this.tbCellKPIService = _tbCellKPIService;
        tbCellKPIDataList = new ArrayList<>();
        batchSize = 4000;
        FileHandler handler = new FileHandler("tbCellKPIImport.log");
        handler.setFormatter(new SimpleFormatter());
        logger = Logger.getLogger("tbCellKPIImport");
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
    public void invoke(TbCellKPIData tbCellKPIData, AnalysisContext analysisContext) {
        if (tbCellKPIData.check()) {
            String year = tbCellKPIData.getStartTime().substring(6, 10);
            String month = tbCellKPIData.getStartTime().substring(0, 2);
            String day = tbCellKPIData.getStartTime().substring(3, 5);
            tbCellKPIData.setStartTime(year + "-" + month + "-" + day);
            tbCellKPIDataList.add(tbCellKPIData);
            if (tbCellKPIDataList.size() >= batchSize) {
                tbCellKPIService.insertBatch(tbCellKPIDataList);
                tbCellKPIDataList.clear();
            }
        } else {
            logger.info("Illegal record! Sector_NAME : " + tbCellKPIData.getSectorName());
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        if (tbCellKPIDataList.size() > 0) {
            tbCellKPIService.insertBatch(tbCellKPIDataList);
        }
    }
}
