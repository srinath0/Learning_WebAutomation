package com.srinath.ex_02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium10 {
    @Description
    @Test
    public void closeandquit(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");

        driver.close();
        //close - will close the current tab,not the session(not the all tab)
        //Quit - will close all the tabs.
       // driver.quit();
    }
}
