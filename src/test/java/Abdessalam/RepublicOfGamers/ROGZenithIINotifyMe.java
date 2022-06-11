package Abdessalam.RepublicOfGamers;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RepublicOfGamersHomePage;

public class ROGZenithIINotifyMe extends CommonAPI {
    @Test
    public void NotifyMeBtn() {
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        Assert.assertEquals(getPageTitle(),"ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.hoverOverProducts(getDriver());
        RepublicOfGamers.clickMotherboardsFromMenu();
        Assert.assertEquals(getPageTitle(),"Gaming Motherboards｜ROG - Republic of Gamers｜USA");
        waitFor(2);
        RepublicOfGamers.clickRogZenith();
        waitFor(2);
        Assert.assertEquals(getPageTitle(),"ROG Zenith | Gaming Motherboards｜ROG - Republic of Gamers｜ROG USA");
        waitFor(1);
        RepublicOfGamers.clickNotifyMeBtn();



    }
}