package com.nurphy.warehouse.mapper;

import com.nurphy.warehouse.pojo.Record;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}