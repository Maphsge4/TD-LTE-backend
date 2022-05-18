package org.orph.dataservice.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author dylanhz
 * @since 2021-06-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tbCell")
@ApiModel(value = "TbCell对象")
public class TbCell implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
//    @ExcelProperty(value = "id", index = 0)
    private Integer id;

    @TableField("CITY")
//    @ExcelProperty(value = "city", index = 1)
    @ExcelProperty(index = 0)
    private String city;

    @TableField("SECTOR_ID")
//    @ExcelProperty(value = "sectorId", index = 2)
    @ExcelProperty(index = 1)
    private String sectorId;

    @TableField("SECTOR_NAME")
//    @ExcelProperty(value = "sectorName", index = 3)
    @ExcelProperty(index = 2)
    private String sectorName;

    @TableField("ENODEBID")
//    @ExcelProperty(value = "enodebid", index = 4)
    @ExcelProperty(index = 3)
    private Integer enodebid;

    @TableField("ENODEB_NAME")
//    @ExcelProperty(value = "enodebName", index = 5)
    @ExcelProperty(index = 4)
    private String enodebName;

    @TableField("EARFCN")
//    @ExcelProperty(value = "earfcn", index = 6)
    @ExcelProperty(index = 5)
    private Integer earfcn;

    @TableField("PCI")
//    @ExcelProperty(value = "pci", index = 7)
    @ExcelProperty(index = 6)
    private Integer pci;

    @TableField("PSS")
//    @ExcelProperty(value = "pss", index = 8)
    @ExcelProperty(index = 7)
    private Integer pss;

    @TableField("SSS")
//    @ExcelProperty(value = "sss", index = 9)
    @ExcelProperty(index = 8)
    private Integer sss;

    @TableField("TAC")
//    @ExcelProperty(value = "tac", index = 10)
    @ExcelProperty(index = 9)
    private Integer tac;

    @TableField("VENDOR")
//    @ExcelProperty(value = "vendor", index = 11)
    @ExcelProperty(index = 10)
    private String vendor;

    @TableField("LONGITUDE")
//    @ExcelProperty(value = "longitude", index = 12)
    @ExcelProperty(index = 11)
    private Float longitude;

    @TableField("LATITUDE")
//    @ExcelProperty(value = "latitude", index = 13)
    @ExcelProperty(index = 12)
    private Float latitude;

    @TableField("STYLE")
//    @ExcelProperty(value = "style", index = 14)
    @ExcelProperty(index = 13)
    private String style;

    @TableField("AZIMUTH")
//    @ExcelProperty(value = "azimuth", index = 15)
    @ExcelProperty(index = 14)
    private Float azimuth;

    @TableField("HEIGHT")
//    @ExcelProperty(value = "height", index = 16)
    @ExcelProperty(index = 15)
    private Float height;

    @TableField("ELECTTILT")
//    @ExcelProperty(value = "electtilt", index = 17)
    @ExcelProperty(index = 16)
    private Float electtilt;

    @TableField("MECHTILT")
//    @ExcelProperty(value = "mechtilt", index = 18)
    @ExcelProperty(index = 17)
    private Float mechtilt;

    @TableField("TOTLETILT")
//    @ExcelProperty(value = "totletilt", index = 19)
    @ExcelProperty(index = 18)
    private Float totletilt;

}
