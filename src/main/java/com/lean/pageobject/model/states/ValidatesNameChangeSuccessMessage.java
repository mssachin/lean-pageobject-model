package com.lean.pageobject.model.states;

import com.lean.pageobject.model.initializers.UIContext;
import com.lean.pageobject.model.pageobjects.PersonalInformationPage;
import com.lean.pageobject.model.utilities.ObjectHandling;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;


@Component
@DependsOn("base")
public class ValidatesNameChangeSuccessMessage extends UIContext {
    public String inTheAccount(){
        return ObjectHandling.extractTextFromWebElement(driver, PersonalInformationPage.SUCCESS_MESSAGE);
    }
}
