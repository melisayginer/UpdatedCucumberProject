package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

import java.util.Set;

import static utilities.Driver.driver;

public class CampaignPage {

    public CampaignPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static final By CampaignIcon = By.xpath("(//span[contains (., 'Kampanyalar')])[1]");
    public static final By ExploreProductsIcon = By.xpath("(//span[contains (., 'Ürünleri keşfedin')])[1]");

    public static final By PreviousPrice = By.xpath("(//p[@class='previous'])[1]");
    public static final By CurrentPrice = By.xpath("(//p[@class='current highlight '])[1]");

    public static final By AddToBasketButton = By.xpath("(//span[contains(., 'Sepete ekle')])[1]/..");

    public static void clickCampaignsButton() {
        Action.clickElement(CampaignIcon);
    }

    public void switchBetweenTabs() {
        String firstHandle = driver.getWindowHandle();
        Action.clickElement(ExploreProductsIcon);
        Set<String> handleDegerler = driver.getWindowHandles();
        String secondHandle = "";

        for (String each : handleDegerler) {
            if (!(each.equals(firstHandle))) {
                secondHandle = each;
            }
        }

        // Artık yeni sayfaya geçiş yapabilirim
        driver.switchTo().window(secondHandle);
    }

    public void addToBasket() {

        Action.clickElement(AddToBasketButton);

    }
}
