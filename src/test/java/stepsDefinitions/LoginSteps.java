package stepsDefinitions;

import io.cucumber.java.en.And;
import pageObject.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();




    @And("Basarili giris sonrasi {string} yazisi kontrol edilir")
    public void basariliGirisKontrolEdildi(String welcomeText){
        loginPage.checkIfLoginSuccess(welcomeText);
    }


    @And("{string} ve {string} giriş yapılır")
    public void usernameVePasswordIleGirisYapilir(String username, String password) {
        loginPage.girisYapilir(username,password);
    }

    @And("{string} ve {string} ile giriş yapılır")
    public void veIleGirisYapilir(String username, String password) {
        loginPage.enterUsernameAndPassword(username, password);
    }

    @And("Basarisiz giris sonrasi {string} yazisi kontrol edilir")
    public void basarisizGirisKontrolEdildi(String failedText){

        loginPage.basarisizGirisKontrol(failedText);
    }

}
