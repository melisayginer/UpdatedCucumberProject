package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

public class SearchPage {

    public SearchPage() {
        PageFactory.initElements(Driver.getDriver() , this);
    }

    public final By searchIcon=By.xpath("//em[@class='icon icon-search icon-m']");
    public final By searchBox=By.xpath("//input[@name='search']");
    public final By searchHeading=By.xpath("(//h2)[1]");

    public void clickSearchButton(){
        Action.clickElement(searchIcon);
    }

    public void sendKeysToSearchButton(String key){
        Action.sendKeysElement(searchBox,key);
        Action.pressEnter(searchBox);
    }

    public void searchHeadingCheck(String searchText){
        String text="\""+searchText+"\" için arama sonuçları";
        Action.checkElementText(searchHeading,text);
    }

}
