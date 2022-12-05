package com.pages;

import com.qa.Utils.TestClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

public class SearchPage extends TestClass {


    // Locators of all the elements are present below and Stored as WebElements

    @FindBy(xpath="//*[@id='header']/div/div/div[2]")
    WebElement searchBar;

    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[2]/input")
    WebElement searchbox;

    @FindBy(xpath="//*[@id='footer-main']//*[contains(@href,'/contact/')]")
    WebElement contact;

    @FindBy(xpath = "//*[@id='app']//*[contains(@class,'contact-msg')]")
    WebElement message;

    @FindBy(xpath = "//*[@id='app']//*[contains(@class,'contact-input')]")
    WebElement name;

    @FindBy(xpath = "//*[@id='contact-email']")
    WebElement email;

    @FindBy(xpath = "//*[@id='confirm']")
    WebElement confirm;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div[1]/button")
    WebElement Submit;

    @FindBy(xpath = "//*[@id='app']//*[contains(@placeholder,'Your e-mail address')]")
    WebElement newsletterbox;

    @FindBy(xpath = "//*[contains(text(), 'Inspire Me')]")
    WebElement inspire_buttn;

    @FindBy(xpath = "//*[contains(@class,'nav-icon')]")
    WebElement menu;
    
    

    @FindBy(xpath = "//div[text()='Southwest']")
    WebElement southwest;

    @FindBy(xpath = "//div[text()='Midwest']")
    WebElement midwest;

    @FindBy(xpath = "//div[text()='Northeast']")
    WebElement northeast;

    @FindBy(xpath = "//div[text()='Southeast']")
    WebElement southeast;

    @FindBy(xpath = "//*[contains(@class,'locales-dropdown')]")
    WebElement dropdown;

    @FindBy(xpath = "//*[contains(@class,'logo router-link-active')]")
    WebElement logo;

    //Intializing the Page Object

    public SearchPage(){
        PageFactory.initElements(driver, this);
    }

    // function to get Title of the Page
    public String titlePage(){
        return driver.getTitle();
    }

    // Click on search bar button present right side on the header
    public void search_feature (){
        searchBar.click();
    }

    // Inputs the location send by User
    public void search_loctn(String loctn){
    	//searchbox.clear();
        //searchbox.click(); 
    	//Thread.sleep(5000);
        searchbox.sendKeys(loctn);
        searchbox.sendKeys(Keys.ENTER);
    }

    // Clicks on the Contact link present on the footer
    public void click_contact(){

        JavascriptExecutor jse = (JavascriptExecutor) driver; // (driver is your browser webdriver object)
        jse.executeScript("window.scrollBy(0,document.body.scrollHeight || document.documentElement.scrollHeight)", "");

        contact.click();
    }

    //Input Message sent by the user in the message box
    public void input_message(){

        message.sendKeys(properties.getProperty("message"));
    }

    // Input Name in the Contact form name box
    public void input_name(){
        name.sendKeys(properties.getProperty("fullname"));
    }

    // Input email in the Contact form email box
    public void input_email(){
        email.sendKeys(properties.getProperty("mail"));
    }

    // tick on the confirmation button
    public void tick_confirm(){
        confirm.click();
    }

    //Submits the contact form on website
    public void Submit_contact(){
        Submit.click();
    }

    // Javascript function find and highlight the Inspire me button
    public void setNewsletterbox(){

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", inspire_buttn);
        newsletterbox.sendKeys(properties.getProperty("email1"));
    }

    // Move mouse to Inspire me button and click
    public void clickinspireme(){
        //inspire_buttn.click();

        Actions ob = new Actions(driver);
        ob.moveToElement(inspire_buttn).click().build().perform();
    }

    // move mouse to menu button and click
    public void click_menu(){

        Actions ob = new Actions(driver);
        ob.moveToElement(menu).click().build().perform();

    }
   
    //click southwest destination
    public void click_southwest_destn(){

        Actions ob = new Actions(driver);
        ob.moveToElement(southwest).click().build().perform();
    }

    // click midwest destination
    public void click_midwest_destn(){

        midwest.click();
    }

    // click northeast destination
    public void click_northeast_destn(){
        northeast.click();
    }

    public void navig(){
        driver.get("https://magazine.trivago.com/destination/usa/northeast/");

    }
    public void click_southeast_destn(){
        southeast.click();
    }

    // control drop down
    public void setDropdown(){
        dropdown.click();
    }

    // Select a text in drop down
    public void select_dropdown(String drpcountry){
        Select country = new Select(dropdown);
        country.selectByVisibleText(drpcountry);

    }

    public void home_page(){
        logo.click();
    }

}
