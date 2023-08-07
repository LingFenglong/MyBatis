package com.lingfenglong.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.lingfenglong.mybatisplus.enums.Sex;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_user")
public class User {
    @TableId(value = "uid", type = IdType.AUTO)     // 映射表中的uid字段，使用自增id的算法
    private Long id;

//    @TableField("user_name")
    private String name;
    private Integer age;
    private String email;
    private Sex sex;

    public User(Long id, String name, Integer age, String email, Integer isDeleted) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.isDeleted = isDeleted;
    }

    @TableLogic     // 实现逻辑删除
    private Integer isDeleted;
}
