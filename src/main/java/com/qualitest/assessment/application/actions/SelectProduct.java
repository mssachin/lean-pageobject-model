package com.qualitest.assessment.application.actions;

import com.qualitest.assessment.application.initializers.UIContext;
import com.qualitest.assessment.application.pageobjects.SearchResultsPage;
import com.qualitest.assessment.application.utilities.ObjectHandling;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;


@Component
@DependsOn("base")
public class SelectProduct extends UIContext {
    public void named(String productName){
        ObjectHandling.linkOrButtonClick(driver, SearchResultsPage.PRODUCT_QUICK_VIEW);
    }
}
