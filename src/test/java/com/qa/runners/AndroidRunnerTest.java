package com.qa.runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report-android.html",
                "summary",
        },
        features = {"src/test/resources"},
        glue = {"com.qa.stepdef"},
        dryRun=false,
        monochrome=true,
        strict = true,
        tags = "@testReg or ~@testReg1"
    )

    public class AndroidRunnerTest extends RunnerBase{

}
