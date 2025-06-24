package com.srinath.ex_07_WaitHelpers;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium25_WaitHelpers {
    @Description("Wait Helpers")
    @Test
    public static void checkVisibility(WebDriver driver,By locator,int time){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //01:15:20
    }
}
