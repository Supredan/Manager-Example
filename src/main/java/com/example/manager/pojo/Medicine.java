package com.example.manager.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("s_medicine")
public class Medicine {
    @TableId(value = "id")
    private Long id;
    private String name;
    private Long type;
    private Long validNum;
    private Long maxNum;
    private String info;
}
