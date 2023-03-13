package net.seamlessly.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",//prints each step's detail on the console
                "html:target/cucumber_report.html",//html is the type of the report and the report is saved under the target folder and not pushed to gitHub
                "rerun:target/rerun.txt",//reports the failed tests and shows the lines of the related class and coding.
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",//Maven cucumber Reporting ( pretty ). Creates a comprehensive demonstrative report on a web page
        },
        features = "src/test/resources/features",//links to the "features" packagee
        glue = "src/test/step_definitions",//Links to the "step_definitions" package
        dryRun = true,
        tags = "@wip"
       // publish = true//creates a link of web browser on the console that includes a report so that the report page can be shared


)
public class CukesRunner {

}