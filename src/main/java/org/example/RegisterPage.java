package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegisterPage extends Utils
{

    private By _registerButton = By.className("ico-register");
    private By _firtNameField = By.id("FirstName");
    private By _maleFemaleRadioButton = By.id("gender-male");
    private By _lastNameField = By.id("LastName");
    private By _selectBirthday = By.name("DateOfBirthDay");
    private By _selectBirthMonth = By.name("DateOfBirthMonth");
    private By _selectBirthYear = By.name("DateOfBirthYear");
    private By _emailField = By.id("Email");
    private By _companyNameField = By.id("Company");
    private By _passwordField = By.id("Password");
    private By _passwordConfirmField = By.id("ConfirmPassword");
    private By _registerSubmitButton = By.id("register-button");
    private By _readMsg = By.className("result");





    public void enterRegistrationDetails()
    {
       waitForElementToBeClickable(_registerButton,10);//clicking on the button register
       //clickOnElement(_maleFemaleRadioButton,"gender-male");
       clickOnElement(_maleFemaleRadioButton); //select the gender.
       type(_firtNameField,"Mukesh"); // First Name
       type(_lastNameField,"Patel"); // Last Name
       selectFromDropdownByIndex(_selectBirthday,7); //select birthday date.
       selectFromDropdownByValue(_selectBirthMonth,"5"); //select birthday month.
       selectFromDropdownByValue(_selectBirthYear,"2001"); //select birthday year.
       type(_companyNameField,"MT Software Plc"); // company name
       type(_emailField,"Muk"+timeStamp()+"esg"+"@email.com"); //user email address.
       type(_passwordField,"Mux1@12112"); // create a password
       type(_passwordConfirmField,"Mux1@12112"); // reconfirm the password.
       clickOnElement(_registerSubmitButton); // click on the registration button for registration.
       String redMsg = getTextFromElement(_readMsg); // to print registration confirmation.

       System.out.println("\n"+redMsg +"\n"+"Date and time at time of test completed:"+timeStamp()); // to print registration confirmation with timestamp.

    }

}
