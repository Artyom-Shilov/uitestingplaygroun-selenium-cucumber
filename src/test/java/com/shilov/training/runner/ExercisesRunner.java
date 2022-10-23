package com.shilov.training.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/shilov/training/features/exercises.feature",
        glue = "com.shilov.training.steps"
)
public class ExercisesRunner extends AbstractTestNGCucumberTests {

}
