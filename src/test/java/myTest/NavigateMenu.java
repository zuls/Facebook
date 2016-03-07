package myTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilityPack.Utilities;

/**
 * Created by zuls on 4/23/2014.
 */
public class NavigateMenu extends Utilities {
    @Parameters({"username","password"})
    @Test
    public void navigateMainMenu(String username, String password) throws Exception {
        //Enter login id
        typeByID("session_key-login",username);
        //Enter password
        typeByID("session_password-login",password);
        //Click on sign in button.
        waitUntilClickAble(By.cssSelector("#signin"));
        clickById("signin");

        //Click on Profile menu
        clickByLinkText("Profile");
        //Check the profile menu is clikced by finding the text 'Background'
        //Assert.assertEquals("Background", driver.findElement(By.cssSelector("#background > h2")).getText());
        //click on Network menu
        clickByLinkText("Network");
        //Click on Jobs menu
        clickByLinkText("Jobs");
        // Click on Interest's sub menu item (Companies).
        clickById("nav-link-interests");
        clickByLinkText("Companies");
        // Click on Interests-> Group
        clickById("nav-link-interests");
        clickByLinkText("Groups");
        //Find the text 'Your Groups' in the groups page.
        //Assert.assertEquals("Your Groups", driver.findElement(By.cssSelector("h1.groups-central-title")).getText());
    }
}
