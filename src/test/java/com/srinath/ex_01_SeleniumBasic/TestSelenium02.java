package com.srinath.ex_01_SeleniumBasic;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {
    @Description("Open the app.vwo.com and verify the title!")
    @Test
    public void test_Selenium02(){
        //Open URL
        FirefoxDriver driver = new FirefoxDriver();
        //Navigate URL
        driver.get("https://app.vwo.com");
        //Assertion
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();
    }
}
