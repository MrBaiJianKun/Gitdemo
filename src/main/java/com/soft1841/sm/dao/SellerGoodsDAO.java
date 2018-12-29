package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Goods;

import java.sql.SQLException;



public interface SellerGoodsDAO {
    /**
     * 查询所有商品
     */
    Goods getAllGoods() throws SQLException;


}