package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public final By signInOrLogInButton=By.xpath("//span[contains(.,' Oturum aç / Kayıt ol')]");

    public final By emailLoginInput=By.id("signin_email");

    public final By passwordLoginInput=By.id("signin_password");

    public final By loginButton=By.xpath("(//span[contains(.,'Giriş yapın')])/..");

    public final By loginWelcomeHeading=By.xpath("//h1[contains(., 'Hoş geldiniz')]");

    public final By loginFailedText=By.xpath("//div[text()='Verilen kullanıcı adı ve şifre ile bilinen bir kullanıcı yok.']");

    public final By profileIcon=By.xpath("//i[@class='icon icon-mybrand icon-m ']");
    public final By signInButton=By.xpath("//span[contains(.,'Şimdi Kaydolun')]");

    public final By fillEmailFieldText=By.xpath("(//div[@class='a-errormessage error-required'])[1]");



    public void enterUsernameAndPassword(String username,String password){
        Action.sendKeysElement(emailLoginInput,username);
        Action.sendKeysElement(passwordLoginInput,password);
        Action.clickElement(loginButton);
    }

    public void checkIfLoginSuccess(String welcomeText){
        Action.checkElementText(loginWelcomeHeading,welcomeText);
    }

    public void checkIfLoginFailed(String failedText){

        Action.checkElementText(loginFailedText,failedText);
    }

    public void signInOperation(String username,String password){
        Action.clickElement(profileIcon);
        Action.clickElement(signInOrLogInButton);
        Action.clickElement(signInButton);
        Action.sendKeysElement(emailLoginInput,username);
        Action.sendKeysElement(passwordLoginInput,password);
        Action.clickElement(loginButton);
    }

    public void girisYapilir(String username, String password){
        Action.clickElement(profileIcon);
        Action.clickElement(signInOrLogInButton);
        Action.sendKeysElement(emailLoginInput, ConfigurationReader.getProperty(username));
        Action.sendKeysElement(passwordLoginInput, ConfigurationReader.getProperty(password));
    }

    public void basarisizGirisKontrol(String mesaj){
        if(mesaj.equals("Verilen kullanıcı adı ve şifre ile bilinen bir kullanıcı yok.")){
            String errorMessage=Action.getText(loginFailedText);
            Assert.assertEquals(errorMessage,mesaj);
        }
        else{
            String incompleteInfo=Action.getText(fillEmailFieldText);
            Assert.assertEquals(incompleteInfo,mesaj);
        }
    }
}
