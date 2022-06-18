package microcenter;

import Pages.HomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class instagramBtnTest extends CommonAPI {

    @Test
    public void instagramBtn() {
        HomePage homePage = new HomePage(getDriver());
        homePage.scrollToViewinstagramBtn(getDriver());
        waitFor(2);
        homePage.clickonfacebookB();
        waitFor(3);

    }
}