package com.soft1841.sm.dao;
import com.soft1841.sm.entity.Vip;

import java.sql.SQLException;
import java.util.List;



public interface VipDAO {
    /**
     * 查询所有Vip信息
     */
    List<Vip> selectVip()throws SQLException;

    /**
     * 根据id删除实体
     */
    int deleteById(long id) throws SQLException;

    /**
     * 新增一个会员，返回自增主键
     */
    Long insertVip(Vip vip) throws SQLException;


}