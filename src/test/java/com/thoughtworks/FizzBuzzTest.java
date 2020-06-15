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
}
