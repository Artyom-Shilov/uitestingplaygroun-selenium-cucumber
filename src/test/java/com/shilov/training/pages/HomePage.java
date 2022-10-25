package com.shilov.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.shilov.training.utills.Waiting.*;

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

    @FindBy(xpath = "//a[@href = '/ajax']")
    private WebElement ajaxDataExerciseLink;

    @FindBy(xpath = "//a[@href = '/clientdelay']")
    private WebElement clientDelayExerciseLink;

    @FindBy(xpath = "//a[@href = '/click']")
    private WebElement clickExerciseLink;

    @FindBy(xpath = "//a[@href = '/textinput']")
    private WebElement textInputExerciseLink;

    @FindBy(xpath = "//a[@href = '/progressbar']")
    private WebElement progressBarExerciseLink;

    @FindBy(xpath = "//a[@href = '/dynamictable']")
    private WebElement dynamicTableExerciseLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage openHomePage() {
        driver.get(HOME_PAGE_URL);
        return this;
    }

    public void openDynamicIdExercisePage() {
        waitForBeingClickable(driver, 10, dynamicIdExerciseLink).click();
    }

    public void openClassAttributeExercisePage() {
        waitForBeingClickable(driver, 10, classAttributeExerciseLink).click();
    }

    public void openHiddenLayersExercisePage() {
        waitForBeingClickable(driver, 10, hiddenLayersExerciseLink).click();
    }

    public void openLoadDelayExercisePage() {
        waitForBeingClickable(driver, 10, loadDelayExerciseLink).click();
    }

    public void openAJAXDataExercisePage() {
        waitForBeingClickable(driver, 10, ajaxDataExerciseLink).click();
    }

    public void openClientSideDelayExercisePage() {
        waitForBeingClickable(driver, 10, clientDelayExerciseLink).click();
    }

    public void openClickExercisePage() {
        waitForBeingClickable(driver, 10, clickExerciseLink).click();
    }

    public void openTextInputExercisePage() {
        waitForBeingClickable(driver, 10, textInputExerciseLink).click();
    }

    public void openProgressBarExercisePage() {
        waitForBeingClickable(driver, 10, progressBarExerciseLink).click();
    }

    public void openDynamicTableExercisePage() {
        waitForBeingClickable(driver, 10, dynamicTableExerciseLink).click();
    }

}
