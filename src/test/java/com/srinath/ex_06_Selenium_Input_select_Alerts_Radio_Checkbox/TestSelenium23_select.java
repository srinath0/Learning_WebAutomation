package com.srinath.ex_06_Selenium_Input_select_Alerts_Radio_Checkbox;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSelenium23_select {
    @Description("Select box automation")
    @Test
    public void selectBox(){
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("dropdown"));
        Select select = new Select(element);
        //select.selectByIndex(1);
        select.selectByVisibleText("Option 1");
        driver.quit();
    }
}
