package org.orph.dataservice.importData;

import com.alibaba.excel.annotation.ExcelProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * </p>
 *
 * @author testjava
 * @since 2021-06-09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor  // 一定要有无参构造方法
public class TbCellData {

    private Integer id;

    @ExcelProperty(index = 0)
    private String city;

    @ExcelProperty(index = 1)
    private String sectorId;

    @ExcelProperty(index = 2)
    private String sectorName;

    @ExcelProperty(index = 3)
    private Integer enodebid;

    @ExcelProperty(index = 4)
    private String enodebName;

    @ExcelProperty(index = 5)
    private Integer earfcn;

    @ExcelProperty(index = 6)
    private Integer pci;

    @ExcelProperty(index = 7)
    private Integer pss;

    @ExcelProperty(index = 8)
    private Integer sss;

    @ExcelProperty(index = 9)
    private Integer tac;

    @ExcelProperty(index = 10)
    private String vendor;

    @ExcelProperty(index = 11)
    private Float longitude;

    @ExcelProperty(index = 12)
    private Float latitude;

    @ExcelProperty(index = 13)
    private String style;

    @ExcelProperty(index = 14)
    private Float azimuth;

    @ExcelProperty(index = 15)
    private Float height;

    @ExcelProperty(index = 16)
    private Float electtilt;

    @ExcelProperty(index = 17)
    private Float mechtilt;

    @ExcelProperty(index = 18)
    private Float totletilt;

    public boolean check() {
        if (sectorName == null || enodebName == null || enodebid == null
                || earfcn == null || longitude == null || latitude == null
                || azimuth == null || totletilt == null) {
            return false;
        } else {
            return true;
        }
    }


}
