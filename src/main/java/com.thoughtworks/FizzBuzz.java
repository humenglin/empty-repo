package com.thoughtworks;

import com.thoughtworks.constants.FizzBuzzConstans;

public class FizzBuzz {

    public String say(int number) {
        if (number % 3 == 0) {
            return FizzBuzzConstans.Three_Constans;
        }
        return String.valueOf(number);
    }
}
