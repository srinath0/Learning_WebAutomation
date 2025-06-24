package com.srinath.ex_06_Selenium_Input_select_Alerts_Radio_Checkbox;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

//Radio-Box- You need to check the type=Radio of box in the DOM script.
//
public class TestSelenium22 {
    @Description
    @Test
    public void InputBox(){
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://awesomeqa.com/practice.html");
        driver.findElement(By.name("firstname")).sendKeys("srinath");
        driver.findElement(By.name("lastname")).sendKeys("keshetti");
        //Radio Box
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("exp-2")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='profession-0']")));
        driver.findElement((By.cssSelector("input[id='profession-0']")));

    }

}
