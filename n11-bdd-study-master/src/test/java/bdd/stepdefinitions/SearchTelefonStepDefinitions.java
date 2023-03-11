package bdd.stepdefinitions;

import bdd.steps.SearchTelefonSteps;
import bdd.steps.SearchiPhoneSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchTelefonStepDefinitions {

  @Steps
  private SearchTelefonSteps searchTelefonSteps;

  @When("^User Filter Search Result By Second Brand Name$")
  public void userFilterSearchResultBySecondBrandName() {
    searchTelefonSteps.filterBySecondBrand();
  }

  @When("^User Sort Search Result By \"([^\"]*)\"$")
  public void userSortSearchResultBy(String sortParameter)  {
      searchTelefonSteps.sortSearchResult(sortParameter);
  }

  @When("^User Filter Search Result By Cargo Options \"([^\"]*)\"$")
  public void userFilterSearchResultByCargoOptions(String cargoOption) {
    searchTelefonSteps.filterByCargoOption(cargoOption);
  }
}
