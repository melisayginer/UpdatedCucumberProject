package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

public class Page {
    public Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public final By addedToBasketPopUp= By.xpath("//p[contains(.,'Ürün sepete eklendi')]");
    public final By acceptCookies=By.xpath("//span[contains(.,'Tümünü kabul et')]");



    public final By productsTab=By.xpath("//span[text()='Ürünler']");

    public final By coolingTab=By.xpath("//a[@data-reference-id='SHOP-cooling']");

    public final By laundryCareTab=By.xpath("//a[@data-reference-id='SHOP-laundrycare']");

    public final By dishwashersTab=By.xpath("//a[@data-reference-id='SHOP-dishwashers']");


    public final By coolingBuiltinFridgesAndFreezersTab=By.xpath("//a[@data-reference-id='SHOP-coolingbuiltinfridgesandfreezers']");

    public final By coolingFreeStandingFridgesAndFreezersTab=By.xpath("//a[@data-reference-id='SHOP-coolingfreestandingfridgesandfreezers']");

    public final By laundryCareWashingmachinesTab=By.xpath("//a[@data-reference-id='SHOP-laundrycarewashingmachines']");


    public final By dishwashersBuiltinTab=By.xpath("//a[@data-reference-id='SHOP-dishwashersbuiltin']");


    public final By allCoolingBuiltinCoolers=By.xpath("//img[@alt='Ankastre Buzdolapları ve Derin Dondurucular']");

    public final By firstCoolingProductaddToBasket=By.xpath("//form[@data-ajax-id='addtocart-CI30RP02']");

    public final By allCoolingSoloCoolers=By.xpath("//img[@alt='Solo Buzdolapları ve Derin Dondurucular']");

    public final By secondCoolingProductaddToBasket=By.xpath("//form[@data-ajax-id='addtocart-KG76NCIE0N']");

    public final By allLaundryCareWaschingMachines=By.xpath("//img[@alt='Çamaşır Makineleri']");

    public final By firstLaundryCareMachineToBasket=By.xpath("(//span[contains(., 'Sepete ekle')])[1]/..");

    public final By allDishWaschingMachines=By.xpath("//img[@alt='Ankastre Bulaşık Makineleri']");

    public final By firstDishMachineToBasket=By.xpath("//form[@data-ajax-id='addtocart-SE63HX60MT']");









    public void clickAcceptCookiesButton(){
        Action.clickElement(acceptCookies);
    }





    public void clickUrunlerButton(){
        Action.clickElement(productsTab);
    }

    public void addFirstCoolingProductToBasket(){
        Action.clickElement(productsTab);
        Action.clickElement(coolingTab);
        Action.clickElement(coolingBuiltinFridgesAndFreezersTab);
        Action.clickElement(allCoolingBuiltinCoolers);
        Action.clickElement(firstCoolingProductaddToBasket);
        Action.elementPresent(addedToBasketPopUp);
    }

    public void addLaundryMachineToBasket(){
        Action.clickElement(productsTab);
        Action.clickElement(laundryCareTab);
        Action.clickElement(laundryCareWashingmachinesTab);
        Action.clickElement(allLaundryCareWaschingMachines);
        Action.clickElement(firstLaundryCareMachineToBasket);
        Action.elementPresent(addedToBasketPopUp);
    }

    public void addDishMachinetoBasket(){
        Action.clickElement(productsTab);
        Action.clickElement(dishwashersTab);
        Action.clickElement(dishwashersBuiltinTab);
        Action.clickElement(allDishWaschingMachines);
        Action.clickElement(firstDishMachineToBasket);
        Action.elementPresent(addedToBasketPopUp);

    }

    public void addSecondCoolingProductToBasket(){
        Action.clickElement(productsTab);
        Action.clickElement(coolingTab);
        Action.clickElement(coolingFreeStandingFridgesAndFreezersTab);
        Action.clickElement(allCoolingSoloCoolers);
        Action.clickElement(secondCoolingProductaddToBasket);
        Action.elementPresent(addedToBasketPopUp);
    }

}
