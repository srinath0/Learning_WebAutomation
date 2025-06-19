package com.srinath.ex_02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;


public class TestSelenium07 {
    @Description("Open the URL")
    @Test
    public void testVerify01() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");
        driver.quit();
    }
}
