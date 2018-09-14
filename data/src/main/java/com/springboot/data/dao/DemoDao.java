package com.springboot.data.dao;

import com.springboot.data.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


/**
 * @author lirt
 * 使用JdbcTemplate操作数据库.
 */
@Repository
public class DemoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 通过id获取对象
     * @param id
     * @return
     */
    public Demo getDemo(String id){
        String sql = "select * from demo where id = ?";
        RowMapper<Demo> rowMapper = new BeanPropertyRowMapper<>(Demo.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }
}
