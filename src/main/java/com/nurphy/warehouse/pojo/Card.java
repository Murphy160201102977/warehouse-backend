package com.nurphy.warehouse.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * card
 * @author 
 */
@ApiModel(value="com.nurphy.warehouse.pojo.Card")
@Data
public class Card implements Serializable {
    private Integer id;

    /**
     * 类型名
     */
    @ApiModelProperty(value="类型名")
    private String name;

    /**
     * 芯片
     */
    @ApiModelProperty(value="芯片")
    private String chip;

    /**
     * 材料
     */
    @ApiModelProperty(value="材料")
    private String material;

    /**
     * 行业
     */
    @ApiModelProperty(value="行业")
    private String industry;

    private Integer supplierId;

    private Date createdDate;

    private Date updatedDate;

    private static final long serialVersionUID = 1L;

}