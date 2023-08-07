package com.lingfenglong.mybatisplusdynamicdatasource.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lingfenglong.mybatisplusdynamicdatasource.enums.Sex;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_user")
public class User {

    @TableId("uid")
    private Integer id;

    @TableField("name")
    private String username;
    private Integer age;
    private String email;

    @TableLogic
    private Integer isDeleted;
    private Sex sex;
}
