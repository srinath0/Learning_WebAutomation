package com.srinath.ex_02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium13 {
    @Description("Verify app.vwo.com with  invalid emial&password")
    @Test
    public void LocatorsStrategy(){
        //locators in seleniumt
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new FirefoxDriver(options);
        driver.get("https://app.vwo.com");
        //Input username
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");
        //Input password
        WebElement PassWordBox = driver.findElement(By.id("login-password"));
        PassWordBox.sendKeys("admin");
        //submit
        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Checker result
        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        driver.quit();
    }
}
