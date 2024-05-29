package configuration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AppiumConfig {

    public static AppiumDriver getDriver() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();

//        String apkpath = "C:/Users/kevin/IdeaProjects/pruebantt/app/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk";
//        File app = new File(apkpath);

        capabilities.setCapability("deviceName", "device");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("uuid", "emulator-5554");
        capabilities.setCapability("app", "C:/Users/kevin/IdeaProjects/pruebantt/app/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");




        return new AndroidDriver(new URL("http://192.168.100.13:4724/wd/hub"), capabilities);
    }
}
