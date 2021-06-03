package com.santt.mybatistest.service.Impl;

import com.santt.mybatistest.dao.OrderDataDayLogDao;
import com.santt.mybatistest.dto.OrderDataDayLogDto;
import com.santt.mybatistest.service.OrderDataDayLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created on 2021/6/3.
 *
 * @author 曹可乐
 */
@Service
public class OrderDataDayLogServiceImpl implements OrderDataDayLogService {

    @Autowired
    OrderDataDayLogDao orderDataDayLogDao;

    @Override
    public OrderDataDayLogDto getLog() {
        OrderDataDayLogDto log = orderDataDayLogDao.getOrderLog();
        System.out.println(log);
        return log;
    }

    public OrderDataDayLogDto getOrderCamelCaseLog() {
        OrderDataDayLogDto log = orderDataDayLogDao.getOrderCamelCaseLog();
        System.out.println(log);
        return log;
    }

    public Map<String,Object> getMapLog(){
        Map<String, Object> mapLog = orderDataDayLogDao.getMapLog();

        return mapLog;
    }

}
