package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{

    HomePage homePage = new HomePage(); // to open home page
    RegisterPage registerPage= new RegisterPage(); // fill in the registration details.
    RegistrationResultPage registrationResultPage= new RegistrationResultPage(); // verify the registration detail outcome.
    DesktopCategoryPage desktopCategoryPage = new DesktopCategoryPage(); // object of Desktop Page
    ShareNewsArtical shareNewsArtical = new ShareNewsArtical(); // object of Share news page.

    @Test (priority = 1)
    public void Registration()
    {
        homePage.clickOnRegisterButton();  // to open home page
        homePage.toVerifyUserisonRegisterationPage(); // to verify the correct homepage.
        registerPage.enterRegistrationDetails(); // fill in the registration details.
        registrationResultPage.toVerifyUserHasBeenSuccessfullyRegistered(); // verify the registration detail outcome.
    }

    @Test (priority = 2)
    public void DesktopCategoryProductsOnDemoNopCommerce()
    {
        desktopCategoryPage.toVerifyUserIsOnDesktopCategoryPage();
        desktopCategoryPage.readDesktopCategoryItem();
    }

    @Test (priority = 3)
    public void ShareNewArtical()
    {
        shareNewsArtical.toCommentOnNewsArticalPageAndCatchMsg();
    }

}
