package com.nurphy.warehouse.mapper;

import com.nurphy.warehouse.pojo.Record;
import org.springframework.stereotype.Repository;

/**
 * 出入库记录Mapper
 * @author Administrator
 */
@Repository
public interface RecordMapper {
    int deleteById(Integer id);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectById(Integer id);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}