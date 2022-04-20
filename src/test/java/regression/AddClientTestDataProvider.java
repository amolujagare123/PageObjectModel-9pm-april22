package regression;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AddClient;
import pages.Login;
import pages.Menu;
import util.DoLogin;

import java.io.IOException;
import java.time.Duration;

import static utlity.ConfigReader.*;
import static utlity.DataSheetRead.getMyData;

public class AddClientTestDataProvider  extends DoLogin {


    @Test (dataProvider = "getData")
    public void adClientTest(
            String name,String surname,String language,
            String add1,String add2,String city,
            String state,String zip,String country,
            String phone,String fax,String mobile,
            String email,String web,String gender,
            String birthdate,String vat,String tax, String expected,
            String xpathActual
    )
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Menu menu = new Menu(driver);

        menu.clickAddclient();

        AddClient addClient = new AddClient(driver);


        addClient.setClientName(name);
        addClient.setClientSurname(surname);
        addClient.setLanguage(language);
        addClient.setClientAdd1(add1);
        addClient.setClientAdd2(add2);
        addClient.setClientCity(city);
        addClient.setClientState(state);
        addClient.setClientZip(zip);
        addClient.setCountry(country);
        addClient.setClientPhone(phone);
        addClient.setClientFax(fax);
        addClient.setClientMobile(mobile);
        addClient.setClientEmail(email);
        addClient.setClientWeb(web);
        addClient.setGender(gender);
        addClient.setBirthdate(birthdate);
        addClient.setClientVat(vat);
        addClient.setClientTax(tax);
        addClient.clickBtnSave();

        String actual="";
        try {
             actual = driver.findElement(By.xpath(xpathActual)).getText();
        }
        catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected,"incorrect message");

    }

    @DataProvider
    public Object[][] getData() throws IOException {
       return getMyData("Data/InvoicePlane.xlsx","Sheet1");
    }
}
