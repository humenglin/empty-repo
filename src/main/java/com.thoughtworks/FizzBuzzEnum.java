package com.thoughtworks;

import com.thoughtworks.constants.FizzBuzzConstans;

public enum FizzBuzzEnum {
    THREE(3, FizzBuzzConstans.Three_Constans),
    FIVE(5, FizzBuzzConstans.Five_Constans),
    SEVEEN(7, FizzBuzzConstans.Seven_Constans);

    private int number;
    private String replaceStr;

    FizzBuzzEnum(int number, String replaceStr) {
        this.number = number;
        this.replaceStr = replaceStr;
    }

    public static FizzBuzzEnum form(int number) {
        for (FizzBuzzEnum fizzBuzzEnum : FizzBuzzEnum.values()) {
            if (fizzBuzzEnum.number == number) {
                return fizzBuzzEnum;
            }
        }

        throw new IllegalArgumentException("未知的特殊值：" + number);
    }

    public String getReplaceStr() {
        return replaceStr;
    }
}
