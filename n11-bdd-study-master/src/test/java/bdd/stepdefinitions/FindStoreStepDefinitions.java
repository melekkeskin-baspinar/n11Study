package bdd.stepdefinitions;

import bdd.steps.FindStoreSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class FindStoreStepDefinitions {

  @Steps
  private FindStoreSteps findStoreSteps;

  @Given("^User Open Stores Page$")
  public void userOpenStoresPage() {
    findStoreSteps.openStoresPage();
  }

  @When("^User Click All Stores$")
  public void userClickAllStores() {
    findStoreSteps.clickAllStores();
  }

  @When("^User Go Filter Stores Start \"([^\"]*)\" Letter$")
  public void userGoFilterStoresStartLetter(String startLetter) {
    findStoreSteps.findStore(startLetter);
    findStoreSteps.getStartLetterHrefList();
  }

  @Then("^User Should See to Opened Page Url Same Random Store Href$")
  public void userShouldSeeToOpenedPageUrlSameRandomStoreHref() {

    findStoreSteps.assertSourceUrl();
  }
}
