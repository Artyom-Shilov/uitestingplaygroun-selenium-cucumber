package com.shilov.training.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
        features = "src/test/java/com/shilov/training/features/exercises.feature",
        glue = "com.shilov.training.steps"
)

public class ExercisesTests extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
