package Forever21;

import base.CommonAPI;
import org.testng.annotations.Test;
import FarzanaPages.GiftCardPage;

public class GiftCardPageTest extends CommonAPI {

    @Test

    public void AccessGiftCardPageTest() {
        GiftCardPage giftcard = new GiftCardPage(getDriver());
        giftcard.ClickOnGiftCardBtn();
        waitFor(3);

    }

    @Test
    public void AccessGiftcardPageTest(){
        GiftCardPage giftcard = new GiftCardPage(getDriver());
        giftcard.ClickOnShortByBtn();
        waitFor(3);
    }

}

