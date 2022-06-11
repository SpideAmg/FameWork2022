package Apps.Abdessalam.RepublicOfGamers;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesAmg.ArmouryCratePage;
import pagesAmg.RepublicOfGamersHomePage;

public class PupOpZoomArmoryCrate extends CommonAPI {
    @Test
    public void PupOpZoom() {
       RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
       ArmouryCratePage ArmouryCratePage = new ArmouryCratePage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        RepublicOfGamers.hoverOverInnovationMenu(getDriver());
        RepublicOfGamers.clickArmoryBtn();
        String Title = getPageTitle();
        Assert.assertEquals(Title, "Armoury-Crate | US | For Those Who Dare");
        waitFor(1);
        ArmouryCratePage.hoverOverPicN1(getDriver());
        waitFor(1);
        ArmouryCratePage.hoverOverPicN2(getDriver());
        waitFor(1);
        ArmouryCratePage.hoverOverPicN3(getDriver());








    }
}