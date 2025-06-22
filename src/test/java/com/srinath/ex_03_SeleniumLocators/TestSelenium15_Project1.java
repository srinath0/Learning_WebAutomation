package com.srinath.ex_03_SeleniumLocators;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium15_Project1 {
    @Owner("Srinath")
    @Severity(SeverityLevel.BLOCKER)
    @Description("To check the email gives error on app.vwo.com signup page")
    @Test
    @TmsLink("https://jira.int.vwo.org.atlassian/")
    public void VerifyError(){
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        WebElement a_tag_Start_free_trial = driver.findElement(By.linkText("Start a free trial"));
        a_tag_Start_free_trial.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");
        WebElement checkbox_policy= driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();
        List<WebElement> buttonList= driver.findElements(By.tagName("button"));
        buttonList.get(0).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement error_msge = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_msge.getText(),"The email address you entered is incorrect.");
        driver.quit();
    }
}
