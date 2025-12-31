package testng.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupsExample {

    @Test(groups = "smoke")
    public void verifyP1() {
        Assert.assertTrue(false);
        System.out.println("Verify P1");
    }

    @Test(dependsOnGroups = "smoke")
    public void verifyP2() {
        System.out.println("Verify P2");
    }

    @Test
    public void verifyP3() {
        System.out.println("Verify P3");
    }

    @Test
    public void verifyP4() {
        System.out.println("Verify P4");
    }
}
