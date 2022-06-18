package microcenter;

import Pages.AppleItemspage;
import Pages.BrandsPage;
import Pages.HomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AvailableBrandsTest extends CommonAPI {

    @Test
    public void ViewAllAvailableBrands() {
        HomePage homePage = new HomePage(getDriver());
        BrandsPage BrandPage = new BrandsPage (getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverOroducts(getDriver());
        homePage.clickOnBrands();
        //homePage.clickOnLGBrand();
        waitFor(3);

    }
    @Test
    public void search_Acer_Brand() {
        HomePage homePage = new HomePage(getDriver());
         BrandsPage BrandPage = new BrandsPage (getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverOroducts(getDriver());
        homePage.clickOnBrands();
        homePage.clickOnAcer();

    }
     @Test
    public void search_AMD_Brand() {
        HomePage homePage = new HomePage(getDriver());
         BrandsPage BrandPage = new BrandsPage (getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverOroducts(getDriver());
        homePage.clickOnBrands();
        homePage.clickOnAmd();
        waitFor(3);


     }
    @Test
    public void search_dell_Brand() {
        HomePage homePage = new HomePage(getDriver());
        BrandsPage BrandPage = new BrandsPage (getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverOroducts(getDriver());
        homePage.clickOnBrands();
        homePage.clickOndell();
        waitFor(3);

    }


     @Test
    public void search_Samsung_Brand() {
        HomePage homePage = new HomePage(getDriver());
        BrandsPage BrandPage = new BrandsPage (getDriver());
//        homePage.clickOnStorePopUp();
//        homePage.hoverOverOroducts(getDriver());
//        homePage.clickOnBrands();
         homePage.accessBrandSection(getDriver());
        homePage.clickOnSamsung();
        waitFor(3);
    }
}