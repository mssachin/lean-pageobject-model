package com.qualitest.assessment.application.actions;

import com.qualitest.assessment.application.initializers.UIContext;
import com.qualitest.assessment.application.pageobjects.PaymentMethodPage;
import com.qualitest.assessment.application.utilities.ObjectHandling;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class SelectsPaymentMethod extends UIContext {

    public void forTheOrder(){
        ObjectHandling.linkOrButtonClick(driver, PaymentMethodPage.PAY_BY_BANK_WIRE_LINK);
    }
}
