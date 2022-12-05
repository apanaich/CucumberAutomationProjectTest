package StepDefinition;

import com.pages.SearchPage;

import com.qa.Utils.TestClass;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class stepDefHelper extends TestClass {

    SearchPage searchPage;
    public String title;
   // WebDriver driver;

  /*  @Given("^Open Browser and enter the \"([^\"]*)\"$")
    public void openBrowserAndEnterThe(String URL) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver",".\\src\\main\\java\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }*/

    @Given("^Open Browser and input the URL$")
    public void openBrowserAndEnterTheURL() {
        TestClass.initialization();
    }

    @Then("^Click on search menu$")
    public void clickOnSearchMenu() throws Throwable  {
Thread.sleep(5000);
        searchPage = new SearchPage();
     searchPage.search_feature();
    }

    @Then("^correct link is open by the browser$")
    public void verifyIfCorrectLinkIsOpenByTheBrowser() {
        searchPage = new SearchPage();
        String Title = searchPage.titlePage();
        Assert.assertEquals("trivago Magazine",Title);
    }

    @And("^Enter the location \"([^\"]*)\" to search hotels$")
    public void enterTheLocationToSearchHotels(String location) throws Throwable {
        Thread.sleep(5000);
        searchPage = new SearchPage();
        searchPage.search_loctn(location);


    }

    @When("^User click on the Contact web link$")
    public void userClickOnTheContactWebLink() {

        searchPage = new SearchPage();
        searchPage.click_contact();
    }

    @Then("^Input your message$")
    public void inputYourMessage() throws Throwable  {

        searchPage = new SearchPage();

        String parent = driver.getWindowHandle();
        Set<String> allwindows = driver.getWindowHandles();
        for(String child: allwindows){

            if(!parent.equalsIgnoreCase(child)){
                driver.switchTo().window(child);
                //driver.findElement(By.xpath("//*[contains(@class,'contact-msg')]")).sendKeys("AKASH");
                Thread.sleep(5000);
               searchPage.input_message();
               searchPage.input_name();
                searchPage.input_email();
                searchPage.tick_confirm();
                searchPage.Submit_contact();

                driver.close();
            }
        }

        driver.switchTo().window(parent);

    }

    @And("^Input your Full Name$")
    public void inputYourFullName() {
    }

    @And("^Input your Email Address$")
    public void inputYourEmailAddress() {

    }

    @And("^Tick the confirmation$")
    public void tickTheConfirmation() {

    }

    @And("^Submit the button$")
    public void submitTheButton() {
    }

    @When("^User search for newsletter option$")
    public void userSearchForNewsletterOption() {


        JavascriptExecutor jse = (JavascriptExecutor) driver; // (driver is your browser webdriver object)
        jse.executeScript("window.scrollBy(0,document.body.scrollHeight || document.documentElement.scrollHeight)", "");



    }

    @Then("^input email address$")
    public void inputEmailAddress() {

        searchPage = new SearchPage();
        searchPage.setNewsletterbox();
    }

    @And("^Submit the consent to receive newsletter$")
    public void submitTheConsentToReceiveNewsletter() {
        searchPage = new SearchPage();
        searchPage.clickinspireme();

    }

    @When("^User clicks on the menu button$")
    public void userClicksOnTheMenuButton() {

        searchPage = new SearchPage();
        searchPage.click_menu();
    }

    @And("^Select a destination \"([^\"]*)\"$")
    public void selectADestination(String destn) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	
//Thread.sleep(5000);
        searchPage = new SearchPage();
        switch (destn){
            case "Southwest": {
                searchPage.click_southwest_destn();
            }
            break;
            case "Midwest" : {
                searchPage.click_midwest_destn();
            }
            break;
            case "Northeast" : {
                searchPage.click_northeast_destn();
            }
            break;
            case "Southeast" : {
                searchPage.click_southeast_destn();

            }
            break;
            default: System.out.println("No Destination Found !");
            break;
        }
    }

    @Then("^Verify he is navigated to correct destination$")
    public void verifyHeIsNavigatedToCorrectDestination() {
    }

    @When("^Clicks on the drop down$")
    public void clicksOnTheDropDown() {

        searchPage = new SearchPage();
        searchPage.setDropdown();
    }


    @Then("^User should be navigated to different country website$")
    public void userShouldBeNavigatedToDifferentCountryWebsite() {


    }

    @And("^Selects a country \"([^\"]*)\"$")
    public void selectsACountry(String cntry) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchPage = new SearchPage();
        searchPage.select_dropdown(cntry);
    }

    @When("^User is not on the home page$")
    public void userIsNotOnTheHomePage() {
        searchPage = new SearchPage();
        searchPage.navig();

    }

    @And("^User clicks home trivago logo$")
    public void userClicksHomeTrivagoLogo() {
        searchPage = new SearchPage();
        searchPage.home_page();
    }

    @Then("^User should navigate back to Home Page$")
    public void userShouldNavigateBackToHomePage() {

    }
    
   
    
    }

