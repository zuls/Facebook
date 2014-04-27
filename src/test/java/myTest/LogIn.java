package myTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilityPack.Utilities;

/**
 * Created by kona on 4/23/2014.
 */
public class LogIn extends Utilities {
    @Test
    public void LoginToLinkedIn() throws Exception {
        //Enter login id
        typeByID("session_key-login","ratan512@aol.com");
        //Enter password
        typeByID("session_password-login","bangladesh");
        //Click on sign in button.
        clickById("signin");

        //Check the availability of the text 'People you many know'
        //Assert.assertEquals("People You May Know", driver.findElement(By.linkText("People You May Know")).getText());
    }
}
