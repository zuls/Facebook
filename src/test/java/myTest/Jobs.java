package myTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilityPack.Utilities;

/**
 * Created by kona on 4/23/2014.
 */
public class Jobs extends Utilities{
    @Parameters({"username","password"})
    @Test
    public void searchAJob(String username, String password) throws Exception {
        //Enter login id
        typeByID("session_key-login",username);
        //Enter password
        typeByID("session_password-login",password);
        //Click on sign in button.
        waitUntilClickAble(By.cssSelector("#signin"));
        clickById("signin");

        //Go to jobs module by clicking on the menu
        clickByLinkText("Jobs");
        //Type the desired job name
        typeByID("job-search-box","Test Engineer");
        //Click on the search button.
        //clickByTagName("jsearch");
        clickByCss(".search-button");

        //Check the availablity of the 'Test Engineer' text in the search result
        //Assert.assertEquals("Test Engineer", driver.findElement(By.xpath("//div[@id='results_count']/p/strong[2]")).getText());
    }
}
