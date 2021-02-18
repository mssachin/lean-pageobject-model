package com.lean.pageobject.model.actions;

import com.lean.pageobject.model.initializers.UIContext;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("base")
public class LaunchURL extends UIContext {
    public void toOnlineShop(){
        driver.get("http://automationpractice.com/");
    }
}

