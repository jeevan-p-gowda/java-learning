import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class CalculatorTest {
    Calculator calculator;

    @BeforeMethod
    private void setup(){
        calculator = new Calculator();
    }
    @Test(dataProvider = "additionData",dataProviderClass = DataProviderExample.class ,groups = {"simpleOperations"})
    //DataProviders
    private void testAdditionOfTwoNumbers(int num1,int num2,int result) {

        //Act
        int addition = calculator.add(num1, num2);

        //Assert
        Assert.assertEquals(addition, result);
    }
    @Test(dataProvider = "subtractionData",dataProviderClass = DataProviderExample.class)
    private void testSubtractionOfTwoNumbers(int num1,int num2,int result){

        int value = calculator.subtract(num1, num2);

        Assert.assertEquals(value, result);
    }

    @Test(dataProvider = "multiplicationData",dataProviderClass = DataProviderExample.class)
    private void testMultiplicationOfTwoNumbers(int num1,int num2,int result){

        int value = calculator.multiply(num1, num2);

        Assert.assertEquals(value, result);
    }

    @Test(dataProvider = "percentageData",dataProviderClass = DataProviderExample.class)
    private void testPercentageCalculation(int num,int total,int result){

        double value = calculator.percentage(num, total);

        Assert.assertEquals(value, result);
    }

    @Test(dataProvider = "squareData",dataProviderClass = DataProviderExample.class)
    private void testSquareOfANumber(int num,int result){

        int value = calculator.square(num);

        Assert.assertEquals(value, result);
    }
    @Test (expectedExceptions = {IOException.class},expectedExceptionsMessageRegExp = "I am an exception")
    private void testForException() throws IOException {
        throw new IOException("I am an exception");
    }


}
