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

import java.io.IOException;
import java.time.Duration;

import static utlity.ConfigReader.*;

public class AddClientTest {
    WebDriver driver;
    @BeforeClass
    public void doLogin() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(getUrl());

        Login login = new Login(driver);

        login.setTxtUser(getUsername());
        login.setTxtPassword(getPassword());
        login.clickBtnLogin();
    }

    @Test
    public void adClientTest()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Menu menu = new Menu(driver);

        menu.clickAddclient();

        AddClient addClient = new AddClient(driver);

        addClient.setClientName("Harshal");
        addClient.setClientSurname("Shinde");
        addClient.setClientAdd1("xyz");
        addClient.setClientAdd2("Swargate");
        addClient.setClientCity("Pune");
        addClient.setClientState("Maharastra");
        addClient.setClientZip("323232");
        addClient.setClientPhone("323232");
        addClient.setClientFax("323232");
        addClient.setClientMobile("323232");
        addClient.setClientEmail("harshal@gmail.com");
        addClient.setClientWeb("www.harshal.com");
        addClient.setClientVat("545454");
        addClient.setClientTax("54545");
        addClient.clickBtnSave();


    }
}
