package com.nurphy.warehouse.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import javax.persistence.*;

@Table(name = "warehouse..card")
@Getter
@Setter
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 类型名
     */
    private String name;

    /**
     * 芯片
     */
    private String chip;

    /**
     * 材料
     */
    private String material;

    /**
     * 行业
     */
    private String industry;

    @Column(name = "supplier_id")
    private Integer supplierId;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "updated_date")
    private Date updatedDate;
}