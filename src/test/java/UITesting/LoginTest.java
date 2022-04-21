package UITesting;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import util.OpenUrl;

public class LoginTest extends OpenUrl {

    Login login;

    @BeforeClass
    public void initLogin()
    {
        login = new Login(driver);
    }

    @Test
    public void txtUsernameVisibilityCheck() {
        boolean expected = true;
        boolean actual = false;
        try {
            actual = login.txtUser.isDisplayed(); // true
        } catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void imgLogoVisibilityCheck() {
        boolean expected = true;
        boolean actual = false;
        try {
            actual = login.imgLogo.isDisplayed(); // true
        } catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void txtUserEnabilityCheck() {
        boolean expected = true;
        boolean actual = false;
        try {
            actual = login.txtUser.isEnabled(); // true
        } catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void lblPasswordSpellingCheck()
    {
        String expected ="Password";
        String actual = "";

        try
        {
            actual = login.lblPassword.getText();
        }
        catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected,"wrong spelling");
    }

    @Test
    public void txtPasswordWatermarkCheck()
    {
        String expected ="Password";
        String actual = "";

        try
        {
            actual = login.txtPassword.getAttribute("placeholder");
        }
        catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected,"wrong spelling");
    }

}
