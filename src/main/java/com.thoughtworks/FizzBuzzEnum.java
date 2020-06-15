package com.thoughtworks;

import com.thoughtworks.constants.FizzBuzzConstans;

public enum FizzBuzzEnum {
    THREE(3, "3", FizzBuzzConstans.Three_Constans),
    FIVE(5, "5", FizzBuzzConstans.Five_Constans),
    SEVEEN(7, "7", FizzBuzzConstans.Seven_Constans);

    private int specialNumber;
    private String specialStr;
    private String replaceStrOfSpecialNumber;

    FizzBuzzEnum(int specialNumber, String specialStr, String replaceStrOfSpecialNumber) {
        this.specialNumber = specialNumber;
        this.specialStr = specialStr;
        this.replaceStrOfSpecialNumber = replaceStrOfSpecialNumber;
    }

    public static FizzBuzzEnum form(int number) {
        for (FizzBuzzEnum fizzBuzzEnum : FizzBuzzEnum.values()) {
            if (fizzBuzzEnum.specialNumber == number) {
                return fizzBuzzEnum;
            }
        }

        throw new IllegalArgumentException("未知的特殊值：" + number);
    }

    public static boolean isNotMultipleOfSpecialNumber(int number) {
        for (FizzBuzzEnum fizzBuzzEnum : FizzBuzzEnum.values()) {
            if (number % fizzBuzzEnum.specialNumber == 0) {
                return false;
            }
        }
        return true;
    }

    public int getSpecialNumber() {
        return specialNumber;
    }

    public String getSpecialStr() {
        return specialStr;
    }

    public String getReplaceStrOfSpecialNumber() {
        return replaceStrOfSpecialNumber;
    }
}
