package com.shilov.training.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.shilov.training.utills.PageManager.*;

public class TextInputExerciseSteps {

    @Given("text input exercise page is opened")
    public void openExercisePage() {
        getHomePage().openHomePage().openTextInputExercisePage();
    }

    @When("user enters new button name {string}")
    public void enterNewButtonName(String newButtonName) {
        getTextInputExercisePage().enterNewNameForButton(newButtonName);
    }

    @When("user applies name")
    public void applyNewButtonName() {
        getTextInputExercisePage().applyNewNameForButton();
    }

    @Then("button name should be changed to {string}")
    public void checkButtonName(String expectedButtonName) {
        Assert.assertEquals(getTextInputExercisePage().getButtonName(), expectedButtonName);
    }
}
