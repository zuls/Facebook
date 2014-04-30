package myTest;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilityPack.Utilities;
import org.testng.Assert;
import java.lang.Object;

/**
 * Created by kona on 4/23/2014.
 */
public class SearchCompany extends Utilities{
    @Parameters({"username","password"})
    @Test
    public void SearchACompnay(String username, String password) throws Exception {
        //Enter login id
        typeByID("session_key-login",username);
        //Enter password
        typeByID("session_password-login",password);
        //Click on sign in button.
        waitUntilClickAble(By.cssSelector("#signin"));
        clickById("signin");

        //In the user home page, click on the search input box. Enter search word. e.g. jp morgan
        typeByID("main-search-box","jp morgan");
        //Hit enter or click on the search button.
        clickByTagName("search");

        //Find the 'J.P. Morgan' text in the search result and compare with 'J.P. Morgan'
        //Assert.assertEquals("J.P. Morgan", driver.findElement(By.linkText("J.P. Morgan")).getText());
    }
}
