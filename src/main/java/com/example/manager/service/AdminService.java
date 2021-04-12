package com.example.manager.service;

import com.example.manager.pojo.Admin;

/**
 * @Classname AdminService
 * @Description None
 * @Date 2019/6/25 11:07
 * @Created by WDD
 */
public interface AdminService {

    Admin findByAdminId(Admin admin);


    int updateByAdmin(Admin admin);
}
