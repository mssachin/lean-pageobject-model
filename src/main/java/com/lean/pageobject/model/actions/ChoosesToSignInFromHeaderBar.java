package com.lean.pageobject.model.actions;

import com.lean.pageobject.model.utilities.ObjectHandling;
import com.lean.pageobject.model.initializers.UIContext;
import com.lean.pageobject.model.pageobjects.HeaderBar;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;


@Component
@DependsOn("base")
public class ChoosesToSignInFromHeaderBar extends UIContext {
    public void intoTheShop(){
        ObjectHandling.linkOrButtonClick(driver, HeaderBar.SIGN_IN_LINK);
    }
}
