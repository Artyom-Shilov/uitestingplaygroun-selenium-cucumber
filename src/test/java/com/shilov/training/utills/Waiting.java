package com.shilov.training.utills;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiting {

    public static WebElement waitForBeingClickable(WebDriver driver, long waitDurationInSeconds, WebElement element) {
        return new WebDriverWait(driver, Duration.ofSeconds(waitDurationInSeconds))
                .until(ExpectedConditions.elementToBeClickable(element));
    }
}
