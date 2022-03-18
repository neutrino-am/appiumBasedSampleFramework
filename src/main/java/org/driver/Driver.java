package org.driver;


import org.openqa.selenium.WebDriver;
import org.utils.PropertyUtils;

import java.net.MalformedURLException;
import java.util.Map;


import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;
import static org.driver.DriverManager.*;

public final class Driver {

    private Driver(){}

    public static void initDriver(Map<String,String> map) throws MalformedURLException {
        if(isNull(getDriver())) {
            String modevalue = PropertyUtils.getValue("mode");
            WebDriver driver = DriverFactory.get(Modes.valueOf(modevalue.toUpperCase()),map);
            setDriver(driver);
        }
    }

    public static void quitDriver() {
        if (nonNull(getDriver())) {
            getDriver().quit();
            unload();
        }

    }
}
