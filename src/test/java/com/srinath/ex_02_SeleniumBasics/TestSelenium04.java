package com.srinath.ex_02_SeleniumBasics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestSelenium04 {
    // I-Interface
    // C - class
    // Webdriver Hierarchy
// SearchContext(I)-> (2)-> WebDriver(I)->(10)->RemoteWebDriver(C) (15)
    //ChromiumDriver(C)
    //ChromeDriver(C),EdgeDriver(C),BraveBrowser(c)
    //SearchContext driver = new ChromeDriver();
//    SearchContext driver = new FirefoxDriver();
//    WebDriver driver = new ChromeDriver();
//    RemoteWebDriver driver1=new ChromeDriver();
//    ChromeDriver driver2=new ChromeDriver();
    //1.If we want to run on chrome or edge?
    ChromeDriver driver = new ChromeDriver();

    //2. Do you want to run on Chrome then change to Edge?
//    WebDriver driver = new ChromeDriver();
//    driver = new EdgeDriver();
//    driver = new FirefoxDriver();

    //3. Do you want to run on multiple browsers,aws machine, ? 2%
    // RemoteWebDriver driver(with GRID)- Advance(Last 2 Sessions)
}
