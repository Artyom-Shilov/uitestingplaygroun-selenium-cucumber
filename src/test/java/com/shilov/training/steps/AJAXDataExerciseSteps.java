package com.shilov.training.steps;

import com.shilov.training.pages.AJAXDataExercisePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.shilov.training.utills.PageManager.*;

public class AJAXDataExerciseSteps extends BaseStep {

    private AJAXDataExercisePage ajaxDataExercisePage = getAJAXDataExercisePage();

    @Given("ajax data exercise page is opened")
    public void openExercisePage() {
        homePage.openAJAXDataExercisePage();
    }

    @When("user clicks ajax request trigger button")
    public void clickTriggerButton() {
        ajaxDataExercisePage.clickTriggerButton();
    }

    @Then("text of appeared element should be {string}")
    public void checkTextOfAppearedElement(String text) {
        Assert.assertEquals(ajaxDataExercisePage.getTextFromAppearedLabel(), text);
    }

}
