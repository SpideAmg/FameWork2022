package ebaypages;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ebayHomePage extends CommonAPI {
    public ebayHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "#gh-ac")
    private WebElement searchField;

    @FindBy(css = "#gh-btn")
    private WebElement searchBtn;
    @FindBy(css = "#gh-eb-My > div > a.gh-eb-li-a.gh-rvi-menu")
    WebElement MyeBayfloatingMenu;

    @FindBy(css = "#s0-50-12-5-3\\[1\\] > div.srp-controls--responsive.srp-controls__row-cells.left > div.srp-controls__control--responsive > div > ul > li:nth-child(2) > a > span")
    WebElement AccpetsOffers;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > a")
    WebElement Motor;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(3) > a")
    WebElement Motorcycles;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(7) > a")
    WebElement Boat;
    @FindBy(css = "#mainContent > section.b-module.b-visualnav > div.b-visualnav__grid > a:nth-child(1) > div.b-visualnav__title")
    WebElement FishingBoat;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(7) > a")
    WebElement MyGarage;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(6)")
    WebElement HomeGarden;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(6) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(6) > a")
    WebElement toolspower;
    @FindBy(css = "#s0-28_1-9-0-1\\[1\\]-0-0-12-list > li:nth-child(1) > a > p")
    WebElement Dewalt;
    @FindBy(css = "#gh-ug > a")
    WebElement Longin;
    @FindBy(css = "#userid")
    WebElement Longinemail;
    @FindBy(css = "#signin-continue-btn")
    WebElement Continue;
    @FindBy(css = "#gh-cat")
    WebElement DropDown;
    @FindBy(css = "#gh-cat")
    WebElement menuDropdown;
    @FindBy(css = "#s0-0-32-4-0-0\\[3\\]-4-match-media-0-ebay-carousel-list > li:nth-child(3) > a > div:nth-child(3) > span")
    WebElement buybtn;
    @FindBy(css = "#srp-river-results > ul > li:nth-child(1) > div > div.s-item__image-section > div > a > div > img")
    WebElement Milwaukee;
    @FindBy(css = "#vi-viewInCartBtn")
    WebElement AddtoCard;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > a")
    WebElement toys;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(8) > a")
    WebElement toysDeal;
    @FindBy(css = " ")
    WebElement asraraal;
    @FindBy(css = "#binBtn_btn")
    WebElement buyasraraal;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(11) > a")
    WebElement jewerly;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(11) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(5) > a")
    WebElement Findjewerly;
    @FindBy(css = "#srp-river-results > ul > li:nth-child(3) > div > div.s-item__image-section > div > a > div > img")
    WebElement wachman;
    @FindBy(css = "#srp-river-results > ul > li:nth-child(2) > div > div.s-item__info.clearfix > div.s-item__details.clearfix > div:nth-child(1) > span")
    WebElement womenwach;
    @FindBy(css = "#srp-river-results > ul > li:nth-child(3) > div > div.s-item__image-section > div > a > div > img")
    WebElement kidsshose;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(4) > h3 > a")
    WebElement bottom;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(4) > ul > li:nth-child(1) > a")
    WebElement Companyinfo;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(5) > h3:nth-child(1) > a")
    WebElement help;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(5) > ul:nth-child(2) > li:nth-child(1) > a")
    WebElement Seller;
    @FindBy(css = "#main-menu > nav > ul > li:nth-child(7) > a > span")
    WebElement paynmentfees;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(3) > h3")
    WebElement Stayconnected;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(3) > ul > li:nth-child(1) > a")
    WebElement facebook;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(2) > h3:nth-child(1) > a")
    WebElement Sell;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(2) > ul:nth-child(2) > li:nth-child(1)")
    WebElement howtoSell;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(1) > h3 > a")
    WebElement buy;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(1) > ul > li:nth-child(4) > a")
    WebElement stores;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(2) > h3:nth-child(3)")
    WebElement Tools;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(2) > ul:nth-child(4) > li:nth-child(1) > a")
    WebElement devlopers;
    @FindBy(css = "#gf-fbtn")
    WebElement untiedstate;
    @FindBy(css = "#gf-f > ul > li:nth-child(11) > a > p")
    WebElement colombai;
    @FindBy(css = "#s0-50-12-6-3-query_answer2-answer-7-2-1-list > li:nth-child(6) > div > a > div")
    WebElement viedogame;
    @FindBy(css = "#srp-river-results > ul > li:nth-child(1) > div > div.s-item__image-section > div > a > div > img")
    WebElement newseled;
    @FindBy(css = "#_rvwlnk")
    WebElement review;
    @FindBy(css = "#nid-rt2-7 > button > span")
    WebElement boots;
    @FindBy(css = "#nid-rt2-6 > div:nth-child(3) > span.filter-menu-button__text")
    WebElement conditions;
    @FindBy(css = "#srp-river-results > ul > li.srp-river-answer.srp-river-answer--RIGHT_ALIGNED_MESSAGE > div > a")
    WebElement telluswhatyouthink;
    @FindBy(css = "#submitFdbk")
    WebElement send;
    @FindBy(css = "body > div.srp-main.srp-main--isLarge > div.s-answer-region.s-answer-region-above-river > div > span:nth-child(2) > a:nth-child(5)")
    WebElement scrollup;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(2) > ul:nth-child(4) > li:nth-child(3) > a")
    WebElement scrolldownandup;
    @FindBy(css = "#gh-p-4 > a")
    WebElement scrollupToBrandOutlet;
    @FindBy(css = "#s0-17-12-0-1\\[3\\]-0-0-0 > ul > li:nth-child(1) > a")
    WebElement accer;
    @FindBy(css = "#gh-minicart-hover > div > a > svg")
    WebElement shoopingCart;
    @FindBy(css = "#gh-minicart-hover-body > div > div > div.gh-minicart-actions > div:nth-child(2) > a")
    WebElement ViewCart;
    @FindBy(css = "#s0-0-20-10-11-factory_authorized_outlet-1021188228-202073278054-qty\\[\\]-1-dropdown")
    WebElement QTY;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(12) > a")
    WebElement ebayRefurbished;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(12) > a")
    WebElement Surveillance;
    @FindBy(css = "#s0-28_1-9-0-1\\[2\\]-0-0 > ul > li:nth-child(48) > div > div.s-item__info.clearfix > a > h3")
    WebElement HomesecirityCammra;
    @FindBy(css = "#tab-panel-1 > div.item-desc > div.item-content-wrapper > div.item-details > a")
    WebElement Seedetails;
    @FindBy(css = "#gh-ug-flex > a")
    WebElement Register;
    @FindBy(css = "#Email")
    WebElement Registernemail;
    @FindBy(css = "#password")
    WebElement RegistePassWoed;
    @FindBy(css = "#firstname")
    WebElement RegisterName;
    @FindBy(css = "#lastname")
    WebElement RegisterLastName;
    @FindBy(css = "#EMAIL_REG_FORM_SUBMIT")
    WebElement CreatAccount;
    @FindBy(css = "#x-refine__group_1__2 > ul > li:nth-child(1) > div > a > div > span > input")
    WebElement checkedBox;
    @FindBy(css = "#s0-50-12-6-3-query_answer1-answer-3-1-1-list > li:nth-child(8) > div > a")
    WebElement size;
    @FindBy(css =  "#s0-50-12-0-1-2-6-0-2\\[1\\]-4\\[3\\]-3")
    WebElement department;
    @FindBy(css =  "#s0-50-12-6-3-query_answer1-answer-7-2-1-list > li:nth-child(8) > div > a > div")
    WebElement addidasshose;


    ;

    //    //reusable steps
    public void searchElement(String item) {

        type(searchField, item);
    }

    //
    public void clickSearchBtn() {
        click(searchBtn);
        waitFor(5);
    }


    public void hoveroverMyeBayfloatingMenu(WebDriver driver) {

        hoverOver(driver, MyeBayfloatingMenu);

    }

    public void optionMenu() {
        click(AccpetsOffers);


    }

    public void TypeIphoneInSearchBar() {


        type(searchField, "Iphone");
        click(searchBtn);

//
//    }


    }

    public void hoverOverMotor(WebDriver driver) {

        hoverOver(driver, Motor);

    }

    public void clickOnMotorcycles() {
        click(Motorcycles);
    }

    public void clickOnBoat() {
        click(Boat);
    }

    public void clickonFishingBeat() {

        click(FishingBoat);
    }

    public void clickOnMyGarage() {

        click(MyGarage);
    }

    public void hoverOverhomegarden(WebDriver driver) {

        hoverOver(driver, HomeGarden);


    }

    public void clickOntoolspower() {

        click(toolspower);

    }

    public void clickOnDewalt() {

        click(Dewalt);
    }

    public void clickOnLogin() {

        click(Longin);
    }

    public void typeOnloginEmailField(String Text) {

        type(Longinemail, Text);
    }

    public void clickcOncontueptn() {

        click(Continue);
    }

    public void typeOnloginUserName(String Text) {

        type(Longinemail, Text);
    }

    public void typeOnlogin(String Text) {

        type(Longinemail, Text);
    }

    public void clickDropdownbtn() {

        click(DropDown);
    }

    public void selectOptionFromDropDown(String option) {
        selectFromDropdown(menuDropdown, option);


    }

    public void clickOnMilwaukee() {

        click(Milwaukee);
    }

    public void clickOnAddCard() {

        click(AddtoCard);
    }

    public void hoverOverToys(WebDriver driver) {

        hoverOver(driver, toys);

    }

    public void clickOnToysDeal() {

        click(toysDeal);

    }

    public void clickOnAstrial() {

        click(asraraal);
    }

    public void clickOnbuyAstrial() {

        click(buyasraraal);
    }

    public void hoverOverJewerly(WebDriver driver) {

        hoverOver(driver, jewerly);
    }

    public void clickOnFindjewerly() {

        click(Findjewerly);
    }

    public void clickOnWachMan() {

        click(wachman);

    }

    public void clickOnWomenWach() {

        click(womenwach);
    }

    public void clickOnKidsshose() {

        click(kidsshose);
    }

    public void scrollToView2(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollToViewtheBottom(WebDriver driver) {
        scrollToView2(driver, bottom);
        waitFor(5);


    }

    public void clickOnCompanyinf() {
        click(Companyinfo);
        waitFor(5);
    }

    public void scrollToViewHelpSection(WebDriver driver) {
        scrollToView2(driver, help);
        waitFor(5);
    }

    public void clickOnSellar() {
        click(Seller);
        waitFor(5);
    }

    public void hoveroverMyPaymentsfees(WebDriver driver) {

        hoverOver(driver, paynmentfees);
    }

    public void scrollToView3(WebDriver driver) {
        scrollToView2(driver, Stayconnected);
        waitFor(5);
    }

    public void clickOnSFb() {
        click(facebook);

    }

    public void scrollToView4(WebDriver driver) {
        scrollToView2(driver, Sell);
        waitFor(5);
    }

    public void clickOnHowtoSell() {
        click(howtoSell);
    }

    public void scrollToView5(WebDriver driver) {
        scrollToView2(driver, buy);
        waitFor(5);
    }

    public void clickOnstores() {
        click(stores);
    }

    public void scrollToView6(WebDriver driver) {
        scrollToView2(driver, Tools);
        waitFor(5);
    }

    public void clickOndevlopers() {
        click(devlopers);
    }

    public void scrollToView7(WebDriver driver) {
        scrollToView2(driver, untiedstate);
        waitFor(5);
    }

    public void hoveroverMyUntiedState(WebDriver driver) {

        hoverOver(driver, untiedstate);
    }

    public void clickOnFlag() {
        click(colombai);
    }

    public void typeAndScrollToViewVideoGame(WebDriver driver) {
        scrollToView2(driver, viedogame);
    }

    public void clickOnvd() {

        click(viedogame);
    }

    public void clicknew() {

        click(newseled);
    }

    public void hoveroverMyVideoGame(WebDriver driver) {

        hoverOver(driver, review);

    }

    public void clickOnBoots() {

        click(boots);
    }

    public void clickOnCondition() {

        click(conditions);
    }

    public void scrollToViewTellusWhatyouThing(WebDriver driver) {

        scrollToView2(driver, telluswhatyouthink);
    }

    public void clickOnTellusWhatyouThing() {

        click(telluswhatyouthink);
    }

    public void clickOnSend() {

        click(send);
    }

    public void scrollToViewUp(WebDriver driver) {

        scrollToView2(driver, scrollup);
    }

    public void scrollToViewUpAndDown(WebDriver driver) {
        scrollToView2(driver, scrolldownandup);

    }

    public void scrollUpToViewToWellcomePage(WebDriver driver) {

        scrollToView2(driver, scrollupToBrandOutlet);
    }

    public void clickOnBrandOtlet() {

        click(scrollupToBrandOutlet);
    }

    public void clickOnAccerUpTo50() {

        click(accer);
    }

    public void hoveroverMyShoopingCart(WebDriver driver) {

        hoverOver(driver, shoopingCart);
    }

    public void clickOnAddToCart() {

        click(ViewCart);

    }

    public void clickOnQtyBtn() {

        click(QTY);
    }

    public void hoveroverMyebayRefurbished(WebDriver driver) {

        hoverOver(driver, ebayRefurbished);
    }

    public void clickOnSurveillance() {

        click(Surveillance);
    }

    public void scrollUpToViewToHomeCammra(WebDriver driver) {

        scrollToView2(driver, HomesecirityCammra);
    }

    public void clickOnseeDetail() {

        click(Seedetails);
    }

    public void clickOnRegisterBtn() {

        click(Register);
    }


    public void typeOnRegisterEmail(String Text) {

        type(Registernemail, Text);
    }

    public void typeOnRegisterPassword(String Text) {

        type(RegistePassWoed, Text);
    }

    public void typeOnRegisteName(String Text) {

        type(RegisterName, Text);
    }

    public void typeOnRegisteLastName(String Text) {

        type(RegisterLastName, Text);
    }

    public void clickOnCeatAccount() {

        click(CreatAccount);
    }

    public void scrollUpToViewcheckedBox(WebDriver driver) {

        scrollToView2(driver, checkedBox);
    }
    public void clickOnCheckedBox() {

        click(checkedBox);
    }
    public void clickOnUsSize() {

        click(size);
    }
    public void clickOnDepartment() {

        click(department);
    }
    public void scrollToAddidasShose(WebDriver driver) {

        scrollToView2(driver, addidasshose);
    }
}








