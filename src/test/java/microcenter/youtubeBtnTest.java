package microcenter;

import Pages.HomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class youtubeBtnTest extends CommonAPI {

    @Test
    public void youtubeBtnTest(){

        HomePage homePage = new HomePage(getDriver());
        homePage.scrollToViewyoutubeBtn(getDriver());
        homePage.clickOnYotubeB();
        waitFor(4);

    }
}

