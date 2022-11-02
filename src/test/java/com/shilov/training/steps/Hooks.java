package com.shilov.training.steps;

import com.shilov.training.driver.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

public class Hooks {

    @After
    public void setAfter(Scenario scenario) {
        if (scenario.isFailed()) {
            Allure.addAttachment("Screenshot",
                    new ByteArrayInputStream(((TakesScreenshot)DriverUtil.getDriver()).getScreenshotAs(OutputType.BYTES))
            );
        }
        DriverUtil.quitDriver();
    }
}
