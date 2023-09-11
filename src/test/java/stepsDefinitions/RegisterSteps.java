package stepsDefinitions;

import io.cucumber.java.en.And;
import pageObject.RegisterPage;

public class RegisterSteps {
    RegisterPage registerPage = new RegisterPage();

    @And("My Brand ikonuna tiklanir")
    public void myBrandTiklanir() {
        registerPage.clickSignIn();
    }

    @And("Kayit ola tiklanir")
    public void kayitOlTiklanir() {
        registerPage.clickKayitOl();
    }

    @And("{string} e posta girilir ve dogrulanir")
    public void ePostaGirisVeDogrulama(String ePosta) {
        registerPage.clickEpostaAdresi(ePosta);
        registerPage.clickEpostaDogrulama(ePosta);
    }

    @And("{string} sifre girilir ve dogrulanir")
    public void sifreGirisVeDogrulama(String password) {
        registerPage.clickSifre(password);
        registerPage.clickSifreDogrulama(password);
    }

    @And("{string} isim {string} soyisim {string} cep telefon girilir")
    public void isimSoyisimTelefonGiris(String name,
                                        String surname,
                                        String phone) {
        registerPage.clickIsim(name);
        registerPage.clickSoyisim(surname);
        registerPage.clickPhone(phone);
    }

    @And("{string} dogum tarihi secilir")
    public void dogumTarihiSecimi(String Tarih) {
        registerPage.clickBirthdayArea(Tarih);
    }
}
