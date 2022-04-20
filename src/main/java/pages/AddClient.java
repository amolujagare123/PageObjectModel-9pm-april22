package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClient {

    @FindBy(xpath = "//input[@id='client_name']")
    WebElement clientName;

    @FindBy(xpath = "//input[@id='client_surname']")
    WebElement clientSurname;

    @FindBy(xpath = "//input[@id='client_address_1']")
    WebElement clientAdd1;

    @FindBy(xpath = "//input[@id='client_address_2']")
    WebElement clientAdd2;

    @FindBy(xpath = "//input[@id='client_city']")
    WebElement clientCity;

    @FindBy(xpath = "//input[@id='client_state']")
    WebElement clientState;

    @FindBy(xpath = "//input[@id='client_zip']")
    WebElement clientZip;

    @FindBy(xpath = "//input[@id='client_phone']")
    WebElement clientPhone;

    @FindBy(xpath = "//input[@id='client_fax']")
    WebElement clientFax;

    @FindBy(xpath = "//input[@id='client_mobile']")
    WebElement clientMobile;

    @FindBy(xpath = "//input[@id='client_email']")
    WebElement clientEmail;

    @FindBy(xpath = "//input[@id='client_web']")
    WebElement clientWeb;

    @FindBy(xpath = "//input[@id='client_vat_id']")
    WebElement clientVat;

    @FindBy(xpath = "//input[@id='client_tax_code']")
    WebElement clientTax;

    @FindBy (xpath = "//button[@id='btn-submit']")
    WebElement btnSave;

    public void clickBtnSave()
    {
        btnSave.click();
    }

    @FindBy (xpath = "//span[@id='select2-client_language-container']")
    WebElement containerLanguage;

    @FindBy (xpath = "//input[@role='searchbox']")
    WebElement searchBox;

    WebDriver driver;

    public void setLanguage(String language)
    {
        containerLanguage.click();
        searchBox.sendKeys(language);
        driver.findElement(By.xpath("//li[normalize-space()='"+language+"']")).click();
    }

    @FindBy (xpath = "//span[@id='select2-client_country-container']")
    WebElement containerCountry;

    public void setCountry(String country)
    {
        containerCountry.click();
        searchBox.sendKeys(country);
        driver.findElement(By.xpath("//li[normalize-space()='"+country+"']")).click();
    }

    @FindBy (xpath = "//span[@id='select2-client_gender-container']")
    WebElement containerGender;

    public void setGender(String gender)
    {
        containerGender.click();
        driver.findElement(By.xpath("//li[normalize-space()='"+gender+"']")).click();
    }

    @FindBy (xpath = "//input[@id='client_birthdate']")
    WebElement birthDate;

    public void setBirthdate(String bDateStr)
    {
        //birthDate.click();
        //  birthDate.sendKeys(bDateStr);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','"+bDateStr+"')",birthDate);

    }

    public AddClient(WebDriver driver)
    {
        PageFactory.initElements(driver,this);

        this.driver = driver;
    }

    public void setClientName(String name)
    {
        clientName.sendKeys(name);
    }

    public void setClientSurname(String surname)
    {
        clientSurname.sendKeys(surname);
    }

    public void setClientAdd1(String add1)
    {
        clientAdd1.sendKeys(add1);
    }

    public void setClientAdd2(String add2)
    {
        clientAdd2.sendKeys(add2);
    }

    public void setClientCity(String city)
    {
        clientCity.sendKeys(city);
    }

    public void setClientState(String state)
    {
        clientState.sendKeys(state);
    }
    public void setClientZip(String zip)
    {
        clientZip.sendKeys(zip);
    }

    public void setClientPhone(String phone)
    {
        clientPhone.sendKeys(phone);
    }

    public void setClientFax(String fax)
    {
        clientFax.sendKeys(fax);
    }

    public void setClientMobile(String mobile)
    {
        clientMobile.sendKeys(mobile);
    }

    public void setClientEmail(String email)
    {
        clientEmail.sendKeys(email);
    }

    public void setClientWeb(String web)
    {
        clientWeb.sendKeys(web);
    }

    public void setClientVat(String vat)
    {
        clientVat.sendKeys(vat);
    }

    public void setClientTax(String tax)
    {
        clientTax.sendKeys(tax);
    }



}
