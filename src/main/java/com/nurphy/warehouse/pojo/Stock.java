package com.nurphy.warehouse.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * stock
 * @author 
 */
@ApiModel(value="com.nurphy.warehouse.pojo.Stock")
@Data
public class Stock implements Serializable {
    private Integer id;

    private Integer cardId;

    private Integer storeId;

    private Integer number;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private static final long serialVersionUID = 1L;
}