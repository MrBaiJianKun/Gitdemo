package com.soft1841.sm.service;

import com.soft1841.sm.utils.ServiceFactory;
import org.junit.Test;

public class AdminServiceTest {
    private  AdminService adminService = ServiceFactory.getAdminServiceInstance();

    @Test
    public void login() {
        boolean flag = adminService.login("123456","123");
        System.out.println(flag);
    }
}
