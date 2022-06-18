package Pages;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import javax.swing.*;

public class HomePage extends CommonAPI {

    @FindBy(css = "#hypSignInWrapper > div.unameContainer > div.uname")
    private WebElement floatingMenu;

    @FindBy(css = "#topLvl17133")
    private WebElement AcountBtn;

    @FindBy(css = "#ctl00_ContentLeftSide_hlRegistration > span")
    private WebElement CreatAccountBtn;

    @FindBy(css = "#storeInfo > ul > li.close > button > img")
    private WebElement StoreLocatorPopUp;

    @FindBy(css = "#midLvl18549")
    private WebElement AppleItemsBtn;

    @FindBy(css = "#midLvl18550")
    private WebElement macbookItemBtn;

    @FindBy(css = "#midLvl18551")
    private WebElement macDeskToptsItems;

    @FindBy(css = "#midLvl18552")
    private WebElement ipadItems;

    @FindBy(css = "#midLvl18554")
    private WebElement AirPodItems;

    @FindBy(css = "#midLvl18553")
    private WebElement AppleWatchItems;


    @FindBy(xpath = "//*[@id=\"byProd\"]")
    private WebElement Products;

    @FindBy(xpath = "//*[@id=\"topLvl519\"]")
    private WebElement TopDealsItems;


    @FindBy(css = "#mID519 > ul > li.tertiaryLvl.navarrow.MnID-610 > ul > li:nth-child(2) > a")
    private WebElement allTelevision;

    @FindBy(css = "#mID519 > ul > li.tertiaryLvl.navarrow.MnID-610 > ul > li:nth-child(1) > a")
    private WebElement monitors;


    @FindBy(css = "#mID519 > ul > li.tertiaryLvl.navarrow.MnID-17985 > ul > li:nth-child(1) > a")
    private WebElement keyboards;

    @FindBy(css = "  #mID519 > ul > li.tertiaryLvl.navarrow.MnID-6849 > ul > li > a")
    private WebElement AllTopDeal;

    @FindBy(css = " #topLvl18512")
    private WebElement AvailableBrands;

    @FindBy(css = "#mID18512 > ul > li.tertiaryLvl.navarrow.MnID-18513 > ul > li:nth-child(1) > a")
    private WebElement Search_Acer_Brand;

    @FindBy(css = "#mID18512 > ul > li.tertiaryLvl.navarrow.MnID-18513 > ul > li:nth-child(7) > a")
    private WebElement Search_dell_Brand;

    @FindBy(css = "#mID18512 > ul > li.tertiaryLvl.navarrow.MnID-18526 > ul > li:nth-child(4) > a")
    private WebElement Search_Samsung_Brand;


    @FindBy(xpath = "//*[@id=\"mID18512\"]/ul/li[2]/ul/li[2]/a")
    private WebElement Search_Nvidia_Brand;


    @FindBy(css = "#mID18512 > ul > li.tertiaryLvl.navarrow.MnID-18513 > ul > li:nth-child(4) > a")
    private WebElement Search_Asus_Brand;


    @FindBy(css = "#mID18512 > ul > li.tertiaryLvl.navarrow.MnID-18513 > ul > li:nth-child(2) > a")
    private WebElement Search_AMD_Brand;


    @FindBy(css = "#midLvl15312")
    private WebElement community;

    @FindBy(css = "#mpc_Printers > div > a > img")
    private WebElement printers;

    @FindBy(css = "#mpc_Printers > div > a > img")
    private WebElement printerItems;


    @FindBy(css = "#mpc_powersupplies > div > a > img")
    private WebElement powerSupplies;

    @FindBy(css = "#mpc_powersupplies > div > a > img")
    private WebElement powerSuppliesItem;

    @FindBy(css = "   #mpc_Maker > div > a > img")
    private WebElement makerProdacts;

    @FindBy(css = "   #mpc_Maker > div > a > img")
    private WebElement makerProdactsItems;


    @FindBy(css = "  #mpc_Memory > div > a > div")
    private WebElement MemoryItem;


    @FindBy(css = "#footerNav > div.lowerFooter > div.cert-social > div.social > ul > li.fb > a")
    private WebElement facebookBtn;

    @FindBy(css = "#footerNav > div.lowerFooter > div.cert-social > div.social > ul > li.fb > a")
    private WebElement facebookB;

    @FindBy(css = "#footerNav > div.lowerFooter > div.cert-social > div.social > ul > li.ig > a")
    private WebElement instagramBtn;

    @FindBy(css = "#footerNav > div.lowerFooter > div.cert-social > div.social > ul > li.ig > a")
    private WebElement instagramB;



    @FindBy(css = "#footerNav > div.lowerFooter > div.cert-social > div.social > ul > li.tw > a")
    private WebElement twitterBtn;

    @FindBy(css = "#footerNav > div.lowerFooter > div.cert-social > div.social > ul > li.tw > a")
    private WebElement twitterB;

    @FindBy(css = "#footerNav > div.lowerFooter > div.cert-social > div.social > ul > li.yt > a")
    private WebElement youtubeBtn;

    @FindBy(css = "#footerNav > div.lowerFooter > div.cert-social > div.social > ul > li.yt > a")
    private WebElement youtubeB;


    @FindBy(css = "#SignUp")
    private WebElement signUp;


    @FindBy(css = "#SignUp")
    private WebElement signUpb;


    @FindBy(css = "#topLvl524")
    private WebElement Networking;


    @FindBy(css = "#mID524 > ul > li.tertiaryLvl.navarrow.MnID-6871 > ul > li > a")
    private WebElement viwAllNetworkingItems;


    @FindBy(css = "#mID524 > ul > li.tertiaryLvl.navarrow.MnID-2856 > ul > li:nth-child(3) > a")
    private WebElement NasEnclosuersItems;

    @FindBy(css = "#mID524 > ul > li.tertiaryLvl.navarrow.MnID-717 > ul > li:nth-child(1) > a")
    private WebElement BroadBandModems;

    @FindBy(css = "#mID524 > ul > li.tertiaryLvl.navarrow.MnID-2867 > ul > li:nth-child(6) > a")
    private WebElement NetworkingTools;



    public HomePage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    //reusable steps
    public void hoverOverFloatingMenu(WebDriver driver) {

        hoverOver(driver, floatingMenu);

    }

    public void clickOnAcountBtn() {

        click(AcountBtn);
    }


    public void clickCreatAccountBtn() {

        click(CreatAccountBtn);
    }


    public void clickOnStorePopUp() {

        click(StoreLocatorPopUp);
    }

    public void hoverOverAplleItemsBtn(WebDriver driver) {

        hoverOver(driver, AppleItemsBtn);
    }

    public void clickOnmacbookBtn() {

        click(macbookItemBtn);
    }

    public void clickOnmacDesktopsItems() {

        click(macDeskToptsItems);

    }

    public void clickOnipadItems() {

        click(ipadItems);
    }

    public void clickOnAirPodItems() {

        click(AirPodItems);
    }

    public void clickOnAppleWatchItems() {

        click(AppleWatchItems);
    }

    public void hoverOverOroducts(WebDriver driver) {

        hoverOver(driver, Products);

    }

    public void clickOnTopDealsItems() {

        click(TopDealsItems);
    }

    public void clickOntelevisionItem() {

        click(allTelevision);
    }

    public void clickOnMonitors() {

        click(monitors);


    }

    public void clickOnKeyboards() {

        click(keyboards);
    }

    public void clickOnviewAllTopDeal() {

        click(AllTopDeal);
    }

    public void clickOnBrands() {

        click(AvailableBrands);
    }

    public void clickOnAcer() {

        click(Search_Acer_Brand);
    }


    public void clickOndell() {

        click(Search_dell_Brand);
    }

    public void clickOnSamsung() {

        click(Search_Samsung_Brand);


    }

    public void clickOnAmd() {

        click(Search_AMD_Brand);
    }

    public void clickOncommunity() {

        click(community);

    }


    public void ScrollToView(WebElement element,WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);


    }

    public void scrollToViewPrinters(WebDriver driver){
         ScrollToView(printers,driver);


    }

   public void clickOnPrinterItem(){

    click(printerItems);

    }


    public void scrollToViewPowerSupplies(WebDriver driver){
        ScrollToView(powerSupplies,driver);


    }

    public void clickOnPowerSupplies() {

        click(powerSuppliesItem);

    }

    public void scrollToViewMakerProducts(WebDriver driver){
        ScrollToView(makerProdacts,driver);


    }

    public void clickOnMakerProductsItems() {

        click(makerProdacts);

    }

    public void clickOnMemoryItem() {

        click(MemoryItem);

    }

    public void scrollToViewfacebookBtn(WebDriver driver){
        ScrollToView(facebookBtn,driver);

    }

    public void clickonB() {

        click(facebookB);

    }

    public void scrollToViewinstagramBtn(WebDriver driver){
        ScrollToView(instagramBtn,driver);

    }

    public void clickonfacebookB() {

        click(instagramB);
    }

    public void scrollToViewtwitterBtn(WebDriver driver){
        ScrollToView(twitterBtn,driver);

    }

    public void clickontwitterB() {

        click(twitterB);
    }

    public void scrollToViewyoutubeBtn(WebDriver driver) {
        ScrollToView(youtubeBtn, driver);


    }

    public void clickOnYotubeB() {

        click(youtubeB);


    }

    public void scrollToViewSignUp(WebDriver driver){
        ScrollToView(signUp,driver);

    }

    public void clickOnSignUp() {

        click(signUpb);


    }

    public void clickOnNetworking() {

        click(Networking);

    }
    public void clickOnAllNetworkingProducts() {

        click(viwAllNetworkingItems);

    }
    public void clickOnNasEnclosuersItems() {

        click(NasEnclosuersItems);

    }
    public void clickOnBroadBandModemsItems() {

        click(BroadBandModems);


    }
    public void clickOnNetworkingToolsItems() {

        click(NetworkingTools);

    }

        public void accessBrandSection (WebDriver driver){

        clickOnStorePopUp();
        hoverOverOroducts(driver);
        clickOnBrands();


   }


}