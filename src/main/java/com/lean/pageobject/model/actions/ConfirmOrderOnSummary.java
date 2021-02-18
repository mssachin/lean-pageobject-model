package com.lean.pageobject.model.actions;

import com.lean.pageobject.model.initializers.UIContext;
import com.lean.pageobject.model.pageobjects.SummaryPage;
import com.lean.pageobject.model.utilities.ObjectHandling;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class ConfirmOrderOnSummary extends UIContext {

    public void confirmsOrderOnSummaryPage(){
        ObjectHandling.linkOrButtonClick(driver, SummaryPage.PROCEED_TO_CHECKOUT_ON_SUMMARY_PAGE_LINK);
    }
}
