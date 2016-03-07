package myTest;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilityPack.Utilities;

/**
 * Created by zuls on 4/23/2014.
 */
public class MessageInbox extends Utilities {
    @Parameters({"username","password"})
    @Test
    public void gotoInbox(String username, String password) throws Exception {
        //Enter login id
        typeByID("session_key-login",username);
        //Enter password
        typeByID("session_password-login",password);
        //Click on sign in button.
        waitUntilClickAble(By.cssSelector("#signin"));
        clickById("signin");


        //Go to Message inbox
        driver.navigate().to("http://www.linkedin.com/inbox/#messages?trk=nav_utilities_inbox");
        //Reached to the message inbox page
        //Assert.assertEquals("Inbox", driver.findElement(By.cssSelector("h1")).getText());

        //Click on Inbox
        //clickByXpath("/html/body/div[4]/div/div/div[2]/ul/li/a");
        //Click on Compose
        //clickByXpath("/html/body/div[5]/div/div[4]/div/div/div/div/div/div/div/a");
        //Enter receipient id mtest2
        //typeByID("ccInput", "mtest2");
        //Enter subject line
        //typeByID("subject-composeForm", "test submejet");
        //Enter the message
        //typeByID("body-composeForm", "My Message");
        //Click on send message button
        //clickByXpath("/html/body/div[5]/div/div[4]/div/div/div/div/div/div[2]/div/div/div/form/div/ul/li[4]/ul/li/input");
    }
}
