package com.qualitest.assessment.application.actions;

import com.qualitest.assessment.application.initializers.UIContext;
import com.qualitest.assessment.application.pageobjects.ProceedToCheckoutPage;
import com.qualitest.assessment.application.utilities.ObjectHandling;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class ProceedToCheckout extends UIContext {

    public void proceedsToCheckout(){
        ObjectHandling.linkOrButtonClick(driver, ProceedToCheckoutPage.PROCEED_TO_CHECKOUT_LINK);
    }
}
