package com.srinath.ex_01_SeleniumBasic;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {
    //Write the code which will perfor UI interactions
    @Test
    public void test_VerifyVWOLogin() {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }

}
