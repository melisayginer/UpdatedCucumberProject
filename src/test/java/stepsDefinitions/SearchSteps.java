package stepsDefinitions;

import io.cucumber.java.en.And;
import pageObject.SearchPage;

public class SearchSteps {
    SearchPage searchPage = new SearchPage();

    @And("Arama iconuna tiklanir")
    public void aramaIconunaTiklanir(){
        searchPage.clickSearchButton();
    }

    @And("Arama sonucu başlığı {string} ile kontrol edilir")
    public void aramaSonucuBasligiKontrolEdildi(String data){
        searchPage.searchHeadingCheck(data);
    }


    @And("Arama kutusuna {string} yazilir ve entera basilir")
    public void aramaKutusunaYazildiveGonderildi(String data){
        searchPage.sendKeysToSearchButton(data);
    }


}
