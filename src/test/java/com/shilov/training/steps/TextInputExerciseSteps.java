package com.shilov.training.steps;

import com.shilov.training.pages.TextInputExercisePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.shilov.training.utills.PageManager.*;

public class TextInputExerciseSteps extends BaseStep {

    private TextInputExercisePage textInputExercisePage = getTextInputExercisePage();

    @Given("text input exercise page is opened")
    public void openExercisePage() {
       homePage.openTextInputExercisePage();
    }

    @When("user enters new button name {string}")
    public void enterNewButtonName(String newButtonName) {
       textInputExercisePage.enterNewNameForButton(newButtonName);
    }

    @When("user applies name")
    public void applyNewButtonName() {
        textInputExercisePage.applyNewNameForButton();
    }

    @Then("button name should be changed to {string}")
    public void checkButtonName(String expectedButtonName) {
        Assert.assertEquals(textInputExercisePage.getButtonName(), expectedButtonName);
    }
}
