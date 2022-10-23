package com.shilov.training.utills;

import com.shilov.training.driver.DriverUtil;
import com.shilov.training.pages.*;

import java.util.Map;

public class PageManager {

    private PageManager(){}

    private static Map<String, BasePage> pages;

    public static void resetPages() {
        pages = Map.of(
                "homePage", new HomePage(DriverUtil.getDriver()),
                "dynamicIdExercisePage", new DynamicIdExercisePage(DriverUtil.getDriver()),
                "classAttributeExercisePage", new ClassAttributeExercisePage(DriverUtil.getDriver()),
                "hiddenLayersExercisePage", new HiddenLayersExercisePage(DriverUtil.getDriver()),
                "loadDelayExercisePage", new LoadDelayExercisePage(DriverUtil.getDriver())
        );
    }

    public static HomePage getHomePage() {
        return (HomePage)pages.get("homePage");
    }

    public static DynamicIdExercisePage getDynamicIdExercisePage() {
        return (DynamicIdExercisePage) pages.get("dynamicIdExercisePage");
    }

    public static ClassAttributeExercisePage getClassAttributeExercisePage() {
        return (ClassAttributeExercisePage) pages.get("classAttributeExercisePage");
    }

    public static HiddenLayersExercisePage getHiddenLayersExercisePage() {
        return (HiddenLayersExercisePage) pages.get("hiddenLayersExercisePage");
    }

    public static LoadDelayExercisePage getLoadDelayExercisePage() {
        return (LoadDelayExercisePage) pages.get("loadDelayExercisePage");
    }



}
