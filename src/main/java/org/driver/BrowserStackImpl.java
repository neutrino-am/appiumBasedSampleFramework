package org.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class BrowserStackImpl implements IDriver{
    @Override

    public WebDriver getDriver(Map<String,String> map) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        map.forEach(capabilities::setCapability);//it reads all the key value from map and store it in capabilities
        capabilities.setCapability("browserstack.user", "ashutosh"); //update your user
        capabilities.setCapability("browserstack.key", "key"); //update your key
        capabilities.setCapability("device", "Xiaomi Redmi Note 9");
        capabilities.setCapability("os_version", "10.0");
        capabilities.setCapability("project", "Org App");
        capabilities.setCapability("build", "Android");
        capabilities.setCapability("name", "first_test");
        capabilities.setCapability(MobileCapabilityType.APP,"bs://0722d502f27d069a8f57a970dd08d8de873dc435");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.asMap().forEach((k,v)-> System.out.println(k+":"+v));
        return new AndroidDriver<AndroidElement>(new URL("http://hub.browserstack.com/wd/hub"),capabilities);
    }
}
