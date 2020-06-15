package com.thoughtworks;

import com.thoughtworks.constants.FizzBuzzConstans;

public class FizzBuzz {

    public String say(int number) {
        String result = "";

        String numberStr = String.valueOf(number);
        if (numberStr.contains("3")) {
            return FizzBuzzConstans.Three_Constans;
        }

        if (number % 3 == 0) {
            result += FizzBuzzConstans.Three_Constans;
        }

        if (number % 5 == 0) {
            result += FizzBuzzConstans.Five_Constans;
        }

        if (number % 7 == 0) {
            result += FizzBuzzConstans.Seven_Constans;
        }

        if ((number % 3 != 0) && (number % 5 != 0) && (number % 7 != 0)) {
            result = String.valueOf(number);
        }
        return result;
    }

}
