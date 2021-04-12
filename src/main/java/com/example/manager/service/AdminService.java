package com.example.manager.service;

import com.example.manager.pojo.Admin;

public interface AdminService {

    Admin findByAdminId(Admin admin);

    Admin findByAdminNaPs(Admin admin);

    int updateByAdmin(Admin admin);
}
