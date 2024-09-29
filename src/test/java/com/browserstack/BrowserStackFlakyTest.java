package com.browserstack;
import java.util.Random;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class BrowserStackFlakyTest extends SeleniumTest {

    @Test(invocationCount = 2)
    public void flakyTest(ITestContext testContext) throws Exception {
        int currentCount = testContext.getAllTestMethods()[0].getCurrentInvocationCount();
        System.out.println("Executing count: " + currentCount);
        driver.get("https://www.bstackdemo.com");

        // Check the title
        if(currentCount == 0) {
            Assert.assertTrue(driver.getTitle().matches("StackDemo"));
        }else {
            Assert.assertTrue(driver.getTitle().matches("Failure"));
        }
    }
}
