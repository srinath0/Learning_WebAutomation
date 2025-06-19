package com.srinath.ex_02_SeleniumBasics;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TestSelenium09 {
    @Description("Open the url")
    @Test
    public void test_Selenium01() throws Exception{
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        //Use Navigation Methods
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        Thread.sleep(5000);

        driver.quit();
    }
}
