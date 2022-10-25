package com.shilov.training.utills;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {
    public static void main(String[] args) {
        String str = "Result: 48, duration: 599";

        System.out.println(str.split(",")[0].split(" ")[1]);
    }
}
