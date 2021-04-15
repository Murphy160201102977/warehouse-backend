package com.nurphy.warehouse.mapper;

import com.nurphy.warehouse.pojo.Stock;
import org.springframework.stereotype.Repository;

@Repository
public interface StockMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);
}