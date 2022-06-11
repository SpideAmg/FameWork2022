package Abdessalam.RepublicOfGamers;

import base.CommonAPI;
import org.testng.annotations.Test;
import ebaypages.ArmouryCratePage;
import ebaypages.RepublicOfGamersHomePage;

    public class PlayWithScrollDown extends CommonAPI {
        @Test
        public void ArmoryCrate() {
            RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

            RepublicOfGamers.clickCookiesAcceptBtn();


        }

    }