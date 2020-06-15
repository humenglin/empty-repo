package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_say_given_1() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String resultActual = fizzBuzz.say(1);

        // then
        assertEquals("1", resultActual);
    }

    @Test
    public void should_return_Fizz_when_say_given_3() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String resultActual = fizzBuzz.say(3);

        // then
        assertEquals("Fizz", resultActual);
    }

    @Test
    public void should_return_Buzz_when_say_given_5() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String resultActual = fizzBuzz.say(5);

        // then
        assertEquals("Buzz", resultActual);
    }
}
