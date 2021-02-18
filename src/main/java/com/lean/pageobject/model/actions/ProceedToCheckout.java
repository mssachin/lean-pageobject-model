package com.lean.pageobject.model.actions;

import com.lean.pageobject.model.utilities.ObjectHandling;
import com.lean.pageobject.model.initializers.UIContext;
import com.lean.pageobject.model.pageobjects.ProceedToCheckoutPage;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class ProceedToCheckout extends UIContext {

    public void proceedsToCheckout(){
        ObjectHandling.linkOrButtonClick(driver, ProceedToCheckoutPage.PROCEED_TO_CHECKOUT_LINK);
    }
}
