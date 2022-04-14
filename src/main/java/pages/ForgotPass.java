package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPass {

    @FindBy (xpath = "//input[@id='email']")
    WebElement txtEmail;

    @FindBy(xpath = "//button[normalize-space()='Reset password']")
    WebElement btnReset;

    public ForgotPass(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void setTxtEmail(String email)
    {
        txtEmail.sendKeys(email);
    }

    public void clickResetBtn()
    {
        btnReset.click();
    }
}
