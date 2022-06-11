package Apps.Abdessalam.RepublicOfGamers;

import base.CommonAPI;
import org.testng.annotations.Test;
import pagesAmg.RepublicOfGamersHomePage;

public class Teeeeeeeeeeeeeeeeeeeeeest extends CommonAPI {
    @Test
    public void Test(){
        RepublicOfGamersHomePage RepublicOGHM = new RepublicOfGamersHomePage(getDriver());

        RepublicOGHM.clickCookiesAcceptBtn();

        RepublicOGHM.GoBack(getDriver());

    }
}
