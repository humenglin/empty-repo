package com.thoughtworks;

import com.thoughtworks.constants.FizzBuzzConstans;

public class FizzBuzz {

    public String say(int number) {
        String result = "";

        String numberStr = String.valueOf(number);
        if (numberStr.contains("7")) {
            return controllerMultipleOfThree(number, result) + controllerMultipleOfSeven(number, result);
        }
        if (numberStr.contains("5")) {
            return controllerMultipleOfFive(number, result) + controllerMultipleOfSeven(number, result);
        }
        if (numberStr.contains("3")) {
            return FizzBuzzConstans.Three_Constans;
        }

        result = controllerMultipleOfThree(number, result);
        result = controllerMultipleOfFive(number, result);
        result = controllerMultipleOfSeven(number, result);

        if ((number % 3 != 0) && (number % 5 != 0) && (number % 7 != 0)) {
            result = String.valueOf(number);
        }
        return result;
    }

    private String controllerMultipleOfThree(int number, String result) {
        if (number % 3 == 0) {
            result += FizzBuzzConstans.Three_Constans;
        }
        return result;
    }

    private String controllerMultipleOfFive(int number, String result) {
        if (number % 5 == 0) {
            result += FizzBuzzConstans.Five_Constans;
        }
        return result;
    }

    private String controllerMultipleOfSeven(int number, String result) {
        if (number % 7 == 0) {
            result += FizzBuzzConstans.Seven_Constans;
        }
        return result;
    }

}
