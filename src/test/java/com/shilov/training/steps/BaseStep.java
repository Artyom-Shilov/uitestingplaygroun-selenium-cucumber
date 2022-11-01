package com.shilov.training.steps;

import com.shilov.training.pages.HomePage;

import static com.shilov.training.utills.PageManager.getHomePage;

public abstract class BaseStep {

    protected HomePage homePage = getHomePage();

    public BaseStep() {
        homePage.openHomePage();
    }

}
