package com.shilov.training.steps;

import com.shilov.training.pages.VisibilityExercisePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import java.util.Map;

import static com.shilov.training.utills.PageManager.*;

public class VisibilityExerciseSteps extends BaseStep {

    private VisibilityExercisePage visibilityExercisePage = getVisibilityExercisePage();

    @Given("visibility exercise page is opened")
    public void openExercisePage() {
        homePage.openVisibilityExercisePage();
    }

    @When("user clicks hide button")
    public void clickHideButton() {
        visibilityExercisePage.clickHideButton();
    }

    @Then("display statuses of other buttons should be")
    public void checkDisplayStatusesOfButtons(DataTable expectedStatuses) {
        Map<String, String> expectedStatusesMap = expectedStatuses.asMap(String.class, String.class);
        Map<String, Boolean> actualStatusesMap = visibilityExercisePage.getDisplayStatusesOfButtons();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualStatusesMap.get("opacity0Button").toString(), expectedStatusesMap.get("opacity0Button"), "opacity0Button failed");
        softAssert.assertEquals(actualStatusesMap.get("removedButton").toString(), expectedStatusesMap.get("removedButton"), "removedButton failed");
        softAssert.assertEquals(actualStatusesMap.get("visibilityHiddenButton").toString(), expectedStatusesMap.get("visibilityHiddenButton"), "visibilityHiddenButton failed");
        softAssert.assertEquals(actualStatusesMap.get("zeroWidthButton").toString(), expectedStatusesMap.get("zeroWidthButton"), "zeroWidthButton failed");
        softAssert.assertEquals(actualStatusesMap.get("displayNoneButton").toString(), expectedStatusesMap.get("displayNoneButton"), "displayNoneButton failed");
        softAssert.assertEquals(actualStatusesMap.get("overlappedButton").toString(), expectedStatusesMap.get("overlappedButton"), "overlappedButton failed");
        softAssert.assertEquals(actualStatusesMap.get("offscreenButton").toString(), expectedStatusesMap.get("offscreenButton"), "offscreenButton failed");
        softAssert.assertAll();
    }
}
