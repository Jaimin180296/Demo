package com.browserstack;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class BrowserStackFailureTest extends  SeleniumTest {

        @Test(invocationCount = 2)
        public void failureTest(ITestContext testContext) throws Exception {
            int currentCount = testContext.getAllTestMethods()[0].getCurrentInvocationCount();
                
            System.out.println("Executing count: " + currentCount);
            driver.get("https://www.bstackdemo.com");

            // Check the title
                Assert.assertTrue(driver.getTitle().matches("Failure"));
            }
        }
