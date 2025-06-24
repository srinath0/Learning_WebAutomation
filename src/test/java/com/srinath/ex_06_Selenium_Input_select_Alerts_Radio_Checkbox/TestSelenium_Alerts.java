package com.srinath.ex_06_Selenium_Input_select_Alerts_Radio_Checkbox;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium_Alerts {
    @Description("Alerts")
    @Test
    public void HandlingAlert(){
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement element=driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        element.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You successfully clicked an alert");

//        WebElement element1= driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
//        element1.click();
//        WebElement element2=driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
//        element2.click();

    }
}
