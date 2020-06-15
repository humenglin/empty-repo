package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_say_given_1() {
        should_return_when_say_given_number(1, "1");
    }

    @Test
    public void should_return_Fizz_when_say_given_3() {
        should_return_when_say_given_number(3, "Fizz");
    }

    @Test
    public void should_return_Buzz_when_say_given_5() {
        should_return_when_say_given_number(5, "Buzz");
    }

    @Test
    public void should_return_FizzBuzz_when_say_given_multiple_of_three_and_five() {
        should_return_when_say_given_number(60, "FizzBuzz");
    }

    @Test
    public void should_return_Whizz_when_say_given_7() {
        should_return_when_say_given_number(7, "Whizz");
    }

    @Test
    public void should_return_FizzWhizz_when_say_given_multiple_of_three_and_seven() {
        should_return_when_say_given_number(21, "FizzWhizz");
    }

    @Test
    public void should_return_BuzzWhizz_when_say_given_multiple_of_five_and_seven() {
        should_return_when_say_given_number(105, "BuzzWhizz");
    }

    @Test
    public void should_return_Whizz_when_say_given_70() {
        should_return_when_say_given_number(70, "Whizz");
    }

    @Test
    public void should_return_BuzzWhizz_when_say_given_multiple_of_three_and_five_and_seven() {
        should_return_when_say_given_number(210, "FizzBuzzWhizz");
    }

    @Test
    public void should_return_Fizz_when_say_given_13() {
        should_return_when_say_given_number(13, "Fizz");
    }

    @Test
    public void should_return_BuzzWhizz_when_say_given_35() {
        should_return_when_say_given_number(35, "BuzzWhizz");
    }

    @Test
    public void should_return_Fizz_when_say_given_30() {
        should_return_when_say_given_number(30, "Fizz");
    }

    @Test
    public void should_return_Fizz_when_say_given_15() {
        should_return_when_say_given_number(15, "Buzz");
    }

    @Test
    public void should_return_Fizz_when_say_given_75() {
        should_return_when_say_given_number(75, "Fizz");
    }

    private void should_return_when_say_given_number(int number, String expected) {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String resultActual = fizzBuzz.say(number);

        // then
        assertEquals(expected, resultActual);
    }
}
