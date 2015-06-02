import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Женя on 02.06.2015.
 */
public class Limit {
    /**As a user of the library catalogue,
     I want advanced search options on the front page so that
     I can quickly and easily refine my search.
     I can limit the search by format/type.*/

    String btName="";
    String value="";
    String searchBar="";
    String material="";
    String format = " ";
    String type = "";

    private WebDriver driver ;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    @Given("User try input som $value in $searchBar")
    public void Get_value(WebDriver driver,String value,String searchBar)
    {
        driver.findElement(By.id(searchBar)).sendKeys(value);

    }
    @When("User can correct $value$ and bush the button $btnG")
    public void Push_button(WebDriver driver,String btName, String value, String searchBar)
    {
        driver.findElement(By.id(searchBar)).sendKeys(value);
        driver.findElement(By.name(btName)).click();
    }

    @Alias("User can user format & type in search")
    public void Format_search (WebDriver driver, String format, String type, String searchBar, String value, String btName ) {
        driver.findElement(By.id(format)).click();
        driver.findElement(By.id(type)).click();
        driver.findElement(By.id(searchBar)).sendKeys(value);
        driver.findElement(By.name(btName)).click();
    }



    @Then("The user will receive the desired material")
    public String Will_get_material(WebDriver driver,String material)
    {
        material=driver.getPageSource();
        return material;
    }


}

