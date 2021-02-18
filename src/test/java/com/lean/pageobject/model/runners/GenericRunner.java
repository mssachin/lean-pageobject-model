package com.lean.pageobject.model.runners;

import com.lean.pageobject.model.initializers.UIAutomationSpec;
import com.lean.pageobject.model.utilities.ApplicationContextProvider;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = {"src/test/resources/features/"},
        glue = {"com.qualitest.assessment.application.stepdefinitions"}
)
public class GenericRunner {

    @AfterClass
    public static void tearDown() {
        ApplicationContextProvider.getApplicationContext().getBean(UIAutomationSpec.class).getChromeDriver().quit();
    }

}
