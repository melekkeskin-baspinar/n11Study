package bdd.steps;

import bdd.pages.*;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.yecht.Data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class SearchiPhoneSteps extends UIInteractionSteps {

  private HomePage homePage;
  private ProductDetailPage productDetailPag;
  private BasketPage basketPage;

  public String getFirstItemHref() {
    return firstItemHref;
  }

  public void setFirstItemHref(String firstItemHref) {
    this.firstItemHref = firstItemHref;
  }

  public String getLastItemHref() {
    return lastItemHref;
  }

  public void setLastItemHref(String lastItemHref) {
    this.lastItemHref = lastItemHref;
  }

  private String firstItemHref;
  private String lastItemHref;


  public void openHomePage() {
    homePage.open();

  }

  public void searchKeywords(String searchKeyword) {
    element(HomePage.SEARCH_TEXT).sendKeys(searchKeyword);
    element(HomePage.SEARCH_BTN).click();
    findFirstAndLastItmHref();
  }

  private void findFirstAndLastItmHref() {
    setFirstItemHref(element(By.xpath(HomePage.PRODUCT_XPATH_TEXT + 1 + "]//a")).getAttribute("href"));
    setLastItemHref(element(By.xpath(HomePage.PRODUCT_XPATH_TEXT + (getDriver().findElements(HomePage.PRODUCT_LIST).size() - 1) + "]//a")).getAttribute("href"));
  }

  public void addFirstItem() {
    getDriver().get(getFirstItemHref());
    element(ProductDetailPage.ADD_BASKET_BTN).click();
  }

  public void addLastItem() {
    getDriver().get(getLastItemHref());
    element(ProductDetailPage.ADD_BASKET_BTN).click();
  }

  public void openBasketPage() {

    basketPage.open();

  }

  public void clickToCheckOutBtn() {
    if (element(HomePage.KVKK_CLOSE_BTN).isVisible())
      element(HomePage.KVKK_CLOSE_BTN).click();
    element(HomePage.CHECK_OUT_BTN).click();
  }

  public void clickToContinueGuestUser() {
    element(HomePage.CONTINUE_GUEST_USER).click();
  }

  public void checkAddedProducts() {
    String lastCheckOutProductHref = thenReturnElementList(HomePage.CHECKOUT_FIRST_PRODUCT).get(0).getAttribute("href");
    String firstCheckOutProductHref = thenReturnElementList(HomePage.CHECKOUT_FIRST_PRODUCT).get(1).getAttribute("href");
    Assert.assertEquals(getFirstItemHref(), firstCheckOutProductHref);
    Assert.assertEquals(getLastItemHref(), lastCheckOutProductHref);
  }
}

