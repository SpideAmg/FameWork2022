package microcenter;

import Pages.HomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class pupilarCatigoriesTest extends CommonAPI {

        @Test
        public void printers() {
         HomePage homePage = new HomePage(getDriver());
         homePage.scrollToViewPrinters(getDriver());
         homePage.clickOnPrinterItem();
         waitFor(3);
        }

        @Test
        public  void powerSupplies(){

         HomePage homePage = new HomePage(getDriver());
         homePage.scrollToViewPowerSupplies(getDriver());
         homePage.clickOnPowerSupplies();
         waitFor(3);

        }

        @Test
       public  void makerProducts(){

        HomePage homePage = new HomePage(getDriver());
        homePage.scrollToViewMakerProducts(getDriver());
        homePage.clickOnMakerProductsItems();
        waitFor(3);

        }

    @Test
    public  void memoryproducts(){

        HomePage homePage = new HomePage(getDriver());
        homePage.scrollToViewMakerProducts(getDriver());
        homePage.clickOnMemoryItem();
        waitFor(3);


    }

}

