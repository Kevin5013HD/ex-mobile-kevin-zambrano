package steps;

import configuration.AppiumConfig;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class SwagLabsSteps {

    private AppiumDriver driver;

    public SwagLabsSteps() throws Exception {
        driver = AppiumConfig.getDriver();
    }

    @Given("the user is on the login screen")
    public void userIsOnLoginScreen() {
        driver.findElement(By.id("test-Username")).sendKeys("standard_user");
        driver.findElement(By.id("test-Password")).sendKeys("secret_sauce");
        driver.findElement(By.id("test-LOGIN")).click();
    }

    @Then("the user logs in successfully")
    public void userLogsInSuccessfully() {
        WebElement productsTitle = driver.findElement(By.className("android.widget.TextView"));
        assertTrue(productsTitle.getText().equals("PRODUCTS"));
    }

    @Then("the title {string} is displayed and at least one item exists")
    public void validateTitleAndItems(String expectedTitle) {
        // Implementar validación del título y de los elementos
        WebElement productsTitle = driver.findElement(By.className("android.widget.TextView"));
        assertTrue(productsTitle.getText().equals(expectedTitle));
        // Implementar validación de al menos un elemento
        WebElement firstItem = driver.findElement(By.id("item_id"));
        assertTrue(firstItem.isDisplayed());
    }
}
