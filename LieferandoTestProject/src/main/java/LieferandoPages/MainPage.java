package LieferandoPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.PageObject;

public class MainPage extends PageObject {

    @FindBy(id="imysearchstring")
    private WebElement search;

    @FindBy(id="submit_deliveryarea")
    private WebElement submit;

    public MainPage (WebDriver driver){
        super(driver);
    }

    public RestListPage enterIndex (String index){
        search.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        search.clear();
        search.sendKeys(index); // not  sending index is because of constant autocomplete on lieferando!can't help it
        submit.click();
        return  new RestListPage(driver);
    }

}
