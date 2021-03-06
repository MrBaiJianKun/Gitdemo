package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Seller;

import java.sql.SQLException;

public interface SellerDAO {

    /**
     * 根据工号查询收银员
     */
    Seller getSellerByNumber(String number)throws SQLException;
}
