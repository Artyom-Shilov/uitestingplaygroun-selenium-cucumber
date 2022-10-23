package com.shilov.training.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.shilov.training.utills.PageManager.*;

public class HiddenLayersExerciseSteps {

    @Given("hidden layer exercise page is opened")
    public void openExercisePage() {
        getHomePage().openHomePage().openHiddenLayersExercisePage();
    }
    @When("user clicks green button")
    public void user_clicks_green_button() {
       getHiddenLayersExercisePage().clickGreenButton();
    }
    @Then("user clicks overlapping button")
    public void user_clicks_overlapping_button() {
        getHiddenLayersExercisePage().clickBlueButton();
    }
}
