package myTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilityPack.Utilities;

/**
 * Created by zuls on 4/23/2014.
 */
public class LogOut extends Utilities {
    @Parameters({"username","password"})
    @Test
    public void logOutFromLinkedIn(String username, String password) throws Exception {
        //Enter login id
        typeByID("session_key-login",username);
        //Enter password
        typeByID("session_password-login",password);
        //Click on sign in button.
        waitUntilClickAble(By.cssSelector("#signin"));
        clickById("signin");

        //Go to accounts menu
        //clickByXpath("//*[@id=\"img-defer-id-1-59974\"]");

        //CLick on sign out
        clickByCss("a.account-toggle");

        //Find the text 'You have signed out' in the post logout page.
        //Assert.assertEquals("You have signed out", driver.findElement(By.cssSelector("h1")).getText());
    }


}
