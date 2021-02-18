package com.lean.pageobject.model.actions;

import com.lean.pageobject.model.utilities.ObjectHandling;
import com.lean.pageobject.model.initializers.UIContext;
import com.lean.pageobject.model.pageobjects.PaymentMethodPage;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class SelectsPaymentMethod extends UIContext {

    public void forTheOrder(){
        ObjectHandling.linkOrButtonClick(driver, PaymentMethodPage.PAY_BY_BANK_WIRE_LINK);
    }
}
