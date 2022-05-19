package org.orph.dataservice.importData;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author gaoyuan
 * @since 2022-04-17
 */

@Data
public class TbMRODataData {
// CSDN说对应实体类的成员变量名不能有大写字母，我只是把首字母变成了小写，就成功
// 之前导出的excel表格大部分列没有数据
    @ExcelProperty(value = "id", index = 0)
    private Integer id;

    @ExcelProperty(value = "timeStamp", index = 1)
    private String timeStamp;

    @ExcelProperty(value = "servingSector", index = 2)
    private String servingSector;

    @ExcelProperty(value = "interferingSector", index = 3)
    private String interferingSector;

    @ExcelProperty(value = "lteScRSRP", index = 4)
    private Float lteScRSRP;

    @ExcelProperty(value = "lteNcRSRP", index = 5)
    private Float lteNcRSRP;

    @ExcelProperty(value = "lteNcEarfcn", index = 6)
    private Integer lteNcEarfcn;

    @ExcelProperty(value = "lteNcPci", index = 7)
    private Integer lteNcPci;

    @ExcelProperty(value = "rsrpDiff", index = 8)
    private Float rsrpDiff;

    @ExcelProperty(value = "avgDiff", index = 9)
    private Float avgDiff;

    @ExcelProperty(value = "stdDiff", index = 10)
    private Float stdDiff;

    @ExcelProperty(value = "count", index = 11)
    private Float count;

    public boolean check() {
        return (servingSector != null && interferingSector != null);
    }
}
