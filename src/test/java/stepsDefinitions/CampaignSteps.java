package stepsDefinitions;

import io.cucumber.java.en.And;
import pageObject.CampaignPage;

public class CampaignSteps {

    CampaignPage campaignPage = new CampaignPage();

    @And("Kampanyalar tabina tiklanir")
    public void kampanyalarTabinaTiklanir() {
        campaignPage.clickCampaignsButton();

    }

    @And("Kampanya detay sayfasina gidilir")
    public void kampanyaDetaySayfasinaGidilir() {
        campaignPage.switchBetweenTabs();
    }

    @And("Sepete eklenir")
    public void sepeteEklenir() {
        campaignPage.addToBasket();
    }
}
