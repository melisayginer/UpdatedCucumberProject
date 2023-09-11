package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

public class BasketPage {
    public BasketPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public final By chartIcon=By.xpath("//a[@data-popover-parent-id='add-to-cart']");

    public final By addedToBasketPopUp= By.xpath("//p[contains(.,'Ürün sepete eklendi')]");

    public final By chartIconProductCount=By.xpath("//span[@class='count-indicator']");

    public final By plusItemButton=By.xpath("//button[@name='plus-button']");

    public final By minusItemButton=By.xpath("//button[@name='minus-button']");

    public final By deleteItemButton=By.xpath("//a[@data-ajax-request-id='cart_item_delete_1']");

    public final By itemCount=By.xpath("//input[@name='quantity']");

    public final By chartEmptyText=By.xpath("(//h2[@class='a-heading'])[1]");
    public By deffault;

    public void goToTheBasket(){
        Action.clickElement(chartIcon);
    }
    public void checkProductsAddedToTheBasket(String count){
        Action.checkElementText(chartIconProductCount,count);
      //  Action.checkElementText(chartIconProductCount,"1");

    }

    public void increaseItem() throws InterruptedException {
        Action.elementPresent(plusItemButton);
        Action.clickElement(plusItemButton);
        Thread.sleep(2000);
    }

    public void decreaseItem() throws InterruptedException {
        Action.elementPresent(minusItemButton);
        Action.clickElement(minusItemButton);
        Thread.sleep(2000);
    }

    public void deleteItem() throws InterruptedException {
        Action.clickElement(deleteItemButton);
        Thread.sleep(2000);
    }

    public void checkItemCount(String count){
        deffault=By.xpath("//input[@name='quantity' and @value='"+count+"']");
        Action.elementPresent(deffault);

//        action.checkElementValue(itemCount,count);
//        action.elementPresent(itemCount);
    }

    public void checkIfBasketEmpty(String  text){
        Action.elementPresent(chartEmptyText);
        Action.checkElementText(chartEmptyText,text);
    }
    public void itemCountUpdate(String count) throws InterruptedException {
        Action.clickElement(itemCount);
        Action.clearText(itemCount);
        Action.sendKeysElement(itemCount,count);
        Thread.sleep(2000);
    }
}
