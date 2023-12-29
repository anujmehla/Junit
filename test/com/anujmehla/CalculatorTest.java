package com.anujmehla;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math operation in Calculator class")
class CalculatorTest {

    //naming convention followed for naming unit testing method name
    //it should be descriptive and speak for itself
    //test<System Under Test>_< Condition or State Change>_<Expected Result>
    //@DisplayName is used for printing shorter method name in the report
    @DisplayName("Test 4/2 = 2")
    @Test
    //old name
//    void integerDivision() {
    void testIntegerDivision_WhenFourIsDividedByTwo_ShouldReturnTwo() {
        //A way or patter to structure your code inside test method
        //AAA

        //Arrange(another name : Given)-prepare and initialize all the needed variable and objects that are needed by
        // your system under test or your method under test
        Calculator calculator = new Calculator();

        //Act(another name : When) - here you will invoke the method under test
        int result = calculator.integerDivision(4,2);

        //Assert(another name : Then) - used to validate the result value
        //third parameter is optional in assertEquals() and will be printed only if test fails
        assertEquals(2,result,"Integer division(4/2) didn't produce expected result(2).");
        //conditional fail, the test will fail irrespective of the test result
//        fail();
    }

    //negative case
    @DisplayName("division by zero")
    @Test
    void testIntegerDivision_WhenDividendIsDividedByZero_ShouldThrowArithmeticException() {
        fail("not implemented yet !");
    }

    @DisplayName("Test 33-1")
    @Test
    void integerSubtraction() {
        Calculator calculator = new Calculator();
        int minuend = 33;
        int subtrahend = 1;
        int expectedResult = 32;
        int actualResult = calculator.integerSubtraction(33,1);
        //this might slow down the performance as message statement will be executed everytime
//        assertEquals(expectedResult,actualResult,minuend+"-"+subtrahend+" did not produce "+expectedResult);
        //to optimize this we'll use lambda
        //now the message statement will be executed only when test fails
        assertEquals(expectedResult,actualResult,() ->minuend+"-"+subtrahend+" did not produce "+expectedResult);
    }
}