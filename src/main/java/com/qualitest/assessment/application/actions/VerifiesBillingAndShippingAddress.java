package com.qualitest.assessment.application.actions;

import com.qualitest.assessment.application.initializers.UIContext;
import com.qualitest.assessment.application.pageobjects.VerifyBillingAndShippingAddressPage;
import com.qualitest.assessment.application.utilities.ObjectHandling;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class VerifiesBillingAndShippingAddress extends UIContext {

    public void forTheOrder(){
        ObjectHandling.linkOrButtonClick(driver, VerifyBillingAndShippingAddressPage.PROCESS_ADDRESS_BUTTON);
    }
}
