package stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObject.CommonPage;

public class CommonSteps {

    CommonPage commonPage = new CommonPage();

    @Given("{string} sayfasına gidilir")
    public void sayfasinaGidilir(String url) {
        commonPage.sayfasinaGidilir(url);
    }

    @And("Sayfa kapatılır")
    public void sayfaKapatilir() {
        commonPage.browserKapatilir();
    }

    @And("Login sayfasina gidilir")
    public void loginSayfasinaGidilir() {
        commonPage.loginSayfasinaGidilir();
    }
}
