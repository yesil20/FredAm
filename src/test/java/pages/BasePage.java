package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class BasePage {
/*
I created Base page to store common part of my pages and store them in one place
I did abstract to hide implementation and for example if i put a method here when i call it in another page that extend from base page
then i will have to implement it. i do not need to add this to every pages.

I used POM here in pages directory and it allows me to control my Webelements in one place and separated.
 */
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchInput;
    @FindBy(id = "nav-search-submit-button")
    public WebElement searchButton;
    @FindBy (xpath = "//input[@id='add-to-cart-button']")
    public WebElement addToBasketButton;
    @FindBy (xpath = "//span[@id='nav-cart-count']")
    public WebElement basketIcon;
    @FindBy(xpath = "//span[contains(@class,'a-size-medium sc-product-title a-text-bold')]")
    public WebElement basketItemTitle;
    @FindBy (id = "sp-cc-accept")
    public WebElement acceptCookies;







}
