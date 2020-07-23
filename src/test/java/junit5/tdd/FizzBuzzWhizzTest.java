package junit5.tdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
        assertThat(actual,is("buzz"));
    }


}
