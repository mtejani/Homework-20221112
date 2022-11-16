package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DesktopCategoryPage extends Utils
{
    private By _computerCategory = By.xpath("//ul[@class='top-menu notmobile']/li[1]/a");
    private By _desktopCategory = By.xpath("//ul[@class='sublist']/li[1]/a");
    private By _readMsg1 = By.xpath("//div[@class=\"item-grid\"]/div[1]//h2/a");
    private By _readMsg2 = By.xpath("//div[@class=\"item-grid\"]/div[2]//h2/a");
    private By _readMsg3 = By.xpath("//div[@class=\"item-grid\"]/div[3]//h2/a");


    public void toVerifyUserIsOnDesktopCategoryPage()
    {
        clickOnElement(_computerCategory);
        clickOnElement(_desktopCategory);
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/desktops","You are not on Desktop category page");

    }

    public void readDesktopCategoryItem()

    {
        clickOnElement(_computerCategory);
        clickOnElement(_desktopCategory);
        String readMsg1 = getTextFromElement(_readMsg1);
        String readMsg2 = getTextFromElement(_readMsg2);
        String readMsg3 = getTextFromElement(_readMsg3);

        System.out.println("\n"+readMsg1+"\n"+readMsg2+"\n"+readMsg3+"\n"+"\n"+"Date and time at time of test completed:"+timeStamp()); // to print registration confirmation with timestamp.

    }



}
