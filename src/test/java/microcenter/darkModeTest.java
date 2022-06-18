package microcenter;

import Pages.HomePage;
import Pages.communityPage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class darkModeTest extends CommonAPI {


    @Test
    public void checkDarkMode() {
        HomePage homePage = new HomePage(getDriver());
        communityPage communityPage = new communityPage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.clickOncommunity();
        communityPage.clickOnDarkModeBtn();
        waitFor(3);



    }
}
