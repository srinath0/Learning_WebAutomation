package com.srinath.ex_04_SeleniumXpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//Absolute Xpath->If any element fails or deleted->xpath fails

//Relative Xpath ->//a[@id="btn-make-appointment"]
public class TestSelenium16 {
    @Description("Absolute XPath")
    @Test
    public void xpath(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement Make_appointment = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        Make_appointment.click();

        WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
        Username.sendKeys("John Doe");

        WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
        Password.sendKeys("ThisIsNotAPassword");

        WebElement login_input = driver.findElement(By.xpath("//button[@id='btn-login']"));
        login_input.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");
        driver.quit();
    }
}
