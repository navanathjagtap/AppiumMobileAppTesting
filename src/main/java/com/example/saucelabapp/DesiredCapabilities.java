package com.example.saucelabapp;

import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;

public class DesiredCapabilities {

    public UiAutomator2Options getDesiredCapabilities() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getSystemResource("builds/Android-MyDemoAppRN.1.3.0.build-244.apk").getFile());
        String apkPath = file.getAbsolutePath();

        UiAutomator2Options options = new UiAutomator2Options();
        options
                .setPlatformName("Android")//if device is already connected then give platform name
                .setPlatformVersion("8.1")//if device is already connected then give device version
                .setAutomationName("UIAutomator2")//if you want to use uiautomator2 then give this
                .setDeviceName("Pixel 4 API 27")//if device is already connected then give device name
                .setAppPackage("com.saucelabs.mydemoapp.rn")//if app is already installed then give app package
                .setAppActivity(".MainActivity")//if app is already installed then give app activity
                .setApp(apkPath)//if app is not installed then give apk path
                .setNoReset(true)//if true then it will not reset app state
                .setCapability("newCommandTimeout", 300);//if appium server does not get any new command in 300 sec then it will close the session
        return options;
    }
}
