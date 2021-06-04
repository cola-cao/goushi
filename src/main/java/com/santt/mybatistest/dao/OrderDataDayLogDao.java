package com.santt.mybatistest.dao;

import com.santt.mybatistest.dto.OrderDataDayLogDto;
import org.apache.ibatis.annotations.*;

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
             "total_order_num as totalOrderNum from order_data_day_log where id = '580462064435200000'")
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
     @Results({
             @Result(property = "newOrderNum",column = "new_order_num"),
             @Result(property = "newOrderValue",column = "new_order_value"),
             @Result(property = "newOrderUpValue",column = "new_order_up_value"),
             @Result(property = "newOrderUpNum",column = "new_order_up_num"),
             @Result(property = "newOrderUpMemberNum",column = "new_order_up_member_num"),
             @Result(property = "refundOrderNum",column = "refund_order_num"),
             @Result(property = "refundOrderValue",column = "refund_order_value"),
             @Result(property = "cancelOrderNum",column = "cancel_order_num"),
             @Result(property = "cancelOrderValue",column = "cancel_order_value"),
             @Result(property = "newMemberOrderNum",column = "new_member_order_num"),
             @Result(property = "oldMemberOrderNum",column = "old_member_order_num"),
             @Result(property = "totalOrderNum",column = "total_order_num"),
     })
     @Select("select * from order_data_day_log where id = '580462064435200000'")
     OrderDataDayLogDto getResultLog();

     @Results({
             @Result(property = "newOrderNum",column = "new_order_num"),
             @Result(property = "newOrderValue",column = "new_order_value"),
             @Result(property = "newOrderUpValue",column = "new_order_up_value"),
             @Result(property = "newOrderUpNum",column = "new_order_up_num"),
             @Result(property = "newOrderUpMemberNum",column = "new_order_up_member_num"),
             @Result(property = "refundOrderNum",column = "refund_order_num"),
             @Result(property = "refundOrderValue",column = "refund_order_value"),
             @Result(property = "cancelOrderNum",column = "cancel_order_num"),
             @Result(property = "cancelOrderValue",column = "cancel_order_value"),
             @Result(property = "newMemberOrderNum",column = "new_member_order_num"),
             @Result(property = "oldMemberOrderNum",column = "old_member_order_num"),
             @Result(property = "totalOrderNum",column = "total_order_num"),
     })
     @SelectProvider(type = SqlFactory.class,method = "getFactorySql")
     OrderDataDayLogDto getFactoryLog();
}
