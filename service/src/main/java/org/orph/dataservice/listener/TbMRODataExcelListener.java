package org.orph.dataservice.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.exception.ExcelDataConvertException;
import org.orph.dataservice.importData.TbMRODataData;
import org.orph.dataservice.service.TbMRODataService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TbMRODataExcelListener extends AnalysisEventListener<TbMRODataData> {
    private final TbMRODataService tbMRODataService;
    private final List<TbMRODataData> tbMRODataDataList;
    private final Integer batchSize;
    private final Logger logger;

    public TbMRODataExcelListener(TbMRODataService _tbMRODataService) throws IOException {
        this.tbMRODataService = _tbMRODataService;
        tbMRODataDataList = new ArrayList<>();
        batchSize = 7000;
        FileHandler handler = new FileHandler("tbCellImport.log");
        handler.setFormatter(new SimpleFormatter());
        logger = Logger.getLogger("tbCellImport");
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
    public void invoke(TbMRODataData tbMRODataData, AnalysisContext analysisContext) {
        if (tbMRODataData.check()) {
            tbMRODataDataList.add(tbMRODataData);
            if (tbMRODataDataList.size() >= batchSize) {
                tbMRODataService.insertBatch(tbMRODataDataList);
                tbMRODataDataList.clear();
            }
        } else {
//            logger.info("Illegal record! Sector_ID : " + tbMROData.getId());
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        if (tbMRODataDataList.size() > 0) {
            tbMRODataService.insertBatch(tbMRODataDataList);
        }
    }
}
