package com.main;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSession {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Given Code is to Launch the Android Emulator Automatically --- Starts
        caps.setCapability("avd","Pixel_7");
        caps.setCapability("avdLaunchTimeout", 10000);
        //---End

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        String appURL=System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
        //caps.setCapability(MobileCapabilityType.APP, appURL);
        caps.setCapability("appPackage", "io.appium.android.apis");
        caps.setCapability("appActivity", "io.appium.android.apis.accessibility.CustomViewAccessibilityActivity");
        URL url = new URL("http://127.0.0.1:4723");
        AppiumDriver driver = new AppiumDriver(url, caps);
        //New Commit
        //From Vivek 1
        //URL url = new URL("http://127.0.0.1:4723");
    }
}
