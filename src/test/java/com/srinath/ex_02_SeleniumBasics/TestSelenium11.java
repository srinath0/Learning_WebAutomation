package com.srinath.ex_02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium11 {
    @Description
    @Test
    //Options class -- ChromeOptions,EdgeOptions,FirefoxOPTIONS
    public static void verifyIncognito(){
        ChromeOptions chromeOptions = new ChromeOptions();
        //headless mode- No UI Will be shown
        //incognito
        //window->size
        //Extension adding steps:
        //1.download the extension
        //2.crx extractor
        chromeOptions.addArguments("--window-size=1920,1080");
        chromeOptions.addExtensions(new File("src/test"));
        chromeOptions.addArguments("--incognito");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ChromeDriver driver = new ChromeDriver();
    }
}
