package com.thoughtworks;

import com.thoughtworks.constants.FizzBuzzConstans;

public class FizzBuzz {

    public String say(int number) {
        String result = "";

        String numberStr = String.valueOf(number);
        if (numberStr.contains("7")) {
            return controllerMultiple(number, FizzBuzzEnum.THREE, result) +
                    controllerMultiple(number, FizzBuzzEnum.SEVEEN, result);
        }
        if (numberStr.contains("5")) {
            return controllerMultiple(number, FizzBuzzEnum.FIVE, result) +
                    controllerMultiple(number, FizzBuzzEnum.SEVEEN, result);
        }
        if (numberStr.contains("3")) {
            return FizzBuzzConstans.Three_Constans;
        }

        result = controllerMultiple(number, FizzBuzzEnum.THREE, result);
        result = controllerMultiple(number, FizzBuzzEnum.FIVE, result);
        result = controllerMultiple(number, FizzBuzzEnum.SEVEEN, result);

        if ((number % 3 != 0) && (number % 5 != 0) && (number % 7 != 0)) {
            result = String.valueOf(number);
        }
        return result;
    }

    private String controllerMultiple(int number, FizzBuzzEnum fizzBuzzEnum, String result) {
        if (number % fizzBuzzEnum.getNumber() == 0) {
            result += fizzBuzzEnum.getReplaceStr();
        }
        return result;
    }

}
