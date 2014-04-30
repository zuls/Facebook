package myTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilityPack.Utilities;

/**
 * Created by kona on 4/23/2014.
 */
public class LogIn extends Utilities {
    @Parameters({"username","password"})
    @Test
    public void LoginToLinkedIn(String username, String password) throws Exception {
        //Enter login id
        typeByID("session_key-login",username);
        //Enter password
        typeByID("session_password-login",password);
        //Click on sign in button.
        waitUntilClickAble(By.cssSelector("#signin"));
        clickById("signin");

        //Check the availability of the text 'People you many know'
        //Assert.assertEquals("People You May Know", driver.findElement(By.linkText("People You May Know")).getText());
    }


}
