package com.google;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",dryRun = false,plugin = {"pretty","html:google-login.html"})
public class GoogleRunner {
}
