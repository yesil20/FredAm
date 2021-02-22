package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ResultPage extends BasePage{
    public ResultPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    public  WebElement clickItemTitle(String bookname){
        String bookstitle = "//span[@class='a-size-base-plus a-color-base a-text-normal'][contains(text(),'"+bookname+"')]";
        WebElement book = Driver.get().findElement(By.xpath(bookstitle));
        return book;
    }
}
