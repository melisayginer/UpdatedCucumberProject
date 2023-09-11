package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

public class ProductPage {
    public ProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public final By basketPopUP = By.xpath("(//span[contains(., 'Alışveriş sepeti')])");
    public final By urunlerIcon = By.xpath("//span[contains(., 'Ürünler')][1]");
    //(//div[contains(., 'göz atın')])[10]
    public void clickProductsIcon() {
        Action.clickElement(urunlerIcon);
    }
    public final By productCount = By.xpath("//span[@class='count-indicator']");

    public final By allProduct = By.xpath("(//div[contains (., 'göz atın')])[7]");
    public final By siralama = By.xpath("(//div[@class='chips-content js-chips-content'])[2]");
    public final By siralamaDegeri = By.xpath("(//div[contains (., 'Fiyat (düşük - yüksek)')])[last()]");

    public final By verimlilikSinifi = By.xpath("(//div[@class='chips-content js-chips-content'])[3]");
    public final By verimlilikSinifiDegeri = By.xpath("(//li[@class='filterlist-row js-filter-list-row '])[22]");

    public final By tazelik = By.xpath("(//div[@class='chips-content js-chips-content'])[9]");
    public final By tazelikDegeri = By.xpath("(//li[@class='filterlist-row js-filter-list-row '])[36]");

    public final By firstProduct = By.xpath("(//span[contains (., 'Karşılaştırmaya ekle')])[1]/../../..");
    public final By carpiIkonu = By.xpath("//div[@class='product-tile-container js-list-layout']");
    public final By secondProduct = By.xpath("(//span[contains (., 'Karşılaştırmaya ekle')])[2]/../../..");

    public final By compareMessage = By.xpath("(//p[contains (., 'Karşılaştırmak için 2 ürün seçtiniz.')])[1]");

    public final By compareButton = By.xpath("(//a[contains (., 'Ürünleri karşılaştır')])");
    public final By compareText = By.xpath("(//div[contains (., 'Ürün Karşılaştırma')])[last()]");
    public By defaultElement;

    public void clickProductByName(String productName) {
        defaultElement = By.xpath("(//span[contains(., '" + productName + "')])");
        Action.clickElement(defaultElement);
        defaultElement = null;
    }
    public void clickSubProduct(String productName, String subProduct) {
    //    String[] spStg = subProduct.split("%%%");
     //   for (String subProductName : spStg) {
            Action.clickElement(urunlerIcon);
            clickProductByName(productName);
            System.out.println(subProduct);
            clickSubProductByName(subProduct);
     //   }
    }
    public void clickSubProductByName(String subProductName) {
        System.out.println("---" + subProductName);
        if (subProductName.equals("Kurutma Makineleri")) {
            System.out.println(subProductName);
            defaultElement = By.xpath("(//span[contains(., '" + subProductName + "')])[2]");
            Action.clickElement(defaultElement);
        } else if (subProductName.equals("Çamaşır Makineleri")) {
            defaultElement = By.xpath("(//span[contains(., '" + subProductName + "')])[1]");
            Action.clickElement(defaultElement);
        } else {
            defaultElement = By.xpath("(//span[contains(., '" + subProductName + "')])");
            Action.clickElement(defaultElement);
            defaultElement = null;
        }

    }
    public void clickBrowseAllProducts() {
        defaultElement = By.xpath("(//div[contains(., ' göz atın')])[10]");
        Action.clickElement(defaultElement);
    }
   public void addFirstProductToBasket(){
      //Action.elementNotPresent(basketPopUP);
       defaultElement = By.xpath("(//button[@class='a-button a-button-primary js-add-to-basket'])[1]");
        Action.clickElement(defaultElement);

   }
    public void addThirdProductToBasket()  {
        Action.elementNotPresent(basketPopUP);
        defaultElement = By.xpath("(//button[@class='a-button a-button-primary js-add-to-basket'])[3]");
        Action.clickElement(defaultElement);

    }
   public void checkProductCount(String count){
       Action.checkElementText(productCount,count);

   }

    public void clickAllProducts() {
        Action.clickElement(allProduct);
    }

    public void filtersAboutProducts() {
        Action.elementPresent(siralama);
        Action.clickElement(siralama);
        Action.clickElement(siralamaDegeri);

/*        Action.elementPresent(verimlilikSinifi);
        Action.clickElement(verimlilikSinifi);
        Action.clickElement(verimlilikSinifiDegeri);

        Action.elementPresent(tazelik);
        Action.clickElement(tazelik);
        Action.clickElement(tazelikDegeri);*/
    }

    public void compareTwoProducts() throws InterruptedException {
        Action.elementPresent(firstProduct);
        Action.clickElement(firstProduct);

        Action.clickElement(carpiIkonu);

        Thread.sleep(8000);
        Action.elementPresent(secondProduct);
        Action.clickElement(secondProduct);

        Thread.sleep(8000);
        Action.clickElement(compareButton);

        Thread.sleep(8000);
        Action.elementPresent(compareText);
    }
}
