package com.qualitest.assessment.application.actions;

import com.qualitest.assessment.application.initializers.UIContext;
import com.qualitest.assessment.application.pageobjects.SummaryPage;
import com.qualitest.assessment.application.utilities.ObjectHandling;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class ConfirmOrderOnSummary extends UIContext {

    public void confirmsOrderOnSummaryPage(){
        ObjectHandling.linkOrButtonClick(driver, SummaryPage.PROCEED_TO_CHECKOUT_ON_SUMMARY_PAGE_LINK);
    }
}
