package com.lean.pageobject.model.actions;

import com.lean.pageobject.model.utilities.ObjectHandling;
import com.lean.pageobject.model.initializers.UIContext;
import com.lean.pageobject.model.pageobjects.ShippingAndTermsOfServicePage;
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
