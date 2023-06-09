import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class StringCalculatorShould {

    private StringCalculator stringCalculator;
    @BeforeEach
    void setup(){
        stringCalculator = new StringCalculator();
    }
    @Test
    void returnZeroOnEmptyString() {
        int expected = 0;

        int actual = stringCalculator.add("");

        Assertions.assertEquals(actual,expected);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "'1', 1",
            "'2', 2",
            "'1,2', 3",
            })
    void returnSumOnString(String string, int sum) {

        int actual = stringCalculator.add(string);

        Assertions.assertEquals(actual,sum);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "'1\n2', 3",
    })
    void returnSumOnStringNewlineSeperated(String string, int sum) {

        int actual = stringCalculator.add(string);

        Assertions.assertEquals(actual,sum);
    }
}