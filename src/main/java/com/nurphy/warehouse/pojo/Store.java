package com.nurphy.warehouse.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import javax.persistence.*;

@Table(name = "warehouse..store")
@Getter
@Setter
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String address;

    @Column(name = "charge_person")
    private String chargePerson;

    @Column(name = "charge_phone")
    private String chargePhone;

    /**
     * 0：正常
1：停用
2：满

     */
    private Byte status;

    private Integer num;

    @Column(name = "now_num")
    private Integer nowNum;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "updated_date")
    private Date updatedDate;
}