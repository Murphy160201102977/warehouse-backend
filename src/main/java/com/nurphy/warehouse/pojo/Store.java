package com.nurphy.warehouse.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * store
 * @author 
 */
@ApiModel(value="com.nurphy.warehouse.pojo.Store")
@Data
public class Store implements Serializable {
    private Integer id;

    private String name;

    private String address;

    private String chargePerson;

    private String chargePhone;

    @ApiModelProperty(value="0：正常 1：停用 2：满 ")
    private Byte status;

    private Integer num;

    private Integer nowNum;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private static final long serialVersionUID = 1L;

}