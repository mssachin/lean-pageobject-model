package com.qualitest.assessment.application.states;

import com.qualitest.assessment.application.initializers.UIContext;
import com.qualitest.assessment.application.pageobjects.PersonalInformationPage;
import com.qualitest.assessment.application.utilities.ObjectHandling;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;


@Component
@DependsOn("base")
public class ValidatesNameChangeSuccessMessage extends UIContext {
    public String inTheAccount(){
        return ObjectHandling.extractTextFromWebElement(driver, PersonalInformationPage.SUCCESS_MESSAGE);
    }
}
