package org.pages;


import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.driver.DriverManager;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    public LandingPage(){
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()),this);

        // skip
        // accessibility id = Skip
    }
}

