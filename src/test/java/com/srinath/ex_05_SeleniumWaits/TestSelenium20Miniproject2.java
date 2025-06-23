package com.srinath.ex_05_SeleniumWaits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium20Miniproject2 {
    @Description("Verfiy MakeMyTrip")
    @Test
    public void testVerifyMakeMyTrip(){
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("--incognito");
        chromeoptions.addArguments("--start-maximized");
        ChromeDriver driver = new ChromeDriver(chromeoptions);
        driver.navigate().to("https://www.makemytrip.com");
        //Condition to  check the element loading
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));
        WebElement closeModal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        closeModal.click();

        driver.quit();
    }
}

