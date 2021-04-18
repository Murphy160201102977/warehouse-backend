package com.nurphy.warehouse.exception;

/**
 * TODO
 *
 * @author lianekai
 * @version: 1.0
 * @date 2021/04/18 22:37
 */
public class BizException extends RuntimeException {
    private String code;
    private transient Object data;
}
