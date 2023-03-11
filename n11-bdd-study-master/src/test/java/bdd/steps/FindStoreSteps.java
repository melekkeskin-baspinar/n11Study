package bdd.steps;

import bdd.pages.StoresPage;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Random;


public class FindStoreSteps extends UIInteractionSteps {

  private StoresPage storesPage;
  private String randomStoreHref;
  private String openedStorePageUrl;

  public void openStoresPage() {
    storesPage.open();
  }

  public void clickAllStores() {
    element(StoresPage.ALL_STORES_TITLE).click();
  }

  public void findStore(String startLetter) {
    element(StoresPage.FIND_STORES + startLetter + "']").click();
  }

  public String getRandomStoreHref() {
    return randomStoreHref;
  }

  public void setRandomStoreHref(String randomStoreHref) {
    this.randomStoreHref = randomStoreHref;
  }

  public String getOpenedStorePageUrl() {
    return openedStorePageUrl;
  }

  public void setOpenedStorePageUrl(String openedStorePageUrl) {
    this.openedStorePageUrl = openedStorePageUrl;
  }

  public void getStartLetterHrefList() {
    Random rnd = new Random();
    int randomStores = rnd.nextInt(100);
    By randomStoresXpath = By.xpath(StoresPage.FIND_START_WITH_LETTER_TEXT + randomStores + "]/a");
    setRandomStoreHref(element(randomStoresXpath).getAttribute("href"));
    element(randomStoresXpath).click();
    setOpenedStorePageUrl(getDriver().getCurrentUrl());
  }

  public void assertSourceUrl() {
    Assert.assertEquals(getRandomStoreHref(), getOpenedStorePageUrl());
  }
}

