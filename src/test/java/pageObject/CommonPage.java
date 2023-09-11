package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CommonPage {
    LoginPage loginPage = new LoginPage();

    public CommonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void sayfasinaGidilir(String url){

        Driver.getDriver().get(ConfigurationReader.getProperty(url));
    }

    public void browserKapatilir(){
        Driver.closeDriver();
    }


    public void loginSayfasinaGidilir() {
        Action.clickElement(loginPage.profileIcon);
        Action.clickElement(loginPage.signInOrLogInButton);
    }
}
