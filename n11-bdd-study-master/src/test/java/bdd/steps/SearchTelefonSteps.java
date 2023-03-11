package bdd.steps;

import bdd.pages.HomePage;
import net.serenitybdd.core.steps.UIInteractionSteps;


public class SearchTelefonSteps extends UIInteractionSteps {

  private HomePage homePage;

  public void filterBySecondBrand() {
    element(HomePage.SECOND_BRAND_FILTER).click();
  }

  public void sortSearchResult(String sortParameter) {
    element(HomePage.SORT_LIST_OPTION).click();
    element(HomePage.SORT_PARAMETER + sortParameter + "')]").click();
  }

  public void filterByCargoOption(String cargoOption) {
    element(HomePage.CARGO_OPTIONS_FILTER).click();
    element(HomePage.CARGO_OPTION_FILTER_TEXT + cargoOption + "')]").click();
  }
}

