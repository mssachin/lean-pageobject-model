package com.qualitest.assessment.application.runners;

import com.qualitest.assessment.application.initializers.UIAutomationSpec;
import com.qualitest.assessment.application.utilities.ApplicationContextProvider;
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
