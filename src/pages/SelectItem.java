package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Util;

/**
 * Created by JANVI on 10/11/2019.
 */
public class SelectItem extends Util{


    @FindBy(xpath = "//class[contains(text(),'primary-title')]")   //Created with contains syntax
    WebElement hotdeals;

    @FindBy(xpath = "//li[@class='leaf has-sub']//span[contains(text(),'Sale')]")
    WebElement sale;

    @FindBy(xpath = "//div[@class='product productid-6 not-available coming-soon cancel-ui-state-disabled compare']//div[@class='stars-row full']//div[2]//span[1]")
    WebElement shoes;

    @FindBy(xpath = "//class[contains(text(),'Lace-Up Boots in Light Brown')]")   //Created with contains syntax
     WebElement text;



public void selectHotdeals() {
//    hotdeals.click();


    clickOnElement(hotdeals);
}

    public void selectSaleOpt(){
        sale.click();


     //   clickOnElement(sale);

    }
    public void selectShoes(){
        shoes.click();

        //  clickOnElement(shoes);
    }
    public void selectText(){
        text.click();


      //  clickOnElement(text);
    }

}












/*
 @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
    WebElement mobile_Phone;                                                                     //Page Factory Model

    @FindBy(xpath = "//img[@title='Show products in category Cell phones']")
    WebElement cellPhone;

    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'HTC One M8 Android L 5.0 Lollipop')]")
    WebElement htcMobile ;
 */