package com.rcsa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="@target/failed.txt"
        ,glue="com/rcsa/steps"
        ,monochrome = true
        ,plugin= "pretty"
)
public class FailedRunner {
}