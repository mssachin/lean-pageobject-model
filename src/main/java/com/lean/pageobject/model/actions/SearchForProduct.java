package com.lean.pageobject.model.actions;

import com.lean.pageobject.model.initializers.UIContext;
import com.lean.pageobject.model.utilities.ObjectHandling;
import com.lean.pageobject.model.pageobjects.LandingPage;
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
