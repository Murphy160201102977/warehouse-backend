package com.nurphy.warehouse.mapper;

import com.nurphy.warehouse.pojo.Store;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}