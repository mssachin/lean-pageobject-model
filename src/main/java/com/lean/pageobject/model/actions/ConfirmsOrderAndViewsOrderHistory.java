package com.lean.pageobject.model.actions;

import com.lean.pageobject.model.utilities.ObjectHandling;
import com.lean.pageobject.model.initializers.UIContext;
import com.lean.pageobject.model.pageobjects.ConfirmOrderPage;
import com.lean.pageobject.model.pageobjects.OrderConfirmationPage;
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
