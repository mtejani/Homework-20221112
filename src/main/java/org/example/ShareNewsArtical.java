package org.example;

import org.openqa.selenium.By;

public class ShareNewsArtical extends Utils
{
    private By _newsArtical = By.xpath("//div[@class=\"news-items\"]/div[2]/div[3]/a");
    private By _newsTitle= By.id("AddNewComment_CommentTitle");
    private By _newsComments = By.id("AddNewComment_CommentText");
    private By _shareNewsButton = By.xpath("//div[@class='fieldset new-comment']/form/div[2]/button");
    private By _redMsg = By.xpath("//div[@class='result']");

    public void toCommentOnNewsArticalPageAndCatchMsg()
    {

        clickOnElement(_newsArtical);// to click on news items.
        type(_newsTitle,"News you like"); // to comment on news
        type(_newsComments,"News you like and this is worth sharing to you"); // to type a message for news share.
        clickOnElement(_shareNewsButton); //to share news click button share.

        String readMsg = getTextFromElement(_redMsg);// to print registration confirmation.
        System.out.println("\n"+readMsg+"\n"+"Test time and date:"+timeStamp()); // to print registration confirmation with timestamp.
    }


}
