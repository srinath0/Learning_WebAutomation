package com.srinath.ex_02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium08{
        @Description("Open the URL")
        @Test
    public void test_Selenium01(){
            WebDriver driver = new FirefoxDriver();
            driver.get("https://katalon-demo-cura.herokuapp.com/");
            driver.manage().window().maximize();
            if(driver.getPageSource().contains("CURA Healthcare Service")){
                System.out.println("CURA Healthcare Service is visible");
                Assert.assertTrue(true);
            }
            else{
                Assert.assertTrue(false);
            }
            driver.quit();
        }
}
