package org.dagaun.springboot_01.controller;

/**
 * @ClassName: Code
 * @Description: TODO
 * @author: 达观
 * @date: 2022/7/4  23:14
 */
public class Code { //最后一个数字是0 就是失败
    public static final Integer SAVE_OK = 20011;
    public static final Integer DELETE_OK = 20021;
    public static final Integer UPDATE_OK = 20031;
    public static final Integer GET_OK = 20041;

    public static final Integer  SAVE_ERR = 20010;
    public static final Integer  DELETE_ERR = 20020;
    public static final Integer  UPDATE_ERR = 20030;
    public static final Integer  GET_ERR = 20040;

    public static final Integer SYSTEM_ERR = 01000;
    public static final Integer SYSTEM_TIMEOUT_ERR = 404;
    public static final Integer SYSTEM_UNKNOWN_ERR = 000;

    public static final Integer BUSINESS_ERR  = 60002;
}
