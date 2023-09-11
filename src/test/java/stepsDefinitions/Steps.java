package stepsDefinitions;

import io.cucumber.java.en.And;
import pageObject.Page;

public class Steps {

    Page page = new Page();

    @And("Cerezler kabul edilir")
    public void kontrolEdilir() {
        page.clickAcceptCookiesButton();
    }








    @And("Urunler butonuna tiklanir")
    public void urunlerButonunaTiklandi(){
        page.clickUrunlerButton();
    }

//    @And("{string} sepete eklenir")
//    public void urunSepeteEklendi(){
//        page.addFirstCoolingProductToBasket();
//    }
    @And("Ikinci dondurucu urunu sepete eklenir")
    public void ikinciDondurucuSepeteEklendi(){
        page.addSecondCoolingProductToBasket();
    }
    @And("Camasir makinesi urunu sepete eklenir")
    public void CamasirMakinesiSepeteEklendi(){
        page.addLaundryMachineToBasket();
    }
    @And("Bulasik makinesi urunu sepete eklenir")
    public void bulasikMakinesiSepeteEklendi(){
        page.addDishMachinetoBasket();
    }





//

    @And("<Alturunler> kontrol edilir")
    public void alturunlerKontrolEdilir() {
    }



}
