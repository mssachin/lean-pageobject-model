package com.lean.pageobject.model.actions;

import com.lean.pageobject.model.utilities.ObjectHandling;
import com.lean.pageobject.model.initializers.UIContext;
import com.lean.pageobject.model.pageobjects.SearchResultsPage;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;


@Component
@DependsOn("base")
public class SelectProduct extends UIContext {
    public void named(String productName){
        ObjectHandling.linkOrButtonClick(driver, SearchResultsPage.PRODUCT_QUICK_VIEW);
    }
}
