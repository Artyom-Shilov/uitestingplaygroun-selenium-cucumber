package com.shilov.training.utills;

import com.shilov.training.driver.DriverUtil;
import com.shilov.training.pages.*;

import java.util.Map;

public class PageManager {

    private PageManager(){}

    private static Map<String, BasePage> pages;

    public static void resetPages() {
        pages = Map.ofEntries(
                Map.entry("homePage", new HomePage(DriverUtil.getDriver())),
                Map.entry("dynamicIdExercisePage", new DynamicIdExercisePage(DriverUtil.getDriver())),
                Map.entry("classAttributeExercisePage", new ClassAttributeExercisePage(DriverUtil.getDriver())),
                Map.entry("hiddenLayersExercisePage", new HiddenLayersExercisePage(DriverUtil.getDriver())),
                Map.entry("loadDelayExercisePage", new LoadDelayExercisePage(DriverUtil.getDriver())),
                Map.entry("ajaxDataExercisePage", new AJAXDataExercisePage(DriverUtil.getDriver())),
                Map.entry("clientSideDelayExercisePage", new ClientSideDelayExercisePage(DriverUtil.getDriver())),
                Map.entry("clickExercisePage", new ClickExercisePage(DriverUtil.getDriver())),
                Map.entry("textInputExercisePage", new TextInputExercisePage(DriverUtil.getDriver())),
                Map.entry("progressBarExercisePage", new ProgressBarExercisePage(DriverUtil.getDriver())),
                Map.entry("dynamicTableExercisePage", new DynamicTableExercisePage(DriverUtil.getDriver())),
                Map.entry("scrollbarsExercisePage", new ScrollbarsExercisePage(DriverUtil.getDriver())),
                Map.entry("visibilityExercisePage", new VisibilityExercisePage(DriverUtil.getDriver())),
                Map.entry("mouseOverExercisePage", new MouseOverExercisePage(DriverUtil.getDriver()))
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

    public static AJAXDataExercisePage getAJAXDataExercisePage() {
        return (AJAXDataExercisePage) pages.get("ajaxDataExercisePage");
    }

    public static ClientSideDelayExercisePage getClientSideDelayPage() {
        return (ClientSideDelayExercisePage) pages.get("clientSideDelayExercisePage");
    }

    public static ClickExercisePage getClickExercisePage() {
        return (ClickExercisePage) pages.get("clickExercisePage");
    }

    public static TextInputExercisePage getTextInputExercisePage() {
        return (TextInputExercisePage) pages.get("textInputExercisePage");
    }

    public static ProgressBarExercisePage getProgressBarExercisePage() {
        return (ProgressBarExercisePage) pages.get("progressBarExercisePage");
    }

    public static DynamicTableExercisePage getDynamicTableExercisePage() {
        return (DynamicTableExercisePage) pages.get("dynamicTableExercisePage");
    }

    public static ScrollbarsExercisePage getScrollbarsExercisePage() {
        return (ScrollbarsExercisePage) pages.get("scrollbarsExercisePage");
    }

    public static VisibilityExercisePage getVisibilityExercisePage() {
        return (VisibilityExercisePage) pages.get("visibilityExercisePage");
    }

    public static MouseOverExercisePage getMouseOverExercisePage() {
        return (MouseOverExercisePage) pages.get("mouseOverExercisePage");
    }


}
