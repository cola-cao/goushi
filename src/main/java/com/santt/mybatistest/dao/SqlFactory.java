package com.santt.mybatistest.dao;

import org.apache.ibatis.jdbc.SQL;

/**
 * Created on 2021/6/4.
 *
 * @author 曹可乐
 */
public class SqlFactory {

    public String getFactorySql(){

        String sql = new SQL().toString();
        sql+= "select * from order_data_day_log where id = '580462064435200000'";

        return sql;
    }
}
