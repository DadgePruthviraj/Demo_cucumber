package runner_class;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resource/features/fb_login.feature",
		glue="step_files",
		plugin= {"pretty","html:target/HTMLReports.html",
				           "json:target/JsonrReport/report.json"},
		tags="@Valid",
		monochrome= true,
		dryRun= true
		//strict= true
		
	    )

public class LoginRunner {

}
