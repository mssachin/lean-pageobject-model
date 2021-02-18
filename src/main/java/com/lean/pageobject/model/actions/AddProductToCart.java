package com.lean.pageobject.model.actions;

import com.lean.pageobject.model.initializers.UIContext;
import com.lean.pageobject.model.pageobjects.ProductDetailPage;
import com.lean.pageobject.model.utilities.ObjectHandling;
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
