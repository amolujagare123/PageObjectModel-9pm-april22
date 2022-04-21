package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
   /* WebDriver driver;
    WebElement txtUser = driver.findElement(By.xpath("//input[@id='email']"));*/

    @FindBy (xpath = "//input[@id='email']")
    public WebElement txtUser;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement txtPassword;

    @FindBy (xpath = "//label[@for='email']")
    public WebElement lblEmail;

    @FindBy (xpath = "//label[@for='password']")
    public WebElement lblPassword;

    @FindBy (xpath = "//img[@class='login-logo img-responsive']")
    public WebElement imgLogo;

    @FindBy (xpath = "//button[normalize-space()='Login']")
    public WebElement btnLogin;

    @FindBy (xpath = "//a[normalize-space()='I forgot my password']")
    public WebElement btnForgotPass;

    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void setTxtUser(String username)
    {
        txtUser.sendKeys(username);
    }

    public void setTxtPassword(String password)
    {
        txtPassword.sendKeys(password);
    }

    public void clickBtnLogin()
    {
        btnLogin.click();
    }

    public void clickBtnForgotPass()
    {
        btnForgotPass.click();
    }
}
