package com.srinath.ex_05_SeleniumWaits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

import static org.testng.AssertJUnit.assertEquals;

public class TestSelenium_FluentWait {
    @Description("Fluent-Wait")
    @Test
    public void FluentWait(){
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Input username
//        WebElement emailInputBox = driver.findElement(By.id("login-username"));
//        emailInputBox.sendKeys("admin@admin.com");
//        //Input password
//        WebElement PassWordBox = driver.findElement(By.id("login-password"));
//        PassWordBox.sendKeys("admin");
//        //submit
//        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
//        buttonSubmit.click();
        //Checker result
        //ExplicitlyWait Need to byhard the syntax
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));
//        WebElement error_message = driver.findElement(By.className("notification-box-description"));
//        //wait.until(ExpectedConditions.textToBePresentInElement(error_message,"Your email, password, IP address or location did not match"));
//        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10));
        .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

       WebElement error_message = wait.until(new Function<WebDriver, WebElement>() {
           @Override
           public WebElement apply(WebDriver webDriver) {
               return null;
           }
       });
       assert.assertEquals(error_message.getText());
        driver.quit();
    }
}
