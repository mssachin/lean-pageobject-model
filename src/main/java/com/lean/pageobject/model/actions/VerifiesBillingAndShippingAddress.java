package com.lean.pageobject.model.actions;

import com.lean.pageobject.model.initializers.UIContext;
import com.lean.pageobject.model.pageobjects.VerifyBillingAndShippingAddressPage;
import com.lean.pageobject.model.utilities.ObjectHandling;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class VerifiesBillingAndShippingAddress extends UIContext {

    public void forTheOrder(){
        ObjectHandling.linkOrButtonClick(driver, VerifyBillingAndShippingAddressPage.PROCESS_ADDRESS_BUTTON);
    }
}
