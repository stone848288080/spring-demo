package top.ximimi.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/lemon.feature",
glue = "top.ximimi.steps",monochrome = true)
public class LemonRunner extends AbstractTestNGCucumberTests {
}
