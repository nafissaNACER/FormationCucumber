package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MyStepdefs {

    static WebDriver driver;

    @Before
    public void initializedBrowser(){
        String driverPath = "C:\\Users\\nnacer\\Tools\\drivers\\chromeDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
    }

    @Given("I am on the Google search page")
    public void i_am_on_the_google_search_page() {

        driver.get("https://www.google.com");
    }
    @When("I search for {string}")
    public void i_search_for(String query) {
        WebElement element = driver.findElement(By.name("q"));
        // Enter something to search for
        element.sendKeys(query);
        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();
    }
    @Then("the page title should start with {string}")
    public void the_page_title_should_start_with(String titleStartsWith) {
        // Google's search is rendered dynamically with JavaScript
        // Wait for the page to load timeout after ten seconds
        new WebDriverWait(driver, 10L).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith(titleStartsWith);
            }
        });
    }


    @After()
    public void closeBrowser () {
        driver.quit();
    }

    @And("number of result equal to {int}")
    public void numberOfResultEqualTo(int arg0) {
        System.out.println("test ok" + arg0);
    }

    @And("result equal {int}")
    public void resultEqual(int arg0) {
        System.out.println("test ok2" + arg0);
    }


    @Given("lanch Broweser")
    public void lanchBroweser() {
        System.out.println("lanch Broweser ok");
    }

    @When("maximise my browzer")
    public void maximiseMyBrowzer() {
        System.out.println("maximise my browzer ok");

    }

    @Then("print hello massage")
    public void printHelloMassage() {
        System.out.println("Hello World");
    }
}
