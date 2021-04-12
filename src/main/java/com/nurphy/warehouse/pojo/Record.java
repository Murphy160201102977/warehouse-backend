package com.nurphy.warehouse.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import javax.persistence.*;

@Table(name = "warehouse..record")
@Getter
@Setter
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "card_id")
    private Integer cardId;

    @Column(name = "store_id")
    private Integer storeId;

    /**
     * 出/入库数量
     */
    private Integer number;

    /**
     * 0:出库
1：入库 0:出库
     */
    private Byte type;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "updated_date")
    private Date updatedDate;
}