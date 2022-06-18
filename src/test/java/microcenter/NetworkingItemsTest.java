package microcenter;

import Pages.HomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class NetworkingItemsTest extends CommonAPI {
    @Test
    public void NetworkingItems(){

        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverOroducts(getDriver());
        homePage.clickOnNetworking();
        homePage.clickOnAllNetworkingProducts();
        waitFor(3);

    }

    @Test
    public void BroawdBrandModemsItems(){

        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverOroducts(getDriver());
        homePage.clickOnNetworking();
        homePage.clickOnBroadBandModemsItems();
        waitFor(3);

    }

    @Test
    public void NasEnclusersItems(){

        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverOroducts(getDriver());
        homePage.clickOnNetworking();
        homePage.clickOnNasEnclosuersItems();
        waitFor(3);

    }

    @Test
    public void NetworkingTools(){

        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverOroducts(getDriver());
        homePage.clickOnNetworking();
        homePage.clickOnNetworkingToolsItems();
        waitFor(3);

    }

}
