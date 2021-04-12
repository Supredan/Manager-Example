package com.example.manager.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("s_doctor")
public class Doctor {
    @TableId(value = "id")
    private Long id;
    private String username;
    private String password;
    private Long departmentId;
    private String sex;
    private Long mobile;
    private Long qq;
}
