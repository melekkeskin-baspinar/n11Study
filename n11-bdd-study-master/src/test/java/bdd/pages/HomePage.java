package bdd.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.n11.com/")
public class HomePage extends PageObject {

  public static final String SORT_PARAMETER = "//div[contains(text(),'";
  public static final By CARGO_OPTIONS_FILTER = By.xpath("//*[contains(@class, 'filter cargoFilter acc')]");
  public static final String CARGO_OPTION_FILTER_TEXT = "//span[contains(text(),'";
  public static By SECOND_BRAND_FILTER = By.xpath("(//*[@class=\"filterContent\"]//*[@class=\"filterItem customCheckWrap wl\"]//a)[2]");
  public static By SEARCH_TEXT = By.id("searchData");
  public static By SEARCH_BTN = By.xpath("//*[@class='searchBtn']");
  public static By PRODUCT_LIST = By.xpath("//*[@id='listingUl']//li");
  public static String PRODUCT_XPATH_TEXT = "//*[@id=\"listingUl\"]//li[";
  public static By CHECK_OUT_BTN = By.xpath("//span[contains(text(),'Satın Al')]");
  public static By KVKK_CLOSE_BTN = By.xpath("//*[@id='userKvkkModal']//*[@class='closeBtn']");
  public static By CONTINUE_GUEST_USER = By.xpath("//*[@id='loginForm']/a");
  public static By CHECKOUT_FIRST_PRODUCT = By.xpath("//*[@class='prodDescription'][1]");
  public static By SORT_LIST_OPTION = By.id("smartListOption");

}
