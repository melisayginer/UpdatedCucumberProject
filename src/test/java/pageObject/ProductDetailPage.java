package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

public class ProductDetailPage {

    public ProductDetailPage() {
        PageFactory.initElements(Driver.getDriver() , this);
    }

    public final By productDetailButton = By.xpath("(//a[@class='a-link a-button a-button-secondary a-link-inline js-productdetails'])[1]");

    public final By productDetailInfo = By.xpath("(//a[@data-tracking-name='productdetailpage.tab.technicalspecs'])[1]");


    public void clickFirstProductDetail() {
        Action.clickElement(productDetailButton);
        Action.elementPresent(productDetailInfo);
    }


}
