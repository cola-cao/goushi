package com.santt.mybatistest.dao;

import com.santt.mybatistest.dto.OrderDataDayLogDto;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.Map;


/**
 * Created on 2021/6/3.
 * @author 曹可乐
 */
@Mapper
public interface OrderDataDayLogDao {

     @Select("select new_order_num as newOrderNum," +
             "new_order_value as newOrderValue," +
             "new_order_up_value as newOrderUpValue," +
             "new_order_up_num as newOrderUpNum," +
             "new_order_up_member_num as newOrderUpMemberNum," +
             "refund_order_num as refundOrderNum," +
             "refund_order_value as refundOrderValue," +
             "cancel_order_num as cancelOrderNum," +
             "cancel_order_value as cancelOrderValue," +
             "new_member_order_num as newMemberOrderNum," +
             "old_member_order_num as oldMemberOrderNum," +
             "total_order_num as totalOrderNum from order_data_day_log where id = '584895776698662912'")
     OrderDataDayLogDto getOrderLog();

     @Select("select new_order_num ," +
             "new_order_value ," +
             "new_order_up_value ," +
             "new_order_up_num ," +
             "new_order_up_member_num ," +
             "refund_order_num ," +
             "refund_order_value ," +
             "cancel_order_num ," +
             "cancel_order_value ," +
             "new_member_order_num ," +
             "old_member_order_num ," +
             "total_order_num  from order_data_day_log where id = '584895776698662912'")
     OrderDataDayLogDto getOrderCamelCaseLog();

     @Select("select new_order_num as newOrderNum," +
             "new_order_value as newOrderValue," +
             "new_order_up_value as newOrderUpValue," +
             "new_order_up_num as newOrderUpNum," +
             "new_order_up_member_num as newOrderUpMemberNum," +
             "refund_order_num as refundOrderNum," +
             "refund_order_value as refundOrderValue," +
             "cancel_order_num as cancelOrderNum," +
             "cancel_order_value as cancelOrderValue," +
             "new_member_order_num as newMemberOrderNum," +
             "old_member_order_num as oldMemberOrderNum," +
             "total_order_num as totalOrderNum from order_data_day_log where id = '584895776698662912'")
     Map<String,Object> getMapLog();

     @Select("select new_order_num as newOrderNum," +
             "new_order_value as newOrderValue," +
             "new_order_up_value as newOrderUpValue," +
             "new_order_up_num as newOrderUpNum," +
             "new_order_up_member_num as newOrderUpMemberNum," +
             "refund_order_num as refundOrderNum," +
             "refund_order_value as refundOrderValue," +
             "cancel_order_num as cancelOrderNum," +
             "cancel_order_value as cancelOrderValue," +
             "new_member_order_num as newMemberOrderNum," +
             "old_member_order_num as oldMemberOrderNum," +
             "total_order_num as totalOrderNum from order_data_day_log")
     List<Map<String,Object>> getMapListLog();

     @Select("select * from order_data_day_log where id = '584895776698662912'")
     @ResultMap({
             @Result()
     })
     OrderDataDayLogDto getResultLog();
}
