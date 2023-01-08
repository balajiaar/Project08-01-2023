package RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefiles/login.feature",glue="Stepdefinition",monochrome=true,dryRun=false)
public class Runnerclassmain
{
}


  


