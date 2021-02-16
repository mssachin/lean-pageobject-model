package com.qualitest.assessment.application.actions;

import com.qualitest.assessment.application.initializers.UIContext;
import com.qualitest.assessment.application.pageobjects.ProductDetailPage;
import com.qualitest.assessment.application.utilities.ObjectHandling;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class AddProductToCart extends UIContext {
    public void addsProductToCart(){
        driver.switchTo().frame(0);
        ObjectHandling.linkOrButtonClick(driver, ProductDetailPage.ADD_TO_CART_BUTTON);
        driver.switchTo().defaultContent();

    }
}
