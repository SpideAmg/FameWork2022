package microcenter;

import Pages.HomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class twitterBtnTest extends CommonAPI {

    @Test
    public void twitterBtnTest(){

        HomePage homePage = new HomePage(getDriver());
        homePage.scrollToViewtwitterBtn(getDriver());
       homePage.clickontwitterB();
       waitFor(3);
    }
}
