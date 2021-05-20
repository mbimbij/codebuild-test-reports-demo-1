package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {
        "pretty",
    },
    glue = {"org.example"},
    features = "src/test/resources/features/postdeploy")
public class CucumberRunnerPostDeploy {
}
