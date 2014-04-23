package myTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilityPack.Utilities;
import org.testng.Assert;
import java.lang.Object;

/**
 * Created by kona on 4/23/2014.
 */
public class SearchCompany extends Utilities{
    @Test
    public void SearchACompnay() throws Exception {
        //Enter login id
        typeByID("session_key-login","ratan512@aol.com");
        //Enter password
        typeByID("session_password-login","bangladesh");
        //Click on sign in button.
        clickById("signin");

        //In the user home page, click on the search input box.
        //Enter search word. e.g. jp morgan
        typeByID("main-search-box","jp morgan");
        //Hit enter or click on the search button.
        clickByTagName("search");


        System.out.print("Search is working fine.");

    }
}
