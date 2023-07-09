package TestNG;

import org.testng.annotations.DataProvider;

public class DataProviderExample {
    @DataProvider(name = "additionData")
    private Object[][] additionDataMethod(){
        return new Object[][]{{1,2,3},
                {2,3,5},
                {4,5,9}};
    }
    @DataProvider(name = "subtractionData")
    private Object[][] subtractionDataMethod(){
        return new Object[][]{{2,2,0},
                {3,2,1},
                {5,2,3}};
    }
    @DataProvider(name = "multiplicationData")
    private Object[][] multiplicationDataMethod(){
        return new Object[][]{{1,2,2},
                {2,3,6},
                {4,5,20}};
    }
    @DataProvider(name = "percentageData")
    private Object[][] percentageDataMethod(){
        return new Object[][]{{1,2,50},
                {2,3,66},
                {4,5,80}};
    }
    @DataProvider(name = "squareData")
    private Object[][] squareDataMethod(){
        return new Object[][]{{1,1},
                {2,4},
                {4,16}};
    }


}
