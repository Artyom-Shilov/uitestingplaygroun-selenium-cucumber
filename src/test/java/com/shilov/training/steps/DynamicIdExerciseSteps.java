package com.shilov.training.steps;

import com.shilov.training.pages.HomePage;
import com.shilov.training.utills.PageManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.shilov.training.utills.PageManager.*;

public class DynamicIdExerciseSteps {

    @Given("dynamic id exercise page is opened")
    public void openExercisePage() {
        getHomePage().openHomePage().openDynamicIdExercisePage();
    }

    @Then("user clicks button with dynamic id")
    public void clickButton() {
       getDynamicIdExercisePage().clickButtonWithDynamicId();
    }
}
