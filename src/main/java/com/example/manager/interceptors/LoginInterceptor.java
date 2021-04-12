package com.example.manager.interceptors;

import com.example.manager.pojo.Admin;
import com.example.manager.pojo.Doctor;
import com.example.manager.pojo.Patient;
import com.example.manager.util.Const;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        Admin user = (Admin)request.getSession().getAttribute(Const.ADMIN);
        Doctor doctor = (Doctor) request.getSession().getAttribute(Const.DOCTOR);
        Patient patient = (Patient)request.getSession().getAttribute(Const.PATIENT);
        if(!StringUtils.isEmpty(user) || !StringUtils.isEmpty(doctor) || !StringUtils.isEmpty(patient)){
            return true;
        }
        response.sendRedirect(request.getContextPath() + "/system/login");
        return false;
    }

}
