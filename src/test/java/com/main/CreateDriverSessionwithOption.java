package com.main;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSessionwithOption {
    public static void main(String[] args) throws MalformedURLException {
        String appURL=System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
        UiAutomator2Options options = new UiAutomator2Options().
                setDeviceName("Pixel 3").
                setAutomationName("UiAutomator2").
                setApp(appURL);

        URL url = new URL("http://127.0.0.1:4723");
        AppiumDriver driver = new AppiumDriver(url, options);

    }
}
