package com.shilov.training.steps;

import com.shilov.training.pages.HiddenLayersExercisePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.shilov.training.utills.PageManager.*;

public class HiddenLayersExerciseSteps extends BaseStep {

    private HiddenLayersExercisePage hiddenLayersExercisePage = getHiddenLayersExercisePage();

    @Given("hidden layer exercise page is opened")
    public void openExercisePage() {
        homePage.openHiddenLayersExercisePage();
    }

    @When("user clicks green button")
    public void user_clicks_green_button() {
       hiddenLayersExercisePage.clickGreenButton();
    }

    @Then("user clicks overlapping button")
    public void user_clicks_overlapping_button() {
       hiddenLayersExercisePage.clickBlueButton();
    }
}
