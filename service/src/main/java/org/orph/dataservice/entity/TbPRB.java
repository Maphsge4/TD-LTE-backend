package org.orph.dataservice.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author dylanhz
 * @since 2021-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tbPRB")
@ApiModel(value = "TbPRB对象", description = "")
public class TbPRB implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ExcelProperty(index = -1 + 1)
    private Integer id;

    @TableField("StartTime")
    @ExcelProperty(index = -1 + 2)
    private Date startTime;

    @TableField("ENODEB_NAME")
    @ExcelProperty(index = -1 + 3)
    private String enodebName;

    @TableField("SECTOR_DESCRIPTION")
    @ExcelProperty(index = -1 + 4)
    private String sectorDescription;

    @TableField("SECTOR_NAME")
    @ExcelProperty(index = -1 + 5)
    private String sectorName;

    @TableField("avgInterferingNoiseOnPRB00_dBmW")
    @ExcelProperty(index = -1 + 6)
    private Integer avginterferingnoiseonprb00Dbmw;

    @TableField("avgInterferingNoiseOnPRB01_dBmW")
    @ExcelProperty(index = -1 + 7)
    private Integer avginterferingnoiseonprb01Dbmw;

    @TableField("avgInterferingNoiseOnPRB02_dBmW")
    @ExcelProperty(index = -1 + 8)
    private Integer avginterferingnoiseonprb02Dbmw;

    @TableField("avgInterferingNoiseOnPRB03_dBmW")
    @ExcelProperty(index = -1 + 9)
    private Integer avginterferingnoiseonprb03Dbmw;

    @TableField("avgInterferingNoiseOnPRB04_dBmW")
    @ExcelProperty(index = -1 + 10)
    private Integer avginterferingnoiseonprb04Dbmw;

    @TableField("avgInterferingNoiseOnPRB05_dBmW")
    @ExcelProperty(index = -1 + 11)
    private Integer avginterferingnoiseonprb05Dbmw;

    @TableField("avgInterferingNoiseOnPRB06_dBmW")
    @ExcelProperty(index = -1 + 12)
    private Integer avginterferingnoiseonprb06Dbmw;

    @TableField("avgInterferingNoiseOnPRB07_dBmW")
    @ExcelProperty(index = -1 + 13)
    private Integer avginterferingnoiseonprb07Dbmw;

    @TableField("avgInterferingNoiseOnPRB08_dBmW")
    @ExcelProperty(index = -1 + 14)
    private Integer avginterferingnoiseonprb08Dbmw;

    @TableField("avgInterferingNoiseOnPRB09_dBmW")
    @ExcelProperty(index = -1 + 15)
    private Integer avginterferingnoiseonprb09Dbmw;

    @TableField("avgInterferingNoiseOnPRB10_dBmW")
    @ExcelProperty(index = -1 + 16)
    private Integer avginterferingnoiseonprb10Dbmw;

    @TableField("avgInterferingNoiseOnPRB11_dBmW")
    @ExcelProperty(index = -1 + 17)
    private Integer avginterferingnoiseonprb11Dbmw;

    @TableField("avgInterferingNoiseOnPRB12_dBmW")
    @ExcelProperty(index = -1 + 18)
    private Integer avginterferingnoiseonprb12Dbmw;

    @TableField("avgInterferingNoiseOnPRB13_dBmW")
    @ExcelProperty(index = -1 + 19)
    private Integer avginterferingnoiseonprb13Dbmw;

    @TableField("avgInterferingNoiseOnPRB14_dBmW")
    @ExcelProperty(index = -1 + 20)
    private Integer avginterferingnoiseonprb14Dbmw;

    @TableField("avgInterferingNoiseOnPRB15_dBmW")
    @ExcelProperty(index = -1 + 21)
    private Integer avginterferingnoiseonprb15Dbmw;

    @TableField("avgInterferingNoiseOnPRB16_dBmW")
    @ExcelProperty(index = -1 + 22)
    private Integer avginterferingnoiseonprb16Dbmw;

    @TableField("avgInterferingNoiseOnPRB17_dBmW")
    @ExcelProperty(index = -1 + 23)
    private Integer avginterferingnoiseonprb17Dbmw;

    @TableField("avgInterferingNoiseOnPRB18_dBmW")
    @ExcelProperty(index = -1 + 24)
    private Integer avginterferingnoiseonprb18Dbmw;

    @TableField("avgInterferingNoiseOnPRB19_dBmW")
    @ExcelProperty(index = -1 + 25)
    private Integer avginterferingnoiseonprb19Dbmw;

    @TableField("avgInterferingNoiseOnPRB20_dBmW")
    @ExcelProperty(index = -1 + 26)
    private Integer avginterferingnoiseonprb20Dbmw;

    @TableField("avgInterferingNoiseOnPRB21_dBmW")
    @ExcelProperty(index = -1 + 27)
    private Integer avginterferingnoiseonprb21Dbmw;

    @TableField("avgInterferingNoiseOnPRB22_dBmW")
    @ExcelProperty(index = -1 + 28)
    private Integer avginterferingnoiseonprb22Dbmw;

    @TableField("avgInterferingNoiseOnPRB23_dBmW")
    @ExcelProperty(index = -1 + 29)
    private Integer avginterferingnoiseonprb23Dbmw;

    @TableField("avgInterferingNoiseOnPRB24_dBmW")
    @ExcelProperty(index = -1 + 30)
    private Integer avginterferingnoiseonprb24Dbmw;

    @TableField("avgInterferingNoiseOnPRB25_dBmW")
    @ExcelProperty(index = -1 + 31)
    private Integer avginterferingnoiseonprb25Dbmw;

    @TableField("avgInterferingNoiseOnPRB26_dBmW")
    @ExcelProperty(index = -1 + 32)
    private Integer avginterferingnoiseonprb26Dbmw;

    @TableField("avgInterferingNoiseOnPRB27_dBmW")
    @ExcelProperty(index = -1 + 33)
    private Integer avginterferingnoiseonprb27Dbmw;

    @TableField("avgInterferingNoiseOnPRB28_dBmW")
    @ExcelProperty(index = -1 + 34)
    private Integer avginterferingnoiseonprb28Dbmw;

    @TableField("avgInterferingNoiseOnPRB29_dBmW")
    @ExcelProperty(index = -1 + 35)
    private Integer avginterferingnoiseonprb29Dbmw;

    @TableField("avgInterferingNoiseOnPRB30_dBmW")
    @ExcelProperty(index = -1 + 36)
    private Integer avginterferingnoiseonprb30Dbmw;

    @TableField("avgInterferingNoiseOnPRB31_dBmW")
    @ExcelProperty(index = -1 + 37)
    private Integer avginterferingnoiseonprb31Dbmw;

    @TableField("avgInterferingNoiseOnPRB32_dBmW")
    @ExcelProperty(index = -1 + 38)
    private Integer avginterferingnoiseonprb32Dbmw;

    @TableField("avgInterferingNoiseOnPRB33_dBmW")
    @ExcelProperty(index = -1 + 39)
    private Integer avginterferingnoiseonprb33Dbmw;

    @TableField("avgInterferingNoiseOnPRB34_dBmW")
    @ExcelProperty(index = -1 + 40)
    private Integer avginterferingnoiseonprb34Dbmw;

    @TableField("avgInterferingNoiseOnPRB35_dBmW")
    @ExcelProperty(index = -1 + 41)
    private Integer avginterferingnoiseonprb35Dbmw;

    @TableField("avgInterferingNoiseOnPRB36_dBmW")
    @ExcelProperty(index = -1 + 42)
    private Integer avginterferingnoiseonprb36Dbmw;

    @TableField("avgInterferingNoiseOnPRB37_dBmW")
    @ExcelProperty(index = -1 + 43)
    private Integer avginterferingnoiseonprb37Dbmw;

    @TableField("avgInterferingNoiseOnPRB38_dBmW")
    @ExcelProperty(index = -1 + 44)
    private Integer avginterferingnoiseonprb38Dbmw;

    @TableField("avgInterferingNoiseOnPRB39_dBmW")
    @ExcelProperty(index = -1 + 45)
    private Integer avginterferingnoiseonprb39Dbmw;

    @TableField("avgInterferingNoiseOnPRB40_dBmW")
    @ExcelProperty(index = -1 + 46)
    private Integer avginterferingnoiseonprb40Dbmw;

    @TableField("avgInterferingNoiseOnPRB41_dBmW")
    @ExcelProperty(index = -1 + 47)
    private Integer avginterferingnoiseonprb41Dbmw;

    @TableField("avgInterferingNoiseOnPRB42_dBmW")
    @ExcelProperty(index = -1 + 48)
    private Integer avginterferingnoiseonprb42Dbmw;

    @TableField("avgInterferingNoiseOnPRB43_dBmW")
    @ExcelProperty(index = -1 + 49)
    private Integer avginterferingnoiseonprb43Dbmw;

    @TableField("avgInterferingNoiseOnPRB44_dBmW")
    @ExcelProperty(index = -1 + 50)
    private Integer avginterferingnoiseonprb44Dbmw;

    @TableField("avgInterferingNoiseOnPRB45_dBmW")
    @ExcelProperty(index = -1 + 51)
    private Integer avginterferingnoiseonprb45Dbmw;

    @TableField("avgInterferingNoiseOnPRB46_dBmW")
    @ExcelProperty(index = -1 + 52)
    private Integer avginterferingnoiseonprb46Dbmw;

    @TableField("avgInterferingNoiseOnPRB47_dBmW")
    @ExcelProperty(index = -1 + 53)
    private Integer avginterferingnoiseonprb47Dbmw;

    @TableField("avgInterferingNoiseOnPRB48_dBmW")
    @ExcelProperty(index = -1 + 54)
    private Integer avginterferingnoiseonprb48Dbmw;

    @TableField("avgInterferingNoiseOnPRB49_dBmW")
    @ExcelProperty(index = -1 + 55)
    private Integer avginterferingnoiseonprb49Dbmw;

    @TableField("avgInterferingNoiseOnPRB50_dBmW")
    @ExcelProperty(index = -1 + 56)
    private Integer avginterferingnoiseonprb50Dbmw;

    @TableField("avgInterferingNoiseOnPRB51_dBmW")
    @ExcelProperty(index = -1 + 57)
    private Integer avginterferingnoiseonprb51Dbmw;

    @TableField("avgInterferingNoiseOnPRB52_dBmW")
    @ExcelProperty(index = -1 + 58)
    private Integer avginterferingnoiseonprb52Dbmw;

    @TableField("avgInterferingNoiseOnPRB53_dBmW")
    @ExcelProperty(index = -1 + 59)
    private Integer avginterferingnoiseonprb53Dbmw;

    @TableField("avgInterferingNoiseOnPRB54_dBmW")
    @ExcelProperty(index = -1 + 60)
    private Integer avginterferingnoiseonprb54Dbmw;

    @TableField("avgInterferingNoiseOnPRB55_dBmW")
    @ExcelProperty(index = -1 + 61)
    private Integer avginterferingnoiseonprb55Dbmw;

    @TableField("avgInterferingNoiseOnPRB56_dBmW")
    @ExcelProperty(index = -1 + 62)
    private Integer avginterferingnoiseonprb56Dbmw;

    @TableField("avgInterferingNoiseOnPRB57_dBmW")
    @ExcelProperty(index = -1 + 63)
    private Integer avginterferingnoiseonprb57Dbmw;

    @TableField("avgInterferingNoiseOnPRB58_dBmW")
    @ExcelProperty(index = -1 + 64)
    private Integer avginterferingnoiseonprb58Dbmw;

    @TableField("avgInterferingNoiseOnPRB59_dBmW")
    @ExcelProperty(index = -1 + 65)
    private Integer avginterferingnoiseonprb59Dbmw;

    @TableField("avgInterferingNoiseOnPRB60_dBmW")
    @ExcelProperty(index = -1 + 66)
    private Integer avginterferingnoiseonprb60Dbmw;

    @TableField("avgInterferingNoiseOnPRB61_dBmW")
    @ExcelProperty(index = -1 + 67)
    private Integer avginterferingnoiseonprb61Dbmw;

    @TableField("avgInterferingNoiseOnPRB62_dBmW")
    @ExcelProperty(index = -1 + 68)
    private Integer avginterferingnoiseonprb62Dbmw;

    @TableField("avgInterferingNoiseOnPRB63_dBmW")
    @ExcelProperty(index = -1 + 69)
    private Integer avginterferingnoiseonprb63Dbmw;

    @TableField("avgInterferingNoiseOnPRB64_dBmW")
    @ExcelProperty(index = -1 + 70)
    private Integer avginterferingnoiseonprb64Dbmw;

    @TableField("avgInterferingNoiseOnPRB65_dBmW")
    @ExcelProperty(index = -1 + 71)
    private Integer avginterferingnoiseonprb65Dbmw;

    @TableField("avgInterferingNoiseOnPRB66_dBmW")
    @ExcelProperty(index = -1 + 72)
    private Integer avginterferingnoiseonprb66Dbmw;

    @TableField("avgInterferingNoiseOnPRB67_dBmW")
    @ExcelProperty(index = -1 + 73)
    private Integer avginterferingnoiseonprb67Dbmw;

    @TableField("avgInterferingNoiseOnPRB68_dBmW")
    @ExcelProperty(index = -1 + 74)
    private Integer avginterferingnoiseonprb68Dbmw;

    @TableField("avgInterferingNoiseOnPRB69_dBmW")
    @ExcelProperty(index = -1 + 75)
    private Integer avginterferingnoiseonprb69Dbmw;

    @TableField("avgInterferingNoiseOnPRB70_dBmW")
    @ExcelProperty(index = -1 + 76)
    private Integer avginterferingnoiseonprb70Dbmw;

    @TableField("avgInterferingNoiseOnPRB71_dBmW")
    @ExcelProperty(index = -1 + 77)
    private Integer avginterferingnoiseonprb71Dbmw;

    @TableField("avgInterferingNoiseOnPRB72_dBmW")
    @ExcelProperty(index = -1 + 78)
    private Integer avginterferingnoiseonprb72Dbmw;

    @TableField("avgInterferingNoiseOnPRB73_dBmW")
    @ExcelProperty(index = -1 + 79)
    private Integer avginterferingnoiseonprb73Dbmw;

    @TableField("avgInterferingNoiseOnPRB74_dBmW")
    @ExcelProperty(index = -1 + 80)
    private Integer avginterferingnoiseonprb74Dbmw;

    @TableField("avgInterferingNoiseOnPRB75_dBmW")
    @ExcelProperty(index = -1 + 81)
    private Integer avginterferingnoiseonprb75Dbmw;

    @TableField("avgInterferingNoiseOnPRB76_dBmW")
    @ExcelProperty(index = -1 + 82)
    private Integer avginterferingnoiseonprb76Dbmw;

    @TableField("avgInterferingNoiseOnPRB77_dBmW")
    @ExcelProperty(index = -1 + 83)
    private Integer avginterferingnoiseonprb77Dbmw;

    @TableField("avgInterferingNoiseOnPRB78_dBmW")
    @ExcelProperty(index = -1 + 84)
    private Integer avginterferingnoiseonprb78Dbmw;

    @TableField("avgInterferingNoiseOnPRB79_dBmW")
    @ExcelProperty(index = -1 + 85)
    private Integer avginterferingnoiseonprb79Dbmw;

    @TableField("avgInterferingNoiseOnPRB80_dBmW")
    @ExcelProperty(index = -1 + 86)
    private Integer avginterferingnoiseonprb80Dbmw;

    @TableField("avgInterferingNoiseOnPRB81_dBmW")
    @ExcelProperty(index = -1 + 87)
    private Integer avginterferingnoiseonprb81Dbmw;

    @TableField("avgInterferingNoiseOnPRB82_dBmW")
    @ExcelProperty(index = -1 + 88)
    private Integer avginterferingnoiseonprb82Dbmw;

    @TableField("avgInterferingNoiseOnPRB83_dBmW")
    @ExcelProperty(index = -1 + 89)
    private Integer avginterferingnoiseonprb83Dbmw;

    @TableField("avgInterferingNoiseOnPRB84_dBmW")
    @ExcelProperty(index = -1 + 90)
    private Integer avginterferingnoiseonprb84Dbmw;

    @TableField("avgInterferingNoiseOnPRB85_dBmW")
    @ExcelProperty(index = -1 + 91)
    private Integer avginterferingnoiseonprb85Dbmw;

    @TableField("avgInterferingNoiseOnPRB86_dBmW")
    @ExcelProperty(index = -1 + 92)
    private Integer avginterferingnoiseonprb86Dbmw;

    @TableField("avgInterferingNoiseOnPRB87_dBmW")
    @ExcelProperty(index = -1 + 93)
    private Integer avginterferingnoiseonprb87Dbmw;

    @TableField("avgInterferingNoiseOnPRB88_dBmW")
    @ExcelProperty(index = -1 + 94)
    private Integer avginterferingnoiseonprb88Dbmw;

    @TableField("avgInterferingNoiseOnPRB89_dBmW")
    @ExcelProperty(index = -1 + 95)
    private Integer avginterferingnoiseonprb89Dbmw;

    @TableField("avgInterferingNoiseOnPRB90_dBmW")
    @ExcelProperty(index = -1 + 96)
    private Integer avginterferingnoiseonprb90Dbmw;

    @TableField("avgInterferingNoiseOnPRB91_dBmW")
    @ExcelProperty(index = -1 + 97)
    private Integer avginterferingnoiseonprb91Dbmw;

    @TableField("avgInterferingNoiseOnPRB92_dBmW")
    @ExcelProperty(index = -1 + 98)
    private Integer avginterferingnoiseonprb92Dbmw;

    @TableField("avgInterferingNoiseOnPRB93_dBmW")
    @ExcelProperty(index = -1 + 99)
    private Integer avginterferingnoiseonprb93Dbmw;

    @TableField("avgInterferingNoiseOnPRB94_dBmW")
    @ExcelProperty(index = -1 + 100)
    private Integer avginterferingnoiseonprb94Dbmw;

    @TableField("avgInterferingNoiseOnPRB95_dBmW")
    @ExcelProperty(index = -1 + 101)
    private Integer avginterferingnoiseonprb95Dbmw;

    @TableField("avgInterferingNoiseOnPRB96_dBmW")
    @ExcelProperty(index = -1 + 102)
    private Integer avginterferingnoiseonprb96Dbmw;

    @TableField("avgInterferingNoiseOnPRB97_dBmW")
    @ExcelProperty(index = -1 + 103)
    private Integer avginterferingnoiseonprb97Dbmw;

    @TableField("avgInterferingNoiseOnPRB98_dBmW")
    @ExcelProperty(index = -1 + 104)
    private Integer avginterferingnoiseonprb98Dbmw;

    @TableField("avgInterferingNoiseOnPRB99_dBmW")
    @ExcelProperty(index = -1 + 105)
    private Integer avginterferingnoiseonprb99Dbmw;
}
