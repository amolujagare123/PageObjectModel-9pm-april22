package regression;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ForgotPass;
import pages.Login;

import java.io.IOException;

import static utlity.ConfigReader.getUrl;

public class ForgotPassTest {

    @Test
    public void forgotPassTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(getUrl());

        Login login = new Login(driver);
        login.clickBtnForgotPass();

        ForgotPass forgotPass = new ForgotPass(driver);
        forgotPass.setTxtEmail("amol@gmail.com");
        forgotPass.clickResetBtn();
    }
}
