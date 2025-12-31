package testng.basics;

import org.testng.Assert;
import org.testng.annotations.Test;
import testng.retryfailscript.ReRunFailScript;

public class PriorityExample {

    @Test(priority = 1)
    public void testV(){
        System.out.println("test v");
    }

    @Test(priority = 2, description = "Verify Test B")
    public void testB(){
        System.out.println("test B");
    }

    @Test(priority = 'D')
    public void testZ(){
        Assert.assertTrue(false);
        System.out.println("test Z");
    }

    @Test(priority = 4)
    public void testD(){
        Assert.assertTrue(false);
        System.out.println("test D");
    }

    @Test(priority = 5)
    public void testM(){
        System.out.println("test M");
    }
}
