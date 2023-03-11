package bdd.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.n11.com/magazalar")
public class StoresPage extends PageObject {
  public static String FIND_STORES = "//*[@class='letters']//*[@title='";
  public static By ALL_STORES_TITLE = By.xpath("//h3[contains(text(),'Tüm Mağazalar')]");
  public static String FIND_START_WITH_LETTER_TEXT = "//*[@id='contentSellerList']//*[@class='searchInput']//following::li[";
}
