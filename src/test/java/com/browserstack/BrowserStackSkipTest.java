package com.browserstack;
import org.testng.SkipException;
import org.testng.annotations.Test;
public class BrowserStackSkipTest {
    @Test(invocationCount = 2)
    public void addSkipTest() throws Exception {
        throw new SkipException("Skipping this exception");
    }
}

