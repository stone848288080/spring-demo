package top.ximimi.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class LemonSteps {

    static EdgeDriver driver;
    static{
        System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
        driver = new EdgeDriver();
    }
    @Before
    public void setUp(Scenario scenario){
        log.info("set up step");
        log.error("error test");
        log.warn("warn test");
        log.debug("debug test");
        log.info(scenario.getId());
        log.info(scenario.getName());
        log.info(scenario.getStatus());
    }


    @Given("打开百度搜索")
    public void open() throws InterruptedException {
        driver.navigate().to("https://www.baidu.com");
        Thread.sleep(1000);
        log.info("open baidu");
    }

    @When("输入  {string}")
    public void input(String string) {
        WebElement webElement = driver.findElement(By.name("wd"));
        webElement.sendKeys(string);
        webElement.submit();
    }

    @Then("显示 {string}")
    public void show(String title) {
        new WebDriverWait(driver,5).until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[contains(text(),'"+title+"')]")
                )
        );
    }


    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
        log.info("after step");
        log.fatal("fatal test");
    }
}
