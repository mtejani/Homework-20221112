package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{

    HomePage homePage = new HomePage();
    RegisterPage registerPage= new RegisterPage();
    RegistrationResultPage registrationResultPage= new RegistrationResultPage();
    DesktopCategoryPage desktopCategoryPage = new DesktopCategoryPage();
    ShareNewsArtical shareNewsArtical = new ShareNewsArtical();

    @Test (priority = 1)
    public void Registration()
    {
        homePage.clickOnRegisterButton();
        homePage.toVerifyUserisonRegisterationPage();
        registerPage.enterRegistrationDetails();
        registrationResultPage.toVerifyUserHasBeenSuccessfullyRegistered();
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
