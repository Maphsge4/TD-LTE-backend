package org.orph.dataservice.importData;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class TbCellKPIData {

    @ExcelProperty(index = 0)
    private Integer id;

    @ExcelProperty(index = 1)
    private String startTime;

    @ExcelProperty(index = 2)
    private String enodebName;

    @ExcelProperty(index = 3)
    private String sectorDescription;

    @ExcelProperty(index = 4)
    private String sectorName;

    @ExcelProperty(index = 5)
    private Integer rrcComplete;

    @ExcelProperty(index = 6)
    private Integer rrcRequest;

    @ExcelProperty(index = 7)
    private Float rrcSuccessPer;

    @ExcelProperty(index = 8)
    private Integer erabSuccess;

    @ExcelProperty(index = 9)
    private Integer erabTry;

    @ExcelProperty(index = 10)
    private Double erabSuccessPer;

    @ExcelProperty(index = 11)
    private Integer enodebTringErabException;

    @ExcelProperty(index = 12)
    private Integer sectorSwitchOutErabException;

    @ExcelProperty(index = 13)
    private Double erabOfflinePer;

    @ExcelProperty(index = 14)
    private Double wirelessOnlinePer;

    @ExcelProperty(index = 15)
    private Integer enodebS1ResetUeContextRelease;

    @ExcelProperty(index = 16)
    private Integer ueContextException;

    @ExcelProperty(index = 17)
    private Integer ueContextSuccess;

    @ExcelProperty(index = 18)
    private Double wirelessOfflinePer;

    @ExcelProperty(index = 19)
    private Integer enodebInDiffFreqSwitchOutSuccess;

    @ExcelProperty(index = 20)
    private Integer enodebInDiffFreqSwitchOutTry;

    @ExcelProperty(index = 21)
    private Integer enodebInSameFreqSwitchOutSuccess;

    @ExcelProperty(index = 22)
    private Integer enodebInSameFreqSwitchOutTry;

    @ExcelProperty(index = 23)
    private Integer enodebBetweenDiffFreqSwitchOutSuccess;

    @ExcelProperty(index = 24)
    private Integer enodebBetweenDiffFreqSwitchOutTry;

    @ExcelProperty(index = 25)
    private Integer enodebBetweenSameFreqSwitchOutSuccess;

    @ExcelProperty(index = 26)
    private Integer enodebBetweenSameFreqSwitchOutTry;

    @ExcelProperty(index = 27)
    private Double enbInSwitchSuccessPer;

    @ExcelProperty(index = 28)
    private Double enbBetweenSwitchSuccessPer;

    @ExcelProperty(index = 29)
    private Double sameFreqSwitchSuccessPer;

    @ExcelProperty(index = 30)
    private Double diffFreqSwitchSuccessPer;

    @ExcelProperty(index = 31)
    private Double switchSuccessPer;

    @ExcelProperty(index = 32)
    private Long sectorPdcpLayerRecvUploadThroughputBit;

    @ExcelProperty(index = 33)
    private Long sectorPdcpLayerSendDnloadThroughputBit;

    @ExcelProperty(index = 34)
    private Integer rrcReconnect;

    @ExcelProperty(index = 35)
    private Double rrcReconnectPer;

    @ExcelProperty(index = 36)
    private Integer throughRebuildBackEnodebBeteeenSameFreqSwitchOutSuccess;

    @ExcelProperty(index = 37)
    private Integer throughRebuildBackEnodebBeteeenDiffFreqSwitchOutSuccess;

    @ExcelProperty(index = 38)
    private Integer throughRebuildBackEnodebInSameFreqSwitchOutSuccess;

    @ExcelProperty(index = 39)
    private Integer throughRebuildBackEnodebInDiffFreqSwitchOutSuccess;

    @ExcelProperty(index = 40)
    private Integer enbInSwitchOutSuccess;

    @ExcelProperty(index = 41)
    private Integer enbInSwitchOutTry;

    public boolean check() {
        return (sectorName != null && sectorDescription != null);
    }
}
