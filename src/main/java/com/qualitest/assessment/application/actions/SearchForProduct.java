package com.qualitest.assessment.application.actions;

import com.qualitest.assessment.application.initializers.UIContext;
import com.qualitest.assessment.application.pageobjects.LandingPage;
import com.qualitest.assessment.application.utilities.ObjectHandling;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class SearchForProduct extends UIContext {

    public void onTheSiteNamed(String productName){
        ObjectHandling.enterTextInTextBox(driver, LandingPage.SEARCH_TEXT_BOX_TOP, productName);
        ObjectHandling.linkOrButtonClick(driver, LandingPage.SUBMIT_BUTTON);
    }
}
