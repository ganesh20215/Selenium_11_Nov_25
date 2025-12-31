package testng.basics;

import org.testng.annotations.*;

public class TestNGAnnotations {

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method");
    }


    @Test
    public void p1(){
        System.out.println("p1");
    }

    @Test
    public void p2(){
        System.out.println("p2");
    }

    /*@Test
    public void p3(){
        System.out.println("p3");
    }*/

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }
}
