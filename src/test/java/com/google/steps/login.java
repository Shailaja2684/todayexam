package com.google.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class login
{
    WebDriver driver;
    @Given("I navigate to the Gmail sign-up page")
    public void i_navigate_to_the_gmail_sign_up_page()
    {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.uk/");
        driver.findElement(By.id("L2AGLb")).click();

    }
    @When("I fill in the account details")
    public void i_fill_in_the_account_details()
    {
    driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[1]/div/button/span")).click();
    driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[3]")).click();
    driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("shailaja");
    driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
     // driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span")).click();


    }
    @Then("I should successfully create a Gmail account")
    public void i_should_successfully_create_a_gmail_account()
    {
driver.quit();
    }
}
