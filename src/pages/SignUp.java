package pages;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.Util;

/**
 * Created by JANVI on 10/11/2019.
 */
public class SignUp extends Util{

    @FindBy(xpath = "//div[contains(@class,'header_bar-sign_in')]//span[contains(text(),'Sign in / sign up')]")
    WebElement sign_Up;

    @FindBy(xpath = "//input[@id='login-email']")
    WebElement _email;

    @FindBy(xpath = "//input[@id='login-password']")
    WebElement _password;

    @FindBy(xpath = "//table[contains(@class,'login-form')]//button[contains(@class,'submit')]")
    WebElement signIn;

    @FindBy(xpath = "//a[@class='popup-button default-popup-button create-account-link']")
    WebElement createAnAct;

    @FindBy(xpath = "//div[contains(@class,'button submit')]//button[contains(@class,'submit')]")
    WebElement createBtn;



    public void clickOnSignUp(){

       driver.findElement(By.xpath("//div[contains(@class,'header_bar-sign_in')]//span[contains(text(),'Sign in / sign up')]")).click();
        //clickOnElement(sign_Up);

    }
    public void enterEmail(String email){
       // sendTextToElement(_email,email);


        sendTextToElement(_email,"abc@gmail.com");
    }
    public void enterPassword(String password){
        sendTextToElement(_password,password);

    }
    public void clickOnSignInBtn(){
      //  signIn.click();

        clickOnElement(signIn);
    }
    public void clickOnCreateAnAccount(){
        clickOnElement(createAnAct);

    }
    public void clickOnCreateBtn(){
        clickOnElement(createBtn);
    }




}
/*
public void enterEmail(String email) {
        sendTextToElement(_email, email);
    }

    public void enterPassword(String password) {
        PageFactory.initElements(driver, Login.class);
        sendTextToElement(_password, password);
    }
 */
