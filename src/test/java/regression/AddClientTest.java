package regression;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddClient;
import pages.Login;
import pages.Menu;
import util.DoLogin;

import java.io.IOException;
import java.time.Duration;

import static utlity.ConfigReader.*;

public class AddClientTest extends DoLogin {


    @Test
    public void adClientTest()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Menu menu = new Menu(driver);

        menu.clickAddclient();

        AddClient addClient = new AddClient(driver);


        addClient.setClientName("Harshal1");
        addClient.setClientSurname("Shinde");
        addClient.setLanguage("Turkish");
        addClient.setClientAdd1("xyz");
        addClient.setClientAdd2("Swargate");
        addClient.setClientCity("Pune");
        addClient.setClientState("Maharastra");
        addClient.setClientZip("323232");
        addClient.setCountry("Jordan");
        addClient.setClientPhone("323232");
        addClient.setClientFax("323232");
        addClient.setClientMobile("323232");
        addClient.setClientEmail("harshal@gmail.com");
        addClient.setClientWeb("www.harshal.com");
        addClient.setGender("Female");
        addClient.setBirthdate("04/28/2020");
        addClient.setClientVat("545454");
        addClient.setClientTax("54545");
        addClient.clickBtnSave();


    }
}
