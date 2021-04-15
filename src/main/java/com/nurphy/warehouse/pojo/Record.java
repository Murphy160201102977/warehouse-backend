package com.nurphy.warehouse.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * record
 * @author 
 */
@ApiModel(value="com.nurphy.warehouse.pojo.Record")
@Data
public class Record implements Serializable {
    private Integer id;

    private Integer cardId;

    private Integer storeId;

    /**
     * 出/入库数量
     */
    @ApiModelProperty(value="出/入库数量")
    private Integer number;

    /**
     * 0:出库
     * 1：入库 0:出库
     */
    @ApiModelProperty(value="0:出库 1：入库 0:出库")
    private Byte type;

    private String userId;

    private Date createdDate;

    private Date updatedDate;

    private static final long serialVersionUID = 1L;
}