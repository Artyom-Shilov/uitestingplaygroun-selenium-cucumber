package com.shilov.training.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        plugin = "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
        features = "src/test/java/com/shilov/training/features/exercises.feature",
        glue = "com.shilov.training.steps"
)

@Test
public class ExercisesRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
