package com.thoughtworks;

import com.thoughtworks.constants.FizzBuzzConstans;

public class FizzBuzz {

    public String say(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return FizzBuzzConstans.Three_Constans + FizzBuzzConstans.Five_Constans;
        } else if (number % 3 == 0) {
            return FizzBuzzConstans.Three_Constans;
        } else if (number % 5 == 0) {
            return FizzBuzzConstans.Five_Constans;
        } else if (number % 7 == 0) {
            return FizzBuzzConstans.Seven_Constans;
        }
        return String.valueOf(number);
    }
}
