package pro.sky.skyprotesting.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.skyprotesting.exception.DivByZeroException;

import java.security.DigestException;

public class CalculatorServiceTest {
    private final CalculatorService calclulatorService = new CalculatorService();
    @Test
    public void plusTest(){
        Number actual = calclulatorService.plus(1,2);
        Number expected = 3;

        Assertions.assertEquals(expected,actual);

        actual = calclulatorService.plus(-1,2);
        expected = 1;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void minusTest(){
        Number actual = calclulatorService.minus(1,2);
        Number expected = -1;

        Assertions.assertEquals(expected,actual);

        actual = calclulatorService.minus(-1,2);
        expected = -3;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void multiplyTest(){
        Number actual = calclulatorService.muliply(1,2);
        Number expected = 2;

        Assertions.assertEquals(expected,actual);

        actual = calclulatorService.muliply(-1,2);
        expected = -2;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void divideTest(){
        Number actual = calclulatorService.divide(1,2);
        Number expected = 0.5;

        Assertions.assertEquals(expected,actual);

        actual = calclulatorService.divide(-1,2);
        expected = -0.5;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void divideNegativeTest(){

        Assertions.assertThrows(DivByZeroException.class, ()->calclulatorService.divide(1,0));
        Assertions.assertThrows(DivByZeroException.class, ()->calclulatorService.divide(-1,0));
    }
}

