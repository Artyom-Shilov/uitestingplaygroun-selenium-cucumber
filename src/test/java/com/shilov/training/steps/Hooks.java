package com.shilov.training.steps;

import com.shilov.training.driver.DriverUtil;
import com.shilov.training.utills.PageManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @After
    public void setAfter() {
        DriverUtil.quitDriver();
    }
}
