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
    private String code;
    private String message;
    private T data;

    public static <T> Response<T> create(){
        return new Response<T>();
    }

    public static <T> Response<T> returnSuccess(T data){
        Response<T> response=new Response<>();
        response.setCode("200");
        response.setData(data);
        return response;
    }
}