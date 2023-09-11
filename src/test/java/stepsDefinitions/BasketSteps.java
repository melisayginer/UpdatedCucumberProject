package stepsDefinitions;

import io.cucumber.java.en.And;
import pageObject.BasketPage;

public class BasketSteps {
    BasketPage basketPage = new BasketPage();
    @And("Sepete gidilir")
    public void sepeteGidildi() throws InterruptedException{
        Thread.sleep(3000);
        basketPage.goToTheBasket();
        System.out.println("sepetteyiz");
    }
    @And("Urun sayisinin {string} oldugu chart iconundan kontrol edilir")
    public void urunSayisiChartIconundanKontrolEdildi(String count){
        basketPage.checkProductsAddedToTheBasket(count);
    }



    @And("Urunun sayisi arttirilir")
    public void urununSayisiArttirildi() throws InterruptedException {
        basketPage.increaseItem();
    }

    @And("Urunun sayisi azaltilir")
    public void urununSayisiAzaltildi() throws InterruptedException {
        basketPage.decreaseItem();
    }
    @And("Urunun sepetten silinir")
    public void urunSepettenSilindi() throws InterruptedException {
        basketPage.deleteItem();
    }

    @And("Urun sayisinin {string} oldugu kontrol edilir")
    public void urunSayisiKontrolEdildi(String count){
        basketPage.checkItemCount(count);
        System.out.println(count);
    }

    @And("Sepetin bos oldugu {string} yazisi ile kontrol edilir")
    public void sepetinBosOlduguKontrolEdildi(String text){
        basketPage.checkIfBasketEmpty(text);
    }

    @And("Urun sayisi {string} olarak guncellenir")
    public void urunSayisiGuncellendi(String count) throws InterruptedException {
        basketPage.itemCountUpdate(count);
    }
}
