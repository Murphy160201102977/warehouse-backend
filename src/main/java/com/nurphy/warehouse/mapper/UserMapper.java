package com.nurphy.warehouse.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nurphy.warehouse.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User>{
    int deleteByPrimaryKey(Integer id);

//   int insert(User user);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User searchAll();
}