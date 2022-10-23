package com.shilov.training.steps;

import com.shilov.training.utills.PageManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.shilov.training.utills.PageManager.*;

public class LoadDelayExerciseSteps {

    @Given("load delay exercise page is opened")
    public void openExercisePage() {
        getHomePage().openHomePage().openLoadDelayExercisePage();
    }

    @Then("user clicks button appearing after delay")
    public void clickButton() {
        getLoadDelayExercisePage().clickButtonAppearingAfterDelay();
    }

}
