package myTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilityPack.Utilities;

/**
 * Created by kona on 4/23/2014.
 */
public class Jobs extends Utilities{
    @Test
    public void searchAJob() throws Exception {
        //Enter login id
        typeByID("session_key-login","ratan512@aol.com");
        //Enter password
        typeByID("session_password-login","bangladesh");
        //Click on sign in button.
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
