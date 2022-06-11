package Forever21;
import base.CommonAPI;
import org.testng.annotations.Test;
import pages.LoginPage;


        public class LoginPageTest extends CommonAPI {

            @Test
            public void LoginPageTest() {

                LoginPage login = new LoginPage(getDriver());
                login.ClickOnLoginBtn();


            }

            @Test
            public void CreateNewAccount() {
                LoginPage login = new LoginPage(getDriver());
                login.CreateAccount();
                waitFor(3);

            }
        }




