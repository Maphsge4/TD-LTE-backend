package org.orph.dataservice.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tbCellKPI")
@ApiModel(value="TbCellKPI对象")
public class TbCellKPI implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ExcelProperty(value = "id", index = 0)
    private Integer id;

    @TableField("StartTime")
    @ExcelProperty(value = "startTime", index = 1)
    private Date startTime;

    @TableField("ENODEB_NAME")
    @ExcelProperty(value = "enodebName", index = 2)
    private String enodebName;

    @TableField("SECTOR_DESCRIPTION")
    @ExcelProperty(value = "sectorDescription", index = 3)
    private String sectorDescription;

    @TableField("SECTOR_NAME")
    @ExcelProperty(value = "sectorName", index = 4)
    private String sectorName;

    @TableField("RRC_COMPLETE")
    @ExcelProperty(value = "rrcComplete", index = 5)
    private Integer rrcComplete;

    @TableField("RRC_REQUEST")
    @ExcelProperty(value = "rrcRequest", index = 6)
    private Integer rrcRequest;

    @TableField("RRC_SUCCESS_PER")
    @ExcelProperty(value = "rrcSuccessPer", index = 7)
    private Float rrcSuccessPer;

    @TableField("ERAB_SUCCESS")
    @ExcelProperty(value = "erabSuccess", index = 8)
    private Integer erabSuccess;

    @TableField("ERAB_TRY")
    @ExcelProperty(value = "erabTry", index = 9)
    private Integer erabTry;

    @TableField("ERAB_SUCCESS_PER")
    @ExcelProperty(value = "erabSuccessPer", index = 10)
    private Double erabSuccessPer;

    @TableField("eNodeB_TRING_ERAB_EXCEPTION")
    @ExcelProperty(value = "enodebTringErabException", index = 11)
    private Integer enodebTringErabException;

    @TableField("SECTOR_SWITCH_OUT_ERAB_EXCEPTION")
    @ExcelProperty(value = "sectorSwitchOutErabException", index = 12)
    private Integer sectorSwitchOutErabException;

    @TableField("ERAB_OFFLINE_PER")
    @ExcelProperty(value = "erabOfflinePer", index = 13)
    private Double erabOfflinePer;

    @TableField("WIRELESS_ONLINE_PER")
    @ExcelProperty(value = "wirelessOnlinePer", index = 14)
    private Double wirelessOnlinePer;

    @TableField("eNodeB_S1_RESET_UE_Context_RELEASE")
    @ExcelProperty(value = "enodebS1ResetUeContextRelease", index = 15)
    private Integer enodebS1ResetUeContextRelease;

    @TableField("UE_Context_EXCEPTION")
    @ExcelProperty(value = "ueContextException", index = 16)
    private Integer ueContextException;

    @TableField("UE_Context_SUCCESS")
    @ExcelProperty(value = "ueContextSuccess", index = 17)
    private Integer ueContextSuccess;

    @TableField("WIRELESS_OFFLINE_PER")
    @ExcelProperty(value = "wirelessOfflinePer", index = 18)
    private Double wirelessOfflinePer;

    @TableField("eNodeB_IN_DIFF_FREQ_SWITCH_OUT_SUCCESS")
    @ExcelProperty(value = "enodebInDiffFreqSwitchOutSuccess", index = 19)
    private Integer enodebInDiffFreqSwitchOutSuccess;

    @TableField("eNodeB_IN_DIFF_FREQ_SWITCH_OUT_TRY")
    @ExcelProperty(value = "enodebInDiffFreqSwitchOutTry", index = 20)
    private Integer enodebInDiffFreqSwitchOutTry;

    @TableField("eNodeB_IN_SAME_FREQ_SWITCH_OUT_SUCCESS")
    @ExcelProperty(value = "enodebInSameFreqSwitchOutSuccess", index = 21)
    private Integer enodebInSameFreqSwitchOutSuccess;

    @TableField("eNodeB_IN_SAME_FREQ_SWITCH_OUT_TRY")
    @ExcelProperty(value = "enodebInSameFreqSwitchOutTry", index = 22)
    private Integer enodebInSameFreqSwitchOutTry;

    @TableField("eNodeB_BETWEEN_DIFF_FREQ_SWITCH_OUT_SUCCESS")
    @ExcelProperty(value = "enodebBetweenDiffFreqSwitchOutSuccess", index = 23)
    private Integer enodebBetweenDiffFreqSwitchOutSuccess;

    @TableField("eNodeB_BETWEEN_DIFF_FREQ_SWITCH_OUT_TRY")
    @ExcelProperty(value = "enodebBetweenDiffFreqSwitchOutTry", index = 24)
    private Integer enodebBetweenDiffFreqSwitchOutTry;

    @TableField("eNodeB_BETWEEN_SAME_FREQ_SWITCH_OUT_SUCCESS")
    @ExcelProperty(value = "enodebBetweenSameFreqSwitchOutSuccess", index = 25)
    private Integer enodebBetweenSameFreqSwitchOutSuccess;

    @TableField("eNodeB_BETWEEN_SAME_FREQ_SWITCH_OUT_TRY")
    @ExcelProperty(value = "enodebBetweenSameFreqSwitchOutTry", index = 26)
    private Integer enodebBetweenSameFreqSwitchOutTry;

    @TableField("eNB_IN_SWITCH_SUCCESS_PER")
    @ExcelProperty(value = "enbInSwitchSuccessPer", index = 27)
    private Double enbInSwitchSuccessPer;

    @TableField("eNB_BETWEEN_SWITCH_SUCCESS_PER")
    @ExcelProperty(value = "enbBetweenSwitchSuccessPer", index = 28)
    private Double enbBetweenSwitchSuccessPer;

    @TableField("SAME_FREQ_SWITCH_SUCCESS_PER")
    @ExcelProperty(value = "sameFreqSwitchSuccessPer", index = 29)
    private Double sameFreqSwitchSuccessPer;

    @TableField("DIFF_FREQ_SWITCH_SUCCESS_PER")
    @ExcelProperty(value = "diffFreqSwitchSuccessPer", index = 30)
    private Double diffFreqSwitchSuccessPer;

    @TableField("SWITCH_SUCCESS_PER")
    @ExcelProperty(value = "switchSuccessPer", index = 31)
    private Double switchSuccessPer;

    @TableField("SECTOR_PDCP_LAYER_RECV_UPLOAD_THROUGHPUT_BIT")
    @ExcelProperty(value = "sectorPdcpLayerRecvUploadThroughputBit", index = 32)
    private Long sectorPdcpLayerRecvUploadThroughputBit;

    @TableField("SECTOR_PDCP_LAYER_SEND_DNLOAD_THROUGHPUT_BIT")
    @ExcelProperty(value = "sectorPdcpLayerSendDnloadThroughputBit", index = 33)
    private Long sectorPdcpLayerSendDnloadThroughputBit;

    @TableField("RRC_RECONNECT")
    @ExcelProperty(value = "rrcReconnect", index = 34)
    private Integer rrcReconnect;

    @TableField("RRC_RECONNECT_PER")
    @ExcelProperty(value = "rrcReconnectPer", index = 35)
    private Double rrcReconnectPer;

    @TableField("THROUGH_REBUILD_BACK_eNodeB_BETEEEN_SAME_FREQ_SWITCH_OUT_SUCCESS")
    @ExcelProperty(value = "throughRebuildBackEnodebBeteeenSameFreqSwitchOutSuccess", index = 36)
    private Integer throughRebuildBackEnodebBeteeenSameFreqSwitchOutSuccess;

    @TableField("THROUGH_REBUILD_BACK_eNodeB_BETEEEN_DIFF_FREQ_SWITCH_OUT_SUCCESS")
    @ExcelProperty(value = "throughRebuildBackEnodebBeteeenDiffFreqSwitchOutSuccess", index = 37)
    private Integer throughRebuildBackEnodebBeteeenDiffFreqSwitchOutSuccess;

    @TableField("THROUGH_REBUILD_BACK_eNodeB_IN_SAME_FREQ_SWITCH_OUT_SUCCESS")
    @ExcelProperty(value = "throughRebuildBackEnodebInSameFreqSwitchOutSuccess", index = 38)
    private Integer throughRebuildBackEnodebInSameFreqSwitchOutSuccess;

    @TableField("THROUGH_REBUILD_BACK_eNodeB_IN_DIFF_FREQ_SWITCH_OUT_SUCCESS")
    @ExcelProperty(value = "throughRebuildBackEnodebInDiffFreqSwitchOutSuccess", index = 39)
    private Integer throughRebuildBackEnodebInDiffFreqSwitchOutSuccess;

    @TableField("eNB_IN_SWITCH_OUT_SUCCESS")
    @ExcelProperty(value = "enbInSwitchOutSuccess", index = 40)
    private Integer enbInSwitchOutSuccess;

    @TableField("eNB_IN_SWITCH_OUT_TRY")
    @ExcelProperty(value = "enbInSwitchOutTry", index = 41)
    private Integer enbInSwitchOutTry;
}
