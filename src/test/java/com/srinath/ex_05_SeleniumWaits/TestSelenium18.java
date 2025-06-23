package com.srinath.ex_05_SeleniumWaits;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium18 {
    @Description
    @Test
    public void seleniumwait(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        try {
            Thread.sleep(20000); //This will cause the JVM to halt
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
