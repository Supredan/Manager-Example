package com.example.manager.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 用户实体类
 */
@Data
@TableName("s_admin")
public class Admin {
	private Long id;
	private String username;
	private String password;
	private Integer status;
}
