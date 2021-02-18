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
        String bookstitle = "//span[@class='a-size-medium a-color-base a-text-normal'][text()='"+bookname+"']";
        WebElement book = Driver.get().findElement(By.xpath(bookstitle));
        return book;
    }
}
