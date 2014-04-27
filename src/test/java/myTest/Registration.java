package myTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilityPack.Utilities;

/**
 * Created by kona on 4/23/2014.
 */
public class Registration extends Utilities{
    @Test
    public void registerInLinkedIn() throws Exception {
        //Enter Fisrt name
        typeByID("firstName-coldRegistrationForm","Mtest3");
        //Enter Last Name
        typeByID("lastName-coldRegistrationForm","Mtest3");
        //Enter Email ID
        typeByID("email-coldRegistrationForm","mtest3.mtest3@gmail.com");
        //Enter Password
        typeByID("password-coldRegistrationForm","bogra123");
        //Click on submit button
        clickById("btn-submit");

        //Check the title of LinkedIn for the next step 'Phone verification'.
        //Assert.assertEquals("Phone verification | LinkedIn", driver.getTitle().trim().toString());
    }
}
