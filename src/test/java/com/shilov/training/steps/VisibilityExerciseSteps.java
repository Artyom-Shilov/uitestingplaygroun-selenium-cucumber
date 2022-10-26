package com.shilov.training.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import java.util.Map;

import static com.shilov.training.utills.PageManager.*;

public class VisibilityExerciseSteps {

    @Given("visibility exercise page is opened")
    public void openExercisePage() {
        getHomePage().openHomePage().openVisibilityExercisePage();
    }

    @When("user clicks hide button")
    public void clickHideButton() {
        getVisibilityExercisePage().clickHideButton();
    }

    @Then("display statuses of other buttons should be")
    public void checkDisplayStatusesOfButtons(DataTable expectedStatuses) {
        Map<String, Boolean> expectedStatusesMap = expectedStatuses.asMap(String.class, Boolean.class);
        Map<String, Boolean> actualStatusesMap = getVisibilityExercisePage().getDisplayStatusesOfButtons();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualStatusesMap.get("opacity0Button"), expectedStatusesMap.get("opacity0Button"));
        softAssert.assertEquals(actualStatusesMap.get("removedButton"), expectedStatusesMap.get("removedButton"));
        softAssert.assertEquals(actualStatusesMap.get("visibilityHiddenButton"), expectedStatusesMap.get("visibilityHiddenButton"));
        softAssert.assertEquals(actualStatusesMap.get("zeroWidthButton"), expectedStatusesMap.get("zeroWidthButton"));
        softAssert.assertEquals(actualStatusesMap.get("displayNoneButton"), expectedStatusesMap.get("displayNoneButton"));
        softAssert.assertEquals(actualStatusesMap.get("overlappedButton"), expectedStatusesMap.get("overlappedButton"));
        softAssert.assertEquals(actualStatusesMap.get("offscreenButton"), expectedStatusesMap.get("offscreenButton"));
        softAssert.assertAll();
    }
}
