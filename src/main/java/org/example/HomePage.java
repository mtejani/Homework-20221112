package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;


public class HomePage extends Utils
{
    private By _registerButton = By.className("ico-register");




    public void clickOnRegisterButton()
        {
          clickOnElement(_registerButton); // to click on the register button at homepage.
        }

    public void toVerifyUserisonRegisterationPage() // Verify that the user is on the registration page.
    {
        {

            Assert.assertTrue(driver.getCurrentUrl().contains("register"),"currently you are on Registration page");
            Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/register?returnUrl=%2F","UrL for Registration details Page");
        }
    }

}
