package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager extends Utils
{

    public void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe"); // assign a chrome driver path.
        driver = new ChromeDriver(); // create a driver object.
        driver.get("https://demo.nopcommerce.com/"); // home page url
        driver.manage().window(); // open window of chrome.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //wait for 10 seconds to load the site.

    }

    public void closeBrowser() // // to close the browser
    {
        driver.quit();
    }


}
