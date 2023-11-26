package com.example.saucelabapp;

import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;

public class DesiredCapabilities {

    public UiAutomator2Options getDesiredCapabilities(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getSystemResource("builds/Android-NativeDemoApp-0.4.0.apk").getFile());
        String apkPath = file.getAbsolutePath();

        UiAutomator2Options options = new UiAutomator2Options();
        options
                .setPlatformName("Android")
                .setPlatformVersion("8.1")
                .setAutomationName("UIAutomator2")
                .setDeviceName("Pixel 4 API 27")
                .setAppPackage("com.saucelabs.mydemoapp.rn")
                .setAppActivity(".MainActivity ")
                .setApp(apkPath)
                .setNoReset(false);
        return options;
    }
}
