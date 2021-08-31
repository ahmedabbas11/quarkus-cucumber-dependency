package com.quarkus.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.inject.Inject;

public class MyStepdefs {

    @Inject
    SomeBean bean;

    @Given("a running quarkus application")
    public void aRunningQuarkusApplication() {
        bean.doSomething();
    }

    @When("I ask the hello resource")
    public void iAskTheHelloResource() {
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String arg0) {
    }

    @When("I ask the greeting service")
    public void iAskTheGreetingService() {
    }

    @Then("I should be greeted with {string}")
    public void iShouldBeGreetedWith(String arg0) {
    }
}
