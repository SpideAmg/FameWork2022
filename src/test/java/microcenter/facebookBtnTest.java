package microcenter;

import Pages.HomePage;
import Pages.MicroCenterFacebookPage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class facebookBtnTest extends CommonAPI {
  @Test
  public void facebookBtn(){

      HomePage homePage = new HomePage(getDriver());
      MicroCenterFacebookPage microCenterFacebookPage = new MicroCenterFacebookPage(getDriver());
      homePage.scrollToViewfacebookBtn(getDriver());
      homePage.clickonfacebookB();
      microCenterFacebookPage.clickOnfacebooklogin();
     waitFor(3);

  }


}
