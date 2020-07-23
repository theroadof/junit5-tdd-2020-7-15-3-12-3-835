package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzWhizzTest {
    @Test
    void should_be_fizz_when_play_say_given_3() {
        //given
        int number = 3;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual = fizzBuzzWhizz.say(number);

        //then
        assertThat(actual,is("Fizz"));
    }

    @Test
    void should_be_buzz_when_play_say_given_5() {
        //given
        int number = 5;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual = fizzBuzzWhizz.say(number);

        //then
        assertThat(actual,is("Buzz"));
    }

    @Test
    void should_be_whizz_when_play_say_given_7() {
        //given
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        int number = 7;

        //when
        String actual = fizzBuzzWhizz.say(number);

        //then
        assertThat(actual,is("Whizz"));
    }

    @Test
    void should_be_fizzbuzz_when_play_say_given_3x5() {
        //given
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        int number = 15;

        //when
        String actual = fizzBuzzWhizz.say(number);

        //then
        assertThat(actual,is("FizzBuzz"));
    }

    @Test
    void should_be_fizzbuzzwhizz_when_play_say_given_3x5x7() {
        //given
        int number = 3*5*7;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual = fizzBuzzWhizz.say(number);

        //then
        assertThat(actual,is("FizzBuzzWhizz"));
    }

    @Test
    void should_be_numberValue_when_play_say_given_nor_3_5_7() {
        //given
        int number = 13;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual = fizzBuzzWhizz.say(number);

        //then
        assertThat(actual,is(String.valueOf(number)));
    }
}
