package test;

import loadproperty.LoadProperty;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SelectItem;
import pages.SignUp;

/**
 * Created by JANVI on 10/11/2019.
 */
public class TestSuite extends TestBase {


    SelectItem selectItem=new SelectItem();
    SignUp signUp =new SignUp();



    LoadProperty loadProperty = new LoadProperty();


    @Test
    public void UserShouldAbleToSignUpSuccessfully(){
        //PageFactory.initElements(driver,SignUp.class);
        signUp.clickOnSignUp();
        signUp.enterEmail(loadProperty.getProperty("email"));
        signUp.enterPassword(loadProperty.getProperty("password"));
        signUp.clickOnSignInBtn();
        signUp.clickOnCreateAnAccount();
        signUp.clickOnCreateBtn();
/*
loginPage.enterEmail(loadProperty.getProperty("email"));
        loginPage.enterPassword(loadProperty.getProperty("password"));
 */
    }
    @Test
    public void UserShouldAbleToSelectItemSuccessfully(){
        selectItem.selectHotdeals();
        selectItem.selectSaleOpt();
        selectItem.selectText();
        selectItem.selectShoes();

    }
}
/*
loginPage = new Login();
        loginPage.clickOnLoginButton();
        loginPage.enterEmail(loadProperty.getProperty("email"));
        loginPage.enterPassword(loadProperty.getProperty("password"));
        loginPage.clickOnLoginButton();
    }
 */