package com.santt.mybatistest.controller;

import com.santt.mybatistest.dao.OrderDataDayLogDao;
import com.santt.mybatistest.dto.OrderDataDayLogDto;
import com.santt.mybatistest.service.OrderDataDayLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import java.util.*;

/**
 * Created on 2021/6/3.
 *
 * @author 曹可乐
 */
@RestController
public class OrderDataDayLogController {

    @Autowired
    OrderDataDayLogService orderDataDayLogService;

    @Autowired
    OrderDataDayLogDao orderDataDayLogDao;

    @GetMapping("/getLog/{orderId}")
    public OrderDataDayLogDto getLog(@PathVariable String orderId){

        OrderDataDayLogDto log = orderDataDayLogService.getLog();
        return log;
    }

    //驼峰命名映射
    @GetMapping("/getCamelCaseLog/{orderId}")
    public OrderDataDayLogDto getOrderCamelCaseLog(@PathVariable String orderId){

        OrderDataDayLogDto log = orderDataDayLogService.getOrderCamelCaseLog();
        return log;
    }

    //映射到 map
    @GetMapping("/getMapLog/{orderId}")
    public Map<String, Object> getMapLog(@PathVariable String orderId){

        Map<String, Object> mapLog = orderDataDayLogService.getMapLog();
        return mapLog;
    }

    //映射到 map  返回List类型
    @GetMapping("/getMapListLog/{orderId}")
    public List<Map<String, Object>> getMapListLog(@PathVariable String orderId){

        List<Map<String, Object>> mapListLog = orderDataDayLogDao.getMapListLog();
        return mapListLog;
    }

    //ResultMap()映射
    @GetMapping("/getResultLog/{orderId}")
    public OrderDataDayLogDto getResultLog(@PathVariable String orderId){

        OrderDataDayLogDto resultLog = orderDataDayLogDao.getResultLog();
        return resultLog;
    }
}
