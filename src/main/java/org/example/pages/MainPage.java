package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private final WebDriver driver;

    // By Locators
    private final By searchBoxLocator = By.name("q");
    private final By searchButtonLocator = By.xpath("//input[@type='submit']");

    private final By firstResultURLLocator = By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/div/div/div/div/cite");

    // Constructor

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputKeyword(String keyword) throws InterruptedException {
        WebElement elem = driver.findElement(searchBoxLocator);
        elem.sendKeys(keyword);
        Thread.sleep(3000);
    }

    public void clickSearch() throws InterruptedException {
        WebElement elem = driver.findElement(searchButtonLocator);
        elem.click();
        Thread.sleep(3000);
    }

    public String getFirstResultURL(){
        WebElement elem = driver.findElement(firstResultURLLocator);
        System.out.println(elem.getText());
        return elem.getText();
    }
}
