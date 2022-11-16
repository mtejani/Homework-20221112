package org.example;

import org.testng.Assert;

public class RegistrationResultPage extends Utils
{

    public void toVerifyUserHasBeenSuccessfullyRegistered()
    {
      waitForUrlTobe("https://demo.nopcommerce.com/registerresult/1?returnUrl=/",10);
    }

}

