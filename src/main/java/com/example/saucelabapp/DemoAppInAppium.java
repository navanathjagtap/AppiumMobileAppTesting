package com.example.saucelabapp;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;

public class DemoAppInAppium {
    static AndroidDriver driver;

    public void testSaucelabFlow() throws Exception {
        Thread.sleep(20000L);

        driver.findElement(AppiumBy.accessibilityId("open menu")).click();
        Thread.sleep(10000L);

        driver.findElement(AppiumBy.accessibilityId("menu item log in")).click();
        Thread.sleep(10000L);

        driver.findElement(AppiumBy.accessibilityId("Username input field")).sendKeys("bob@example.com");

        Thread.sleep(10000L);
        driver.findElement(AppiumBy.accessibilityId("Password input field")).sendKeys("10203040");

        Thread.sleep(10000L);
        driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Login button\"]")).click();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("-------App is started----------");
        DesiredCapabilities options = new DesiredCapabilities();
        driver = new AndroidDriver(new URL("http://192.168.43.25:4723/"), options.getDesiredCapabilities());
        System.out.println("-------Complited Desired capability setup----------");
        DemoAppInAppium obj = new DemoAppInAppium();
        obj.testSaucelabFlow();
        System.out.println("Test case executed successfully");
        //Need appium---< start cmd->appium
        //Need android studio---< start emulator
        //  for version check of devices->  cmd-> adb shell getprop ro.build.version.release
        //  for device name->  cmd-> adb devices
        //  for app package and app activity->  cmd-> adb shell dumpsys window windows | grep -E 'mCurrentFocus'
        //adb shell dumpsys window windows | grep mFocusedApp
    }
}
