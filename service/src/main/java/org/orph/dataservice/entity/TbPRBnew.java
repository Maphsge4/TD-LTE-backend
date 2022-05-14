package org.orph.dataservice.entity;

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
@TableName("tbPRBnew")
@ApiModel(value="TbPRBnew对象", description="")
public class TbPRBnew implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("StartTime")
    private Date startTime;

    @TableField("ENODEB_NAME")
    private String enodebName;

    @TableField("SECTOR_DESCRIPTION")
    private String sectorDescription;

    @TableField("SECTOR_NAME")
    private String sectorName;

    @TableField("prb0")
    private Integer prb00Dbmw;

    @TableField("prb1")
    private Integer prb01Dbmw;

    @TableField("prb2")
    private Integer prb02Dbmw;

    @TableField("prb3")
    private Integer prb03Dbmw;

    @TableField("prb4")
    private Integer prb04Dbmw;

    @TableField("prb5")
    private Integer prb05Dbmw;

    @TableField("prb6")
    private Integer prb06Dbmw;

    @TableField("prb7")
    private Integer prb07Dbmw;

    @TableField("prb8")
    private Integer prb08Dbmw;

    @TableField("prb9")
    private Integer prb09Dbmw;

    @TableField("prb10")
    private Integer prb10Dbmw;

    @TableField("prb11")
    private Integer prb11Dbmw;

    @TableField("prb12")
    private Integer prb12Dbmw;

    @TableField("prb13")
    private Integer prb13Dbmw;

    @TableField("prb14")
    private Integer prb14Dbmw;

    @TableField("prb15")
    private Integer prb15Dbmw;

    @TableField("prb16")
    private Integer prb16Dbmw;

    @TableField("prb17")
    private Integer prb17Dbmw;

    @TableField("prb18")
    private Integer prb18Dbmw;

    @TableField("prb19")
    private Integer prb19Dbmw;

    @TableField("prb20")
    private Integer prb20Dbmw;

    @TableField("prb21")
    private Integer prb21Dbmw;

    @TableField("prb22")
    private Integer prb22Dbmw;

    @TableField("prb23")
    private Integer prb23Dbmw;

    @TableField("prb24")
    private Integer prb24Dbmw;

    @TableField("prb25")
    private Integer prb25Dbmw;

    @TableField("prb26")
    private Integer prb26Dbmw;

    @TableField("prb27")
    private Integer prb27Dbmw;

    @TableField("prb28")
    private Integer prb28Dbmw;

    @TableField("prb29")
    private Integer prb29Dbmw;

    @TableField("prb30")
    private Integer prb30Dbmw;

    @TableField("prb31")
    private Integer prb31Dbmw;

    @TableField("prb32")
    private Integer prb32Dbmw;

    @TableField("prb33")
    private Integer prb33Dbmw;

    @TableField("prb34")
    private Integer prb34Dbmw;

    @TableField("prb35")
    private Integer prb35Dbmw;

    @TableField("prb36")
    private Integer prb36Dbmw;

    @TableField("prb37")
    private Integer prb37Dbmw;

    @TableField("prb38")
    private Integer prb38Dbmw;

    @TableField("prb39")
    private Integer prb39Dbmw;

    @TableField("prb40")
    private Integer prb40Dbmw;

    @TableField("prb41")
    private Integer prb41Dbmw;

    @TableField("prb42")
    private Integer prb42Dbmw;

    @TableField("prb43")
    private Integer prb43Dbmw;

    @TableField("prb44")
    private Integer prb44Dbmw;

    @TableField("prb45")
    private Integer prb45Dbmw;

    @TableField("prb46")
    private Integer prb46Dbmw;

    @TableField("prb47")
    private Integer prb47Dbmw;

    @TableField("prb48")
    private Integer prb48Dbmw;

    @TableField("prb49")
    private Integer prb49Dbmw;

    @TableField("prb50")
    private Integer prb50Dbmw;

    @TableField("prb51")
    private Integer prb51Dbmw;

    @TableField("prb52")
    private Integer prb52Dbmw;

    @TableField("prb53")
    private Integer prb53Dbmw;

    @TableField("prb54")
    private Integer prb54Dbmw;

    @TableField("prb55")
    private Integer prb55Dbmw;

    @TableField("prb56")
    private Integer prb56Dbmw;

    @TableField("prb57")
    private Integer prb57Dbmw;

    @TableField("prb58")
    private Integer prb58Dbmw;

    @TableField("prb59")
    private Integer prb59Dbmw;

    @TableField("prb60")
    private Integer prb60Dbmw;

    @TableField("prb61")
    private Integer prb61Dbmw;

    @TableField("prb62")
    private Integer prb62Dbmw;

    @TableField("prb63")
    private Integer prb63Dbmw;

    @TableField("prb64")
    private Integer prb64Dbmw;

    @TableField("prb65")
    private Integer prb65Dbmw;

    @TableField("prb66")
    private Integer prb66Dbmw;

    @TableField("prb67")
    private Integer prb67Dbmw;

    @TableField("prb68")
    private Integer prb68Dbmw;

    @TableField("prb69")
    private Integer prb69Dbmw;

    @TableField("prb70")
    private Integer prb70Dbmw;

    @TableField("prb71")
    private Integer prb71Dbmw;

    @TableField("prb72")
    private Integer prb72Dbmw;

    @TableField("prb73")
    private Integer prb73Dbmw;

    @TableField("prb74")
    private Integer prb74Dbmw;

    @TableField("prb75")
    private Integer prb75Dbmw;

    @TableField("prb76")
    private Integer prb76Dbmw;

    @TableField("prb77")
    private Integer prb77Dbmw;

    @TableField("prb78")
    private Integer prb78Dbmw;

    @TableField("prb79")
    private Integer prb79Dbmw;

    @TableField("prb80")
    private Integer prb80Dbmw;

    @TableField("prb81")
    private Integer prb81Dbmw;

    @TableField("prb82")
    private Integer prb82Dbmw;

    @TableField("prb83")
    private Integer prb83Dbmw;

    @TableField("prb84")
    private Integer prb84Dbmw;

    @TableField("prb85")
    private Integer prb85Dbmw;

    @TableField("prb86")
    private Integer prb86Dbmw;

    @TableField("prb87")
    private Integer prb87Dbmw;

    @TableField("prb88")
    private Integer prb88Dbmw;

    @TableField("prb89")
    private Integer prb89Dbmw;

    @TableField("prb90")
    private Integer prb90Dbmw;

    @TableField("prb91")
    private Integer prb91Dbmw;

    @TableField("prb92")
    private Integer prb92Dbmw;

    @TableField("prb93")
    private Integer prb93Dbmw;

    @TableField("prb94")
    private Integer prb94Dbmw;

    @TableField("prb95")
    private Integer prb95Dbmw;

    @TableField("prb96")
    private Integer prb96Dbmw;

    @TableField("prb97")
    private Integer prb97Dbmw;

    @TableField("prb98")
    private Integer prb98Dbmw;

    @TableField("prb99")
    private Integer prb99Dbmw;


}
