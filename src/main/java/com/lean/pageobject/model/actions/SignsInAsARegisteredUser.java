package com.lean.pageobject.model.actions;

import com.lean.pageobject.model.initializers.UIContext;
import com.lean.pageobject.model.pageobjects.SignInPage;
import com.lean.pageobject.model.utilities.ObjectHandling;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class SignsInAsARegisteredUser extends UIContext {

    public void intoTheOnlineShop(){
        ObjectHandling.enterTextInTextBox(driver, SignInPage.USERNAME_INPUT, "sachin.mylavarapu@gmail.com");
        ObjectHandling.enterTextInTextBox(driver, SignInPage.PASSWORD_INPUT, "Test123");
        ObjectHandling.linkOrButtonClick(driver, SignInPage.SIGN_IN_BUTTON);
    }
}
