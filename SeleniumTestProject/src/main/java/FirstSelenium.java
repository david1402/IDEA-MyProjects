import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

    public class FirstSelenium {
       static String url1 ="https://www.sputnik-57.com//";
       static String url2 ="https://www.amazon.in/";
       static String url3 ="https://www.facebook.com";
       static String url4 ="https://www.flipcart.com";
       static String url5 ="https://www.google.com";

    WebDriver driver;

    public void invokeBrowser(String path) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(path);

    }
    public void closeBrowser(){
        driver.close();
    }

        public static void main(String[] args) {
            FirstSelenium test =new FirstSelenium();
           test.invokeBrowser(url1);
           test.driver.findElement(By.id("comp-jua5821flabel")).click();
           test.driver.findElement(By.id("comp-juaayug9input")).sendKeys("Firstnam");
           test.driver.findElement(By.id("comp-juaayugbinput")).sendKeys("Secondnam");
           test.driver.findElement(By.id("comp-juaayugdinput")).sendKeys("mail45t6781@gmail.com");
           test.driver.findElement(By.id("comp-juaayugfinput")).sendKeys("Password12!");
           test.driver.findElement(By.id("comp-juab70gcinput")).click();
           test.driver.findElement(By.id("comp-juaayugglink")).click();
           test.closeBrowser();

//Johnny Depp
            test.invokeBrowser(url5);
            test.driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"))
                    .sendKeys("johnny depp");
            test.driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div[2]/center/input[1]"))
                    .click();
            test.driver.findElement(By.cssSelector("#hdtb-msb-vis > div:nth-child(3) > a")).click();
            test.closeBrowser();



            test.invokeBrowser(url5);
            WebElement element = test.driver.findElement(By.name("q"));
            element.sendKeys("cheese");
            element.submit();
            List<WebElement>cheeses =test.driver.findElements(By.name("cheese"));
            System.out.println(cheeses.size());
            test.closeBrowser();

           // List<WebElement> rows = test.driver.findElements(By.name("csi"));



        }


}
