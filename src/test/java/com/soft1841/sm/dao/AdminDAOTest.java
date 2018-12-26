package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Admin;

import com.soft1841.sm.utils.DAOFactory;

import org.junit.Test;

import java.sql.SQLException;


public class AdminDAOTest {
    private AdminDAO adminDAO = DAOFactory.getAdminDAOInstance();

    @Test
    public void getAdminByNumber()  throws SQLException {
        Admin admin = adminDAO.getAdminByNumber("000001");
        System.out.println(admin);
    }
}