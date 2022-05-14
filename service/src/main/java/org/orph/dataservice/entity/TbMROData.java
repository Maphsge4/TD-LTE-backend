package org.orph.dataservice.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("tbMROData")
@ApiModel(value = "TbMROData对象", description = "")
public class TbMROData implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ExcelProperty(value = "id", index = 0)
    private Integer id;

    @TableField("TimeStamp")
    @ExcelProperty(value = "timeStamp", index = 1)
    private String timeStamp;

    @TableField("ServingSector")
    @ExcelProperty(value = "servingSector", index = 2)
    private String servingSector;

    @TableField("InterferingSector")
    @ExcelProperty(value = "interferingSector", index = 3)
    private String interferingSector;

    @TableField("LteScRSRP")
    @ExcelProperty(value = "lteScRSRP", index = 4)
    private Float lteScRSRP;

    @TableField("LteNcRSRP")
    @ExcelProperty(value = "lteNcRSRP", index = 5)
    private Float lteNcRSRP;

    @TableField("LteNcEarfcn")
    @ExcelProperty(value = "lteNcEarfcn", index = 6)
    private Integer lteNcEarfcn;

    @TableField("LteNcPci")
    @ExcelProperty(value = "lteNcPci", index = 7)
    private Integer lteNcPci;

    @TableField("rsrpDiff")
    @ExcelProperty(value = "rsrpDiff", index = 8)
    private Float rsrpDiff;

    @TableField(exist = false)
    @ExcelProperty(value = "avgDiff", index = 9)
    private Float avgDiff;

    @TableField(exist = false)
    @ExcelProperty(value = "stdDiff", index = 10)
    private Float stdDiff;

    @TableField(exist = false)
    @ExcelProperty(value = "count", index = 11)
    private Float count;
}
