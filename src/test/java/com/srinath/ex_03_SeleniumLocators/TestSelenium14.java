package com.srinath.ex_03_SeleniumLocators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//Partial-Test & Linked Text
//<a href="https://vwo.com/free-trial/?utm_medium=website&amp;
// utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
// class="text-link Td(n)"
// data-qa="bericafeqo">
// Start a free trial</a>
public class TestSelenium14 {
    @Description("Verify VWO")
    @Test
    public void StartaFreetrial(){
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("--incognito");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        chromeoptions.addArguments(("--start-maximized"));
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        //LinkText- full text match
        WebElement a_tag_Start_free_trial = driver.findElement(By.linkText("Start a free trial"));
        a_tag_Start_free_trial.click();

        //PartialLinkText - It matches partially
        WebElement a_tag = driver.findElement(By.partialLinkText("trial"));
        a_tag.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
