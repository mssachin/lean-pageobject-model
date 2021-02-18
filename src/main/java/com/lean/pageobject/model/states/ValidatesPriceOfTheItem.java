package com.lean.pageobject.model.states;

import com.lean.pageobject.model.utilities.ObjectHandling;
import com.lean.pageobject.model.initializers.UIContext;
import com.lean.pageobject.model.pageobjects.OrderHistoryPage;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class ValidatesPriceOfTheItem extends UIContext {
    public String purchased(){
        return ObjectHandling.extractTextFromWebElement(driver, OrderHistoryPage.FIRST_ITEM_IN_TABLE_PRICE_COLUMN);
    }
}
