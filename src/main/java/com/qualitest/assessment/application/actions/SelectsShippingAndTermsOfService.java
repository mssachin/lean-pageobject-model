package com.qualitest.assessment.application.actions;

import com.qualitest.assessment.application.initializers.UIContext;
import com.qualitest.assessment.application.pageobjects.ShippingAndTermsOfServicePage;
import com.qualitest.assessment.application.utilities.ObjectHandling;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class SelectsShippingAndTermsOfService extends UIContext {

    public void toContinue(){
        ObjectHandling.linkOrButtonClick(driver,ShippingAndTermsOfServicePage.ACCEPT_TERMS_OF_SERVICE_INPUT);
        ObjectHandling.linkOrButtonClick(driver,ShippingAndTermsOfServicePage.PROCESS_CARRIER_BUTTON);
    }
}
