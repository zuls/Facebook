package myTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilityPack.Utilities;

/**
 * Created by kona on 4/23/2014.
 */
public class LogOut extends Utilities {
    @Test
    public void logOutFromLinkedIn() throws Exception {
        //Enter login id
        typeByID("session_key-login","ratan512@aol.com");
        //Enter password
        typeByID("session_password-login","bangladesh");
        //Click on sign in button.
        clickById("signin");

        //Go to accounts menu
        //clickByXpath("//*[@id=\"img-defer-id-1-59974\"]");

        //CLick on sign out
        clickByCss("a.account-toggle");

        //Find the text 'You have signed out' in the post logout page.
        //Assert.assertEquals("You have signed out", driver.findElement(By.cssSelector("h1")).getText());
    }
}
