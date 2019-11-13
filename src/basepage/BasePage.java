package basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by JANVI on 10/11/2019.
 */
public class BasePage {

    public static WebDriver driver;

    public BasePage() {
        PageFactory.initElements(driver,this);
    }

}
