package testng.basics;

import org.testng.annotations.Test;

public class Invocation {

    @Test(invocationCount = 10000, invocationTimeOut = 1)
    public void testMethod(){
        System.out.println("Test Method..");
    }
}
