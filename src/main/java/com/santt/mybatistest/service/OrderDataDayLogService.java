package com.santt.mybatistest.service;

import com.santt.mybatistest.dto.OrderDataDayLogDto;

import java.util.Map;

/**
 * Created on 2021/6/3.
 *
 * @author 曹可乐
 */
public interface OrderDataDayLogService {

     OrderDataDayLogDto getLog();

     OrderDataDayLogDto getOrderCamelCaseLog();

     Map<String,Object> getMapLog();
}
