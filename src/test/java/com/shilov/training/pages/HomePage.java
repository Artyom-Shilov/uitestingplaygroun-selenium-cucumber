package com.shilov.training.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    private final Logger logger = LogManager.getLogger(HomePage.class);

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

    @FindBy(xpath = "//a[@href = '/scrollbars']")
    private WebElement scrollbarsExerciseLink;

    @FindBy(xpath = "//a[@href = '/visibility']")
    private WebElement visibilityExerciseLink;

    @FindBy(xpath = "//a[@href = '/mouseover']")
    private WebElement mouseOverExerciseLink;

    @FindBy(xpath = "//a[@href = '/sampleapp']")
    private WebElement sampleAppExerciseLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage openHomePage() {
        driver.get(HOME_PAGE_URL);
        return this;
    }

    public void openDynamicIdExercisePage() {
        waitForBeingClickable(10, dynamicIdExerciseLink).click();
        logger.debug("dynamic id exercise link has been clicked");
    }

    public void openClassAttributeExercisePage() {
        waitForBeingClickable(10, classAttributeExerciseLink).click();
        logger.debug("class attribute exercise link has been clicked");

    }

    public void openHiddenLayersExercisePage() {
        waitForBeingClickable(10, hiddenLayersExerciseLink).click();
        logger.debug("hidden layers exercise link has been clicked");
    }

    public void openLoadDelayExercisePage() {
        waitForBeingClickable(10, loadDelayExerciseLink).click();
        logger.debug("load delay exercise link has been clicked");

    }

    public void openAJAXDataExercisePage() {
        waitForBeingClickable(10, ajaxDataExerciseLink).click();
        logger.debug("ajax data exercise link has been clicked");

    }

    public void openClientSideDelayExercisePage() {
        waitForBeingClickable(10, clientDelayExerciseLink).click();
        logger.debug("client delay exercise link has been clicked");
    }

    public void openClickExercisePage() {
        waitForBeingClickable(10, clickExerciseLink).click();
        logger.debug("click exercise link has been clicked");
    }

    public void openTextInputExercisePage() {
        waitForBeingClickable(10, textInputExerciseLink).click();
        logger.debug("text input exercise link has been clicked");

    }

    public void openProgressBarExercisePage() {
        waitForBeingClickable(10, progressBarExerciseLink).click();
        logger.debug("progress bar exercise link has been clicked");
    }

    public void openDynamicTableExercisePage() {
        waitForBeingClickable(10, dynamicTableExerciseLink).click();
        logger.debug("dynamic table exercise link has been clicked");
    }

    public void openScrollbarsExercisePage() {
        waitForBeingClickable(10, scrollbarsExerciseLink).click();
        logger.debug("scroll bar exercise link has been clicked");
    }

    public void openVisibilityExercisePage() {
        waitForBeingClickable(10, visibilityExerciseLink).click();
        logger.debug("visibility exercise link has been clicked");
    }

    public void openMouseOverExercisePage() {
        waitForBeingClickable(10, mouseOverExerciseLink).click();
        logger.debug("mouse over exercise link has been clicked");
    }

    public void openSampleAppExercisePage() {
        waitForBeingClickable(10, sampleAppExerciseLink).click();
        logger.debug("sample app exercise link has been clicked");
    }
}
