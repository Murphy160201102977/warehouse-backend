package tk.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * mypper生成
 *
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}