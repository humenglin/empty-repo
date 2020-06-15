package com.thoughtworks;

import com.thoughtworks.constants.FizzBuzzConstans;

public class FizzBuzz {

    public String say(int number) {
        String result = "";

        String numberStr = String.valueOf(number);
        if (numberStr.contains(FizzBuzzEnum.SEVEEN.getSpecialStr())) {
            return controllerMultiple(number, FizzBuzzEnum.THREE, result) +
                    controllerMultiple(number, FizzBuzzEnum.SEVEEN, result);
        }
        if (numberStr.contains(FizzBuzzEnum.FIVE.getSpecialStr())) {
            return controllerMultiple(number, FizzBuzzEnum.FIVE, result) +
                    controllerMultiple(number, FizzBuzzEnum.SEVEEN, result);
        }
        if (numberStr.contains(FizzBuzzEnum.THREE.getSpecialStr())) {
            return FizzBuzzConstans.Three_Constans;
        }

        result = controllerMultiple(number, FizzBuzzEnum.THREE, result);
        result = controllerMultiple(number, FizzBuzzEnum.FIVE, result);
        result = controllerMultiple(number, FizzBuzzEnum.SEVEEN, result);

        if (FizzBuzzEnum.isNotMultipleOfSpecialNumber(number)) {
            result = String.valueOf(number);
        }
        return result;
    }

    private String controllerMultiple(int number, FizzBuzzEnum fizzBuzzEnum, String result) {
        if (number % fizzBuzzEnum.getSpecialNumber() == 0) {
            result += fizzBuzzEnum.getReplaceStrOfSpecialNumber();
        }
        return result;
    }

}
