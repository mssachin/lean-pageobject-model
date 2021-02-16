package com.qualitest.assessment.application.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ObjectHandling {

    public static void linkOrButtonClick(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public static void enterTextInTextBox(WebDriver driver, By locator, String textToEnter) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(textToEnter);
    }

    public static String extractTextFromWebElement(WebDriver driver, By locator){
        WebDriverWait wait = new WebDriverWait(driver, 30);
       return wait.until(ExpectedConditions.presenceOfElementLocated(locator)).getText();
    }

    public static void clearInput(WebDriver driver, By locator){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator)).clear();
    }

    public static void jsElementClick(WebDriver driver, By locator){
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.click(element).build().perform();
    }



}
