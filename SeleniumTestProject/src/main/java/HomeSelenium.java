import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeSelenium {
    public static void main(String[] args) {
     String url1 = "https://www.sputnik-57.com/";
     String url2 = "https://www.facebook.com/";
     String url3 ="https://www.google.com/";



     System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

     driver.get(url3);

        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"))
                .sendKeys("johnny depp");
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div[2]/center/input[1]"))
                .click();
        //1 option
      //  driver.findElement(By.cssSelector("#hdtb-msb-vis > div:nth-child(3) > a")).click();

        //2 option
        driver.findElement(By.linkText("Bilder")).click();
        driver.quit();

        //3 option.
        WebElement container =  driver.findElement(By.id("hdtb-msb-vis"));
        List<WebElement> list = container.findElements(By.tagName("a"));
        for(WebElement el:list){
            if (el.getText().equals("Bilder")){
                el.click();
                System.out.println("I am here");
                break;
            }

        }

    driver.quit();
    }}


