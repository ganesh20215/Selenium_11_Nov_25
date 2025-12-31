package testng.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    @Test
    public void verifyLoginPage() {
        Assert.assertTrue(false);
        System.out.println("Verify Login Page");
    }

    @Test(dependsOnMethods = "verifyLoginPage")
    public void verifyHomePage() {
        System.out.println("Verify Home Page");
    }

    @Test
    public void verifyOnboarding() {
        System.out.println("Verify Onboarding");
    }

    @Test
    public void verifyPayments() {
        System.out.println("Verify Payments");
    }
}
