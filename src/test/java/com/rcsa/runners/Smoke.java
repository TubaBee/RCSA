package com.rcsa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/main/resources/features"
        ,glue="com/rcsa/steps"
        ,dryRun=false
        ,plugin= {"pretty", "html:target/html/cucumber-default-report"
        ,"json:target/cucumber.json"
        , "rerun:target/failed.txt"}
        ,monochrome=true
        ,tags= {"@smoke"}
)
public class Smoke {
}