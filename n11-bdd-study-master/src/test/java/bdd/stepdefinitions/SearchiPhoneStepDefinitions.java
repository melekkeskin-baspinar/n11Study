package bdd.stepdefinitions;

import bdd.pages.HomePage;
import bdd.steps.FindStoreSteps;
import bdd.steps.SearchiPhoneSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchiPhoneStepDefinitions {

  @Steps
  private SearchiPhoneSteps searchiPhoneSteps;

  @Given("^User Open Home Page$")
  public void userOpenHomePage() {
    searchiPhoneSteps.openHomePage();
  }

  @Given("^User Search \"([^\"]*)\"$")
  public void userSearch(String searchKeyword) {
    searchiPhoneSteps.searchKeywords(searchKeyword);
  }

  @When("^User add first item$")
  public void userAddFirstItem() {
    searchiPhoneSteps.addFirstItem();
  }

  @When("^User add last item$")
  public void userAddLastItem() {
    searchiPhoneSteps.addLastItem();
  }

  @Then("^User Should See to Added Products In Basket$")
  public void userShouldSeeToAddedProductsInBasket() {
    searchiPhoneSteps.openBasketPage();
  }

  @When("^User Go to Checkout Page$")
  public void userGoToCheckoutPage() {
    searchiPhoneSteps.clickToCheckOutBtn();
    searchiPhoneSteps.clickToContinueGuestUser();
  }

  @Then("^User Should See Check Out Products Same The Added Products$")
  public void userShouldSeeCheckOutProductsSameTheAddedProducts() {
    searchiPhoneSteps.checkAddedProducts();
  }
}
