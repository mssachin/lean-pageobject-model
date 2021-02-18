package com.lean.pageobject.model.actions;

import com.lean.pageobject.model.initializers.UIContext;
import com.lean.pageobject.model.pageobjects.MyAccountPage;
import com.lean.pageobject.model.pageobjects.PersonalInformationPage;
import com.lean.pageobject.model.utilities.ObjectHandling;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class UpdatesFirstNameAndSavesTheChanges extends UIContext {

    public void toANewName(){
        ObjectHandling.linkOrButtonClick(driver, MyAccountPage.PERSONAL_INFORMATION_LINK);
        ObjectHandling.clearInput(driver, PersonalInformationPage.FIRST_NAME_INPUT);
        ObjectHandling.enterTextInTextBox(driver, PersonalInformationPage.FIRST_NAME_INPUT, "New Name");
        ObjectHandling.enterTextInTextBox(driver, PersonalInformationPage.OLD_PWD_INPUT, "Test123");
        ObjectHandling.enterTextInTextBox(driver, PersonalInformationPage.NEW_PWD_INPUT, "Test123");
        ObjectHandling.enterTextInTextBox(driver, PersonalInformationPage.CONFIRMATION_INPUT, "Test123");
        ObjectHandling.linkOrButtonClick(driver, PersonalInformationPage.SUBMIT_BUTTON);
    }
}
