package microcenter;

import Pages.HomePage;
import Pages.OnlineCatalogPage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class OnlineCatalogTest extends CommonAPI {

   @Test
    public void onlineCatalog() {

        HomePage homePage = new HomePage(getDriver());
        OnlineCatalogPage onlineCatalogPage = new OnlineCatalogPage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.scrollToViewSignUp(getDriver());
        homePage.clickOnSignUp();
       onlineCatalogPage.clickOnlineCatalog();
        waitFor(3);


       }

     @Test
    public void softwareItems() {

        HomePage homePage = new HomePage(getDriver());
        OnlineCatalogPage onlineCatalogPage = new OnlineCatalogPage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.scrollToViewSignUp(getDriver());
        homePage.clickOnSignUp();
        onlineCatalogPage.clickOnlineCatalog();
       // onlineCatalogPage.clickOnSoftwareItme();
        waitFor(3);

    }

//        @Test
//        public void gamingItems() {
//
//            HomePage homePage = new HomePage(getDriver());
//            OnlineCatalogPage onlineCatalogPage = new OnlineCatalogPage(getDriver());
//            homePage.clickOnStorePopUp();
//            homePage.scrollToViewSignUp(getDriver());
//            homePage.clickOnSignUp();
//            onlineCatalogPage.clickOnlineCatalog();
//           // onlineCatalogPage.clickOnGamingItem();
//            waitFor(3);
//      }
      }


