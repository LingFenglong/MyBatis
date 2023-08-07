package com.lingfenglong.mybatisplus.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Sex {
    MALE(Byte.valueOf("0"), "男"),
    FEMALE(Byte.valueOf("1"), "女");

    @EnumValue
    private final Byte sex;
    private final String sexName;
}
