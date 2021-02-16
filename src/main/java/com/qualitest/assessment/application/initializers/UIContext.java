package com.qualitest.assessment.application.initializers;


import com.qualitest.assessment.application.utilities.ApplicationContextProvider;
import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component("base")
@DependsOn("applicationContext")
public class UIContext {

    protected WebDriver driver;

    public UIContext() {
        this.driver = ApplicationContextProvider.getApplicationContext().getBean(UIAutomationSpec.class).getChromeDriver();
    }
}
