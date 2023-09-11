package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

public class RegisterPage {
    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(),
                this);
    }

    public final By signInIcon = By.xpath("//i[@class = 'icon icon-mybrand icon-m ']");
    public final By kayitOl = By.xpath("(//span[contains(., 'Kayıt ol')])[3]");
    public final By ePostaAdresi = By.xpath("//input[@id='formfield-registration-loginName']");
    public final By ePostaDogrulama = By.xpath("//input[@id='formfield-registration-loginNameReenterred']");
    public final By sifre = By.xpath("//input[@id='formfield-registration-unencodedPassword']");
    public final By sifreDogrulama = By.xpath("//input[@id='formfield-registration-confirmedPassword']");
    public final By isim = By.xpath("//input[@id='formfield-registration-firstname']");
    public final By soyisim = By.xpath("//input[@id='formfield-registration-lastName']");
    public final By cepTelefon = By.xpath("//input[@id='formfield-registration-cellPhone']");
    public final By birthdayArea = By.xpath("//input[@id='formfield-registration-dateOfBirth-input']");

    public void clickKayitOl() {
        Action.clickElement(kayitOl);
    }

    public void clickEpostaAdresi(String ePosta) {
        Action.clickElement(ePostaAdresi);
        Action.sendKeysElement(ePostaAdresi,
                ePosta);
    }

    public void clickEpostaDogrulama(String ePosta) {
        Action.clickElement(ePostaDogrulama);
        Action.sendKeysElement(ePostaDogrulama,
                ePosta);
    }

    public void clickSifre(String password) {
        Action.clickElement(sifre);
        Action.sendKeysElement(sifre,
                password);
    }

    public void clickSifreDogrulama(String password) {
        Action.clickElement(sifreDogrulama);
        Action.sendKeysElement(sifreDogrulama,
                password);
    }

    public void clickIsim(String name) {
        Action.clickElement(isim);
        Action.sendKeysElement(isim,
                name);
    }

    public void clickSoyisim(String surname) {
        Action.clickElement(soyisim);
        Action.sendKeysElement(soyisim,
                surname);
    }

    public void clickPhone(String phone) {
        Action.clickElement(cepTelefon);
        Action.sendKeysElement(cepTelefon,
                phone);
    }

    public void clickBirthdayArea(String tarih) {
        Action.sendKeysElement(birthdayArea,
                tarih);
    }

    public void clickSignIn() {
        Action.clickElement(signInIcon);
    }
}