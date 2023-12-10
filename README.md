# AppiumMobileAppTesting

## 1.Install Node.js:
Download and install Node.js from https://nodejs.org/.
Cmd -> node -v
v18.16.0
C:\Users\Navnath>npm -v

npm install -g npm@8.0.0
8.0.0

## 2.Install Appium:
npm install -g appium
npm install -g appium-doctor
appium-doctor

## 3.Install Java:
java --version
java 17.0.8 2023-07-18 LTS

Set JAVA_HOME in environment variable:
JAVA_HOME
C:\Program Files\Java\jdk-17

## 4.Install Android Studio:
Download and install Android Studio from https://developer.android.com/studio.
Set ANDROID_HOME in environment variable:
ANDROID_HOME
C:\Users\Navnath\AppData\Local\Android\Sdk
Create device in AVD Manager
in path variable add below path go to the option in laptop and select view hidden files and folder:
C:\Program Files\nodejs\node_modules
C:\Users\Navnath\AppData\Roaming\npm\node_modules\appium\build\lib\main.js
C:\Users\Navnath\AppData\Local\Android\Sdk\build-tools
C:\Users\Navnath\AppData\Local\Android\Sdk\platforms
C:\Users\Navnath\AppData\Local\Android\Sdk\emulator
Start Emulator
Create Your Appium Project:
Write Appium Test Scripts:
Run Appium Server:
cmd: appium
Run Appium Test Scripts:
download app from below link for emulator:
https://github.com/saucelabs/my-demo-app-rn/releases/

## 5.Download Appium Inspector:
Go to the Appium Inspector GitHub repository: https://github.com/appium/appium-inspector
Download the latest release of Appium Inspector.
{
"appium:platformName": "Android",
"appium:platformversion": "8.1",
"appium:automationName": "UIAutomator2",
"appium:deviceName": "Pixel 4 API 27",
"appium:appPackage": "com.saucelabs.mydemoapp.rn",
"appium:appActivity": ".MainActivity",
"newCommandTimeout": 300
}
start session

## 6. Appium Desired Capabilities:

Check Appium version:
appium -v

Perform an audit of npm packages:
npm audit

Fix identified issues during npm audit:
npm audit fix

Forcefully fix all identified issues, including breaking changes:
npm audit fix --force

Ensure Android Studio is installed and start the emulator
Check the version of connected devices:
adb shell getprop ro.build.version.release
8.1.0

List connected devices:
adb devices
List of devices attached
emulator-5554   device

Find the app package and app activity:
adb shell dumpsys window windows
ctrl + f : mCurrentFocus
mCurrentFocus=Window{557729 u0 com.saucelabs.mydemoapp.rn/com.saucelabs.mydemoapp.rn.MainActivity
from above line we can get appPackage and appActivity
.setAppPackage("com.saucelabs.mydemoapp.rn")
.setAppActivity(".MainActivity")

pdf:src\main\resources\MobileApppTesting\AppiumGuide.pdf



