package com.qualitest.assessment.application.pageobjects;

import org.openqa.selenium.By;

public class HeaderBar {
    public static final By SIGN_IN_LINK = By.xpath("//a[@class='login']");
    public static final By LOG_OUT_LINK = By.xpath("//a[@title='Log me out']");
}
