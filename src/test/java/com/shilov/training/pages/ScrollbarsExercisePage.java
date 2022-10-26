package com.shilov.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ScrollbarsExercisePage extends BasePage {

    @FindBy(id = "hidingButton")
    private WebElement hidingButton;

    public ScrollbarsExercisePage(WebDriver driver) {
        super(driver);
    }

    public ScrollbarsExercisePage scrollToHidingButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(hidingButton).build().perform();
        return this;
    }

    public ScrollbarsExercisePage clickHidingButton() {
        hidingButton.click();
        return this;
    }
}
