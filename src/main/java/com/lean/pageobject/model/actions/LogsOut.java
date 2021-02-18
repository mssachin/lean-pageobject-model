package com.lean.pageobject.model.actions;

import com.lean.pageobject.model.initializers.UIContext;
import com.lean.pageobject.model.utilities.ObjectHandling;
import com.lean.pageobject.model.pageobjects.HeaderBar;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class LogsOut extends UIContext {

    public void ofTheShop(){
        ObjectHandling.linkOrButtonClick(driver, HeaderBar.LOG_OUT_LINK);
    }
}
