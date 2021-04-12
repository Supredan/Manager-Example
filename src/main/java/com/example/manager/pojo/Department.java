package com.example.manager.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("s_department")
public class Department {
    @TableId(value = "id")
    private Long id;
    private String name;
    private String info;
    private Long emptyBed;
}
