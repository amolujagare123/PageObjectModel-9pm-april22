package regression;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ForgotPass;
import pages.Login;
import util.OpenUrl;

import java.io.IOException;

import static utlity.ConfigReader.getUrl;

public class ForgotPassTest extends OpenUrl {

    @Test
    public void forgotPassTest() throws IOException {


        Login login = new Login(driver);
        login.clickBtnForgotPass();

        ForgotPass forgotPass = new ForgotPass(driver);
        forgotPass.setTxtEmail("amol@gmail.com");
        forgotPass.clickResetBtn();
    }
}
