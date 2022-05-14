package org.orph.dataservice.entity;

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
@TableName("tbC2Inew")
@ApiModel(value="TbC2Inew对象", description="")
public class TbC2Inew implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("SCELL")
    private String scell;

    @TableField("NCELL")
    private String ncell;

    @TableField("PrC2I9")
    private Float PrC2I9;

    @TableField("C2I_Mean")
    private Float c2iMean;

    private Float std;

    @TableField("PrbABS6")
    private Float PrbABS6;


}
