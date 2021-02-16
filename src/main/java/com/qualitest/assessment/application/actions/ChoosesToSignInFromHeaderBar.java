package com.qualitest.assessment.application.actions;

import com.qualitest.assessment.application.initializers.UIContext;
import com.qualitest.assessment.application.pageobjects.HeaderBar;
import com.qualitest.assessment.application.utilities.ObjectHandling;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;


@Component
@DependsOn("base")
public class ChoosesToSignInFromHeaderBar extends UIContext {
    public void intoTheShop(){
        ObjectHandling.linkOrButtonClick(driver, HeaderBar.SIGN_IN_LINK);
    }
}
