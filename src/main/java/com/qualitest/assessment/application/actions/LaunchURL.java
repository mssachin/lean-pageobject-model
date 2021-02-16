package com.qualitest.assessment.application.actions;

import com.qualitest.assessment.application.initializers.UIContext;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class LaunchURL extends UIContext {
    public void toOnlineShop(){
        driver.get("http://automationpractice.com/");
    }
}

