package test;

import basepage.BasePage;
import browserselector.BrowserSelector;
import loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



/**
 * Created by JANVI on 10/11/2019.
 */
public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector(); //Multiple inheritance is not possible in java so we use object to get more than one class
    LoadProperty loadProperty = new LoadProperty();
    String browser = loadProperty.getProperty("browser"); //retrun it gives the value of browser which is "chrome"

    @BeforeMethod
    public void setUP() {
        browserSelector.selectBrowsers(browser);
    }

    @AfterMethod
    public void tearDown() {

       // driver.quit();
    }
}
