package pro.sky.skyprotesting.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprotesting.exception.DivByZeroException;

@Service
public class CalculatorService {
    public int plus(Integer a, Integer b){
        return a + b;
    }
    public int minus(Integer a, Integer b){
        return a - b;
    }
    public int muliply(Integer a, Integer b){
        return a * b;
    }
    public double divide(Integer a, Integer b){
        if (b == 0) {
            throw new DivByZeroException();
        }
        return a.doubleValue() / b;
    }
}