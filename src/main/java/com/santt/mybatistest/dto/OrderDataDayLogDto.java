package com.santt.mybatistest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 2021/5/20.
 * @author 曹可乐
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDataDayLogDto {

    private String id; //日志id

    private Long newOrderNum; //新增订单数量

    private Long newOrderValue; //新增订单金额

    private Long newOrderUpValue; //线上新增订单金额

    private Long newOrderUpNum; //线上新增订单数

    private Long newOrderUpMemberNum; //线上新增订单总用户数

    private Long refundOrderNum; //线上退款订单数量

    private Long refundOrderValue; //线上退款订单金额

    private Long cancelOrderNum; //线上取消订单数量

    private Long cancelOrderValue; //线上取消订单金额

    private Long newMemberOrderNum; //新用户下单数

    private Long oldMemberOrderNum; //老用户下单数

    private Long totalOrderNum; //平台总订单数

   // private String orderDataDay;

   // private String createdTime;

}
