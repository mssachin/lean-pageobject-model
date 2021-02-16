package com.qualitest.assessment.application.pageobjects;

import org.openqa.selenium.By;

public class PersonalInformationPage {

    public static final By FIRST_NAME_INPUT = By.name("firstname");
    public static final By OLD_PWD_INPUT = By.name("old_passwd");
    public static final By NEW_PWD_INPUT = By.name("passwd");
    public static final By CONFIRMATION_INPUT = By.name("confirmation");
    public static final By SUBMIT_BUTTON = By.name("submitIdentity");
    public static final By SUCCESS_MESSAGE = By.xpath("//p[@class='alert alert-success']");
}
