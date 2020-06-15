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

    @Test
    public void should_return_FizzBuzz_when_say_given_15() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String resultActual = fizzBuzz.say(15);

        // then
        assertEquals("FizzBuzz", resultActual);
    }

    @Test
    public void should_return_Whizz_when_say_given_7() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String resultActual = fizzBuzz.say(7);

        // then
        assertEquals("Whizz", resultActual);
    }

    @Test
    public void should_return_FizzWhizz_when_say_given_21() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String resultActual = fizzBuzz.say(21);

        // then
        assertEquals("FizzWhizz", resultActual);
    }

    @Test
    public void should_return_BuzzWhizz_when_say_given_35() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String resultActual = fizzBuzz.say(35);

        // then
        assertEquals("BuzzWhizz", resultActual);
    }

    @Test
    public void should_return_BuzzWhizz_when_say_given_105() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String resultActual = fizzBuzz.say(105);

        // then
        assertEquals("FizzBuzzWhizz", resultActual);
    }
}
