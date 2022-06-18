package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MicroCenterFacebookPage extends CommonAPI {

    @FindBy(css = "#footerNav > div.lowerFooter > div.cert-social > div.social > ul > li.fb > a")
    private WebElement facebookLogin;


    public MicroCenterFacebookPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

        public void clickOnfacebooklogin () {

            click(facebookLogin);
        }
    }
