package com.nurphy.warehouse.mapper;

import com.nurphy.warehouse.pojo.Card;
import org.springframework.stereotype.Repository;

@Repository
public interface CardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Card record);

    int insertSelective(Card record);

    Card selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Card record);

    int updateByPrimaryKey(Card record);
}