package org.orph.dataservice.importData;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;



@Data
public class TbCellKPIData {

//    @ExcelProperty(index = -1 + 0)
    private Integer id;

    @ExcelProperty(index = -1 + 1)
    private String startTime;

    @ExcelProperty(index = -1 + 2)
    private String enodebName;

    @ExcelProperty(index = -1 + 3)
    private String sectorDescription;

    @ExcelProperty(index = -1 + 4)
    private String sectorName;

    @ExcelProperty(index = -1 + 5)
    private Integer rrcComplete;

    @ExcelProperty(index = -1 + 6)
    private Integer rrcRequest;

    @ExcelProperty(index = -1 + 7)
    private Float rrcSuccessPer;

    @ExcelProperty(index = -1 + 8)
    private Integer erabSuccess;

    @ExcelProperty(index = -1 + 9)
    private Integer erabTry;

    @ExcelProperty(index = -1 + 10)
    private Double erabSuccessPer;

    @ExcelProperty(index = -1 + 11)
    private Integer enodebTringErabException;

    @ExcelProperty(index = -1 + 12)
    private Integer sectorSwitchOutErabException;

    @ExcelProperty(index = -1 + 13)
    private Double erabOfflinePer;

    @ExcelProperty(index = -1 + 14)
    private Double wirelessOnlinePer;

    @ExcelProperty(index = -1 + 15)
    private Integer enodebS1ResetUeContextRelease;

    @ExcelProperty(index = -1 + 16)
    private Integer ueContextException;

    @ExcelProperty(index = -1 + 17)
    private Integer ueContextSuccess;

    @ExcelProperty(index = -1 + 18)
    private Double wirelessOfflinePer;

    @ExcelProperty(index = -1 + 19)
    private Integer enodebInDiffFreqSwitchOutSuccess;

    @ExcelProperty(index = -1 + 20)
    private Integer enodebInDiffFreqSwitchOutTry;

    @ExcelProperty(index = -1 + 21)
    private Integer enodebInSameFreqSwitchOutSuccess;

    @ExcelProperty(index = -1 + 22)
    private Integer enodebInSameFreqSwitchOutTry;

    @ExcelProperty(index = -1 + 23)
    private Integer enodebBetweenDiffFreqSwitchOutSuccess;

    @ExcelProperty(index = -1 + 24)
    private Integer enodebBetweenDiffFreqSwitchOutTry;

    @ExcelProperty(index = -1 + 25)
    private Integer enodebBetweenSameFreqSwitchOutSuccess;

    @ExcelProperty(index = -1 + 26)
    private Integer enodebBetweenSameFreqSwitchOutTry;

    @ExcelProperty(index = -1 + 27)
    private Double enbInSwitchSuccessPer;

    @ExcelProperty(index = -1 + 28)
    private Double enbBetweenSwitchSuccessPer;

    @ExcelProperty(index = -1 + 29)
    private Double sameFreqSwitchSuccessPer;

    @ExcelProperty(index = -1 + 30)
    private Double diffFreqSwitchSuccessPer;

    @ExcelProperty(index = -1 + 31)
    private Double switchSuccessPer;

    @ExcelProperty(index = -1 + 32)
    private Long sectorPdcpLayerRecvUploadThroughputBit;

    @ExcelProperty(index = -1 + 33)
    private Long sectorPdcpLayerSendDnloadThroughputBit;

    @ExcelProperty(index = -1 + 34)
    private Integer rrcReconnect;

    @ExcelProperty(index = -1 + 35)
    private Double rrcReconnectPer;

    @ExcelProperty(index = -1 + 36)
    private Integer throughRebuildBackEnodebBeteeenSameFreqSwitchOutSuccess;

    @ExcelProperty(index = -1 + 37)
    private Integer throughRebuildBackEnodebBeteeenDiffFreqSwitchOutSuccess;

    @ExcelProperty(index = -1 + 38)
    private Integer throughRebuildBackEnodebInSameFreqSwitchOutSuccess;

    @ExcelProperty(index = -1 + 39)
    private Integer throughRebuildBackEnodebInDiffFreqSwitchOutSuccess;

    @ExcelProperty(index = -1 + 40)
    private Integer enbInSwitchOutSuccess;

    @ExcelProperty(index = -1 + 41)
    private Integer enbInSwitchOutTry;

    public boolean check() {
        return (sectorName != null && sectorDescription != null);
    }
}
