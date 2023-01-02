package stepDefinitions;
import java.util.List; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

 

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

 


import io.github.bonigarcia.wdm.WebDriverManager;

 

public class Step1 {
    static WebDriver driver = null;
    @Given("^I am on Github home page$")
    public void i_am_on_Github_home_page(){
        String site = "https://www.github.com/login";
//        System.setProperty("webdriver.chrome.driver", "Executables\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to(site);
        //driver.findElement(By.cssSelector("a[contains[@href, "login"]]").click();
        // Write code here that turns the phrase above into concrete actions
    }

 

    @When("^I specify Username and Password$")
    public void i_specify_Username_and_Password() {
        driver.findElement(By.cssSelector("input#login_field")).sendKeys("shloka3146@gmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("Lion@3146");
        // Write code here that turns the phrase above into concrete actions
    }

 

    @When("^Click on SignIn button$")
    public void click_on_SignIn_button(){
        driver.findElement(By.cssSelector("input.btn")).click();
        // Write code here that turns the phrase above into concrete actions
    }

 

    @Then("^I should be able to see logout option$")
    public void I_should_be_able_to_see_logout_option() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id='user-links']/li[3]/details/summary/img")).click();
        WebElement opt = driver.findElement(By.xpath("//*[@id='user-links']/li[3]/details/ul/li"));
        List<WebElement> olist = opt.findElements(By.xpath("//li/form/button"));
        for(WebElement o : olist){
            System.out.println(o);
        }
        int a = olist.size();
        System.out.println(olist.get(0).getText());
        olist.get(0).click();
        Thread.sleep(2000);

 

        // Write code here that turns the phrase above into concrete actions
    }
}