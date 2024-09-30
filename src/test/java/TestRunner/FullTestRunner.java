package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = "StepDefinations",
        tags = "@bmetCl",
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failedrerun.txt"},
        monochrome = true)

public class FullTestRunner{
        }