package com.shilov.training.pages;

import com.shilov.training.utills.Waiting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    private static final String HOME_PAGE_URL = "http://uitestingplayground.com/";

    @FindBy(xpath = "//a[@href = '/dynamicid']")
    private WebElement dynamicIdExerciseLink;

    @FindBy(xpath = "//a[@href = '/classattr']")
    private WebElement classAttributeExerciseLink;

    @FindBy(xpath = "//a[@href = '/hiddenlayers']")
    private WebElement hiddenLayersExerciseLink;

    @FindBy(xpath = "//a[@href = '/loaddelay']")
    private WebElement loadDelayExerciseLink;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage openHomePage() {
        driver.get(HOME_PAGE_URL);
        return this;
    }

    public void openDynamicIdExercisePage() {
        Waiting.waitForBeingClickable(driver, 10, dynamicIdExerciseLink).click();
    }

    public void openClassAttributeExercisePage() {
        Waiting.waitForBeingClickable(driver, 10, classAttributeExerciseLink).click();
    }

    public void openHiddenLayersExercisePage() {
        Waiting.waitForBeingClickable(driver, 10, hiddenLayersExerciseLink).click();
    }

    public void openLoadDelayExercisePage() {
        Waiting.waitForBeingClickable(driver, 10, loadDelayExerciseLink).click();
    }

}
