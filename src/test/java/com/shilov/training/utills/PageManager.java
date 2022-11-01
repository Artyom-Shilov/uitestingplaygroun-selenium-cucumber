package com.shilov.training.utills;

import com.shilov.training.driver.DriverUtil;
import com.shilov.training.pages.*;

public class PageManager {

    private PageManager(){}

    public static HomePage getHomePage() {
        return new HomePage(DriverUtil.getDriver());
    }

    public static DynamicIdExercisePage getDynamicIdExercisePage() {
        return new DynamicIdExercisePage(DriverUtil.getDriver());
    }

    public static ClassAttributeExercisePage getClassAttributeExercisePage() {
        return new ClassAttributeExercisePage(DriverUtil.getDriver());
    }

    public static HiddenLayersExercisePage getHiddenLayersExercisePage() {
        return new HiddenLayersExercisePage(DriverUtil.getDriver());
    }

    public static LoadDelayExercisePage getLoadDelayExercisePage() {
        return new LoadDelayExercisePage(DriverUtil.getDriver());
    }

    public static AJAXDataExercisePage getAJAXDataExercisePage() {
        return new AJAXDataExercisePage(DriverUtil.getDriver());
    }

    public static ClientSideDelayExercisePage getClientSideDelayPage() {
        return new ClientSideDelayExercisePage(DriverUtil.getDriver());
    }

    public static ClickExercisePage getClickExercisePage() {
        return new ClickExercisePage(DriverUtil.getDriver());
    }

    public static TextInputExercisePage getTextInputExercisePage() {
        return new TextInputExercisePage(DriverUtil.getDriver());
    }

    public static ProgressBarExercisePage getProgressBarExercisePage() {
        return new ProgressBarExercisePage(DriverUtil.getDriver());
    }

    public static DynamicTableExercisePage getDynamicTableExercisePage() {
        return new DynamicTableExercisePage(DriverUtil.getDriver());
    }

    public static ScrollbarsExercisePage getScrollbarsExercisePage() {
        return new ScrollbarsExercisePage(DriverUtil.getDriver());
    }

    public static VisibilityExercisePage getVisibilityExercisePage() {
        return new VisibilityExercisePage(DriverUtil.getDriver());
    }

    public static MouseOverExercisePage getMouseOverExercisePage() {
        return new MouseOverExercisePage(DriverUtil.getDriver());
    }

    public static SampleAppExercisePage getSampleAppExercisePage() {
        return new SampleAppExercisePage(DriverUtil.getDriver());
    }
}
