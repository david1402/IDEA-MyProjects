package LieferandoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.PageObject;

public class MenuPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"menu-tab-content\"]/div[1]/div/div[1]/h1")
    private WebElement restLabel;



    public MenuPage (WebDriver driver){
        super(driver);
    }

    public String checkLabel (){
       return restLabel.getText();
    }




}
