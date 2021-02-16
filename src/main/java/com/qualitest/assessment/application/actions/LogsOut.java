package com.qualitest.assessment.application.actions;

import com.qualitest.assessment.application.initializers.UIContext;
import com.qualitest.assessment.application.pageobjects.HeaderBar;
import com.qualitest.assessment.application.utilities.ObjectHandling;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class LogsOut extends UIContext {

    public void ofTheShop(){
        ObjectHandling.linkOrButtonClick(driver, HeaderBar.LOG_OUT_LINK);
    }
}
