package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class communityPage extends CommonAPI {


    @FindBy(css = "#DarkMode > div")
    private WebElement DarkModeBtn;

    public communityPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
    public void clickOnDarkModeBtn() {

        click(DarkModeBtn);


    }


}