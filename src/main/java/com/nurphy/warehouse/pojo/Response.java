package com.nurphy.warehouse.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 返回结果集
 * @author Administrator
 */
@Getter
@Setter
@Accessors(chain = true)
public class Response<T> {
    private Integer code;
    private String message;
    private T data;

    public static <T> Response of(){
        return new Response<T>();
    }
}