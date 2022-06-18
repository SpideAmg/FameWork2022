package eaby;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ebaypages.ebayHomePage;
import ebaypages.SearchResultPage;

public class HomePageTest extends CommonAPI {


//    @Test

    public void iphone() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("iphone");
        homePage.clickSearchBtn();
        String expectedJavaPageTitle = "ebay.com : iphone";
//         Assert.assertEquals(expectedJavaPageTitle, searchResultPage.getSearchPageTitle());
        waitFor(3);
    }

    //    @Test
    public void ClickOnFloatingMenu() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.searchElement("iphone");
        homePage.clickSearchBtn();


        homePage.hoveroverMyeBayfloatingMenu(getDriver());

    }

    //@Test
    public void ClickOnAcceptOfferfromIphoneSearch() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.TypeIphoneInSearchBar();
        homePage.optionMenu();


    }

    //   @Test
    public void hoverOverMotor() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoverOverMotor(getDriver());
        homePage.clickOnMotorcycles();
    }

    //  @Test
    public void Beat() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoverOverMotor(getDriver());
        homePage.clickOnBoat();
    }

    //    @Test
    public void FishingBeat() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoverOverMotor(getDriver());
        homePage.clickOnBoat();
        homePage.clickonFishingBeat();
    }

    //       @Test
    public void MyGarage() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoverOverMotor(getDriver());
        homePage.clickOnMyGarage();
    }

    //  @Test
    public void homeGardan() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoverOverhomegarden(getDriver());
        homePage.clickOntoolspower();
        waitFor(5);
    }

    //   @Test
    public void Dewalt() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoverOverhomegarden(getDriver());
        homePage.clickOntoolspower();
        homePage.clickOnDewalt();
        waitFor(5);
    }

    //    @Test
    public void loginInvalidEmailk() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.clickOnLogin();
        homePage.typeOnloginEmailField("tex@gmail.");
        waitFor(6);
        homePage.clickcOncontueptn();
    }

    //    @Test
    public void loginInvalidUserName() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.clickOnLogin();
        homePage.typeOnloginEmailField("Jacob");
        waitFor(7);
        homePage.clickcOncontueptn();
    }

//       @Test
    public void loginMissingEmailfikled() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.clickOnLogin();
        homePage.typeOnloginEmailField("");
        waitFor(10);
        homePage.clickcOncontueptn();
    }

//       @Test
    public void selectBabyOption() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.clickDropdownbtn();
        waitFor(5);
//       homePage.searchElement("ART");
//       homePage.selectOptionFromMenuDropdownWithSelectOptions("art");
//       homePage.click();

    }

    //    @Test
    public void buyBtn() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("Milwaukee 2401-22 M12 12V 1/4-Inch Hex Screwdriver Kit");
        homePage.clickSearchBtn();

        homePage.clickOnMilwaukee();
        homePage.clickOnAddCard();
    }

//    @Test

    public void hoverovertoysr() {


        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoverOverToys(getDriver());
        homePage.clickOnToysDeal();
        homePage.clickOnAstrial();
        homePage.clickOnbuyAstrial();
        waitFor(7);
    }

//    @Test

    public void hoveroverjewerly() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoverOverJewerly(getDriver());
//        homePage.clickOnFindjewerly;
        waitFor(7);
    }

//    /@Test

    public void Electricaltools() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("elctrical tools");
        homePage.clickSearchBtn();
        waitFor(7);

    }
//    @Test

    public void wachmen() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("wach men");
        homePage.clickSearchBtn();
        waitFor(7);
        homePage.clickOnWachMan();
    }
//    @Test
    public void womenwach() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("womon wach");
        homePage.clickSearchBtn();
        waitFor(7);
        homePage.clickOnWomenWach();
    }
//    @Test
    public void shose() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("wkids shose");
        homePage.clickSearchBtn();
        waitFor(7);
        homePage.clickOnKidsshose();
    }
//    @Test
    public void scrollToview() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.scrollToViewtheBottom(getDriver());
        homePage.clickOnCompanyinf();
//        waitFor(10);
    }
//    @Test
    public void scrollToview2() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.scrollToViewHelpSection(getDriver());
        homePage.clickOnSellar();
        homePage.hoveroverMyPaymentsfees(getDriver());

//        waitFor(10);
    }
//    @Test
    public void scrollToview3() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.scrollToView3(getDriver());
        homePage.clickOnSFb();

    }
//    @Test
    public void scrollToview4() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.scrollToView4(getDriver());
        homePage.clickOnHowtoSell();
    }
//    @Test
    public void scrollToview5() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.scrollToView5(getDriver());
        homePage.clickOnstores();
    }
//    @Test
    public void scrollToview6() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.scrollToView6(getDriver());
        homePage.clickOndevlopers();
    }
//    @Test
    public void scrollToview67() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.scrollToView7(getDriver());
        homePage.hoveroverMyUntiedState(getDriver());
        waitFor(5);
        homePage.clickOnFlag();
    }
//    @Test

    public void toys() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("toys");
        homePage.clickSearchBtn();
        homePage.typeAndScrollToViewVideoGame(getDriver());
        homePage.clickOnvd();
        homePage.clicknew();
        homePage.hoveroverMyVideoGame(getDriver());
        takeScreenshot("Toys");

    }
//    @Test
    public void boots() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("boots");
        homePage.clickSearchBtn();
        homePage.clickOnBoots();
        homePage.clickOnCondition();
        homePage.scrollToViewTellusWhatyouThing(getDriver());
        homePage.scrollToViewUp(getDriver());
        homePage.clickOnTellusWhatyouThing();
        homePage.clickOnSend();
        waitFor(7);

    }
//    @Test
    public void scrollToviewUpAndDown() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.scrollToViewUpAndDown(getDriver());
        homePage.scrollUpToViewToWellcomePage(getDriver());
        homePage.clickOnBrandOtlet();
        homePage.clickOnAccerUpTo50();
        waitFor(5);
        takeScreenshot("Asser");
    }
//   @Test
    public void hoveroverMyshooping() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoveroverMyShoopingCart(getDriver());
        homePage.clickOnAddToCart();
        homePage.clickOnQtyBtn();
    }
//    @Test
    public void hoveroverMyebayRefurbished() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoveroverMyebayRefurbished(getDriver());
        homePage.clickOnSurveillance();
        homePage.scrollUpToViewToHomeCammra(getDriver());
        homePage.clickOnseeDetail();

    }
//        @Test
    public void RegisterLogin() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.clickOnRegisterBtn();
        homePage.typeOnRegisterEmail("yaakoub@yahoo.com");
        homePage.typeOnRegisterPassword("Yaakoub123");
        homePage.typeOnRegisteName("walid");
        homePage.typeOnRegisteLastName("Jamal");
        homePage.clickOnCeatAccount();
        waitFor(6);

    }
//    @Test
    public void nike () {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("nike shose");
        homePage.clickSearchBtn();
        homePage.scrollUpToViewcheckedBox(getDriver());
        homePage.clickOnCheckedBox();
        waitFor(7);
    }
    @Test
    public void addidas () {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("Addidas shose");
        homePage.clickSearchBtn();
        homePage.clickOnUsSize();
        homePage.clickOnDepartment();
        homePage.scrollToAddidasShose(getDriver());
        waitFor(7);
    }

}













