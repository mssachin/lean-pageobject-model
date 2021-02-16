package com.qualitest.assessment.application.initializers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component("uispec")
public class UIAutomationSpec {

    public WebDriver chromeDriver;

    public UIAutomationSpec() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        this.chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    public WebDriver getChromeDriver() {
        return chromeDriver;
    }
}


