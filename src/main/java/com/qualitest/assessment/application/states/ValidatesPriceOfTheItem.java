package com.qualitest.assessment.application.states;

import com.qualitest.assessment.application.initializers.UIContext;
import com.qualitest.assessment.application.pageobjects.OrderHistoryPage;
import com.qualitest.assessment.application.utilities.ObjectHandling;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class ValidatesPriceOfTheItem extends UIContext {
    public String purchased(){
        return ObjectHandling.extractTextFromWebElement(driver, OrderHistoryPage.FIRST_ITEM_IN_TABLE_PRICE_COLUMN);
    }
}
