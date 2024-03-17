package org.example.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MainPageStepDef {

    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }

    @Given("I am on the Google Website")
    public void i_am_in_the_OpenCart_Login_page() {
        driver.get("https://www.google.com/");
        mainPage = new MainPage(driver);
    }

    @When("I click on the Search button")
    public void i_click_on_the_search_button() throws InterruptedException {
        mainPage.clickSearch();
    }


    @Given("I have entered {string} in the search box")
    public void iHaveEnteredInTheSearchBox(String arg0) throws InterruptedException {
        mainPage.inputKeyword(arg0);
    }

    @Then("I should see the expected {string} to be first in the result")
    public void iShouldSeeTheExpectedToBeFirstInTheResult(String arg0) {
        String actual = mainPage.getFirstResultURL();
        Assert.assertEquals(arg0, actual);
    }
}
