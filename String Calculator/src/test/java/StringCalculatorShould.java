import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StringCalculatorShould {

    @Test
    void returnZeroOnEmptyString() {
        StringCalculator stringCalculator = new StringCalculator();
        int expected = 0;

        int actual = stringCalculator.add("");

        Assertions.assertEquals(actual,expected);
    }
}