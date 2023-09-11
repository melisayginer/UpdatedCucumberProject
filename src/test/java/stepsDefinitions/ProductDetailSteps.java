package stepsDefinitions;

import io.cucumber.java.en.And;
import pageObject.ProductDetailPage;

public class ProductDetailSteps {

    ProductDetailPage productDetailPage = new ProductDetailPage();

    @And("İlk ürünün detayına gidilir")
    public void i̇lkUrununDetayinaGidilir() {
        productDetailPage.clickFirstProductDetail();
    }


}
