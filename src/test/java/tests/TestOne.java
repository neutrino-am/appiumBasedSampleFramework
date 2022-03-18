package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static org.driver.DriverManager.getDriver;

public class TestOne extends BaseTest{

    @Test
    public void tapTests() throws MalformedURLException {
        getDriver().findElement(By.xpath("//android.view.View[@content-desc='Skip']")).click();

    }
// +91 9756565656
    // otp - 123123
//    @Test
//    public void verifySignup (Method m) throws MalformedURLException  {
//
//            getDriver().findElement(By.xpath("//android.view.View[@content-desc='Skip']")).click();

        // //android.view.View[@content-desc="Skip"]

        }

