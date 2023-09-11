package stepsDefinitions;

import io.cucumber.java.en.And;
import pageObject.ProductPage;

public class ProductSteps {
    ProductPage productPage = new ProductPage();

    @And("{string} ürününden {string} alttablara tiklanir")
    public void alttablaraTiklanir(String productName , String subProduct) {
        productPage.clickSubProduct(productName , subProduct);
    }

    @And("ürünler ikonuna tıklanır")
    public void ürünlerIkonunaTiklanir() {
        productPage.clickProductsIcon();
    }

    @And("{string} tıklanır")
    public void urunlerTiklanir( String productName) {
        productPage.clickProductByName(productName);
    }

    @And("Tum urunlere goz atin tabina tiklanir")
    public void tumUrunlereGozAtinTabinaTiklanir() throws InterruptedException {
        productPage.clickBrowseAllProducts();
    }



    @And("Ilk urun sepete eklenir")
    public void ılkUrunSepeteEklenir() {
        productPage.addFirstProductToBasket();
    }

    @And("Urun sayisinin {string} oldugu gorulur")
    public void urunSayisininOlduguGorulur(String count) {
        productPage.checkProductCount(count);
    }


    @And("Ucuncu urun sepete eklenir")
    public void ucuncuUrunSepeteEklenir() throws InterruptedException {
        productPage.addThirdProductToBasket();
    }

    @And("Ürünlere göz atın alanına tıklanır")
    public void ürünlereGözAtınAlanınaTıklanır() {
        productPage.clickAllProducts();
    }

    @And("Filtreleme alanından seçim yapılır")
    public void filtrelemeAlanındanSeçimYapılır() {
        productPage.filtersAboutProducts();
    }

    @And("İki ürün seçilip karşılaştırılır")
    public void ikiÜrünSeçilipKarşılaştırılır() throws InterruptedException {
        productPage.compareTwoProducts();
    }
}
