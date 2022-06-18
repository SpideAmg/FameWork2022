package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineCatalogPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"menu-item-group\"]/li[3]/a")
    private WebElement onlineCatalog;

    @FindBy(css = "#content > div.CatWrap > div > div.Catalog-container > div.eleven > a > h2")
    private WebElement softwareItems;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div[1]/div[9]/a/h2")
    private WebElement gamingItems;

    public OnlineCatalogPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }

    public void clickOnlineCatalog() {

        click(onlineCatalog);
    }

    public void clickOnSoftwareItme() {

        click(softwareItems);

    }
    public void clickOnGamingItem() {

        click(gamingItems);
    }
}