package com.qualitest.assessment.application.actions;

import com.qualitest.assessment.application.initializers.UIContext;
import com.qualitest.assessment.application.pageobjects.ConfirmOrderPage;
import com.qualitest.assessment.application.pageobjects.OrderConfirmationPage;
import com.qualitest.assessment.application.utilities.ObjectHandling;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class ConfirmsOrderAndViewsOrderHistory extends UIContext {

    public void forTheOrder(){
        ObjectHandling.linkOrButtonClick(driver, ConfirmOrderPage.CONFIRM_ORDER_BUTTON);
        ObjectHandling.linkOrButtonClick(driver, OrderConfirmationPage.BACK_TO_ORDERS_LINK);
    }
}
