package com.shilov.training.steps;

import com.shilov.training.pages.LoadDelayExercisePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.shilov.training.utills.PageManager.*;

public class LoadDelayExerciseSteps extends BaseStep {

    private LoadDelayExercisePage loadDelayExercisePage = getLoadDelayExercisePage();

    @Given("load delay exercise page is opened")
    public void openExercisePage() {
        homePage.openLoadDelayExercisePage();
    }

    @Then("user clicks button appearing after delay")
    public void clickButton() {
        loadDelayExercisePage.clickButtonAppearingAfterDelay();
    }

}
