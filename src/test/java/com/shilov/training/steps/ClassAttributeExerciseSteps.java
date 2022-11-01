package com.shilov.training.steps;

import com.shilov.training.pages.ClassAttributeExercisePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.shilov.training.utills.PageManager.*;

public class ClassAttributeExerciseSteps extends BaseStep {

    private ClassAttributeExercisePage classAttributeExercisePage = getClassAttributeExercisePage();

    @Given("class attribute exercise page is opened")
    public void openExercisePage() {
        homePage.openClassAttributeExercisePage();
    }

    @When("user clicks button by class attribute")
    public void clickBlueButton() {
        classAttributeExercisePage.clickBlueButton();
    }

    @Then("alert with text {string} appeared")
    public void checkAlertMessageAndHide(String text) {
        Assert.assertEquals(classAttributeExercisePage.getTextFromAlert(), text);
        classAttributeExercisePage.handleAlert();
    }
}
