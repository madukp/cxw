package org.cxw.demo;

	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(plugin = { "pretty", "html:target/cucumber-html-report", "json:target/cucumber-report.json" },
			glue = "org.cxw.demo",
			features = "src\\resources\\testcase\\"

	)

	public class RunTest {

	}

