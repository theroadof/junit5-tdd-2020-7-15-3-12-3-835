package junit5.tdd;

import com.google.common.base.Strings;

public class FizzBuzzWhizz {
    public String say(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        if (number % 7 == 0) {
            result += "Whizz";
        }
        return result;
    }
}
