import LieferandoPages.MainPage;
import LieferandoPages.MenuPage;
import LieferandoPages.RestListPage;


import org.junit.Test;
import utils.FunctionalTest;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class BasicOrderWithoutLoginTest extends FunctionalTest {

   final String url ="https://www.lieferando.de/";
   final String index ="10787";
   final String restName ="Shawarma One";
   final int minSum =8;
   MainPage mainPage=new MainPage(driver);
   RestListPage restListPage;
   MenuPage menupage;


    @Test
    public void orderingTest(){
        //conditions (зайти на сайт)
        driver.get(url);


        //action
         restListPage = mainPage.enterIndex(index);

        //assertion (проверка)
        assertTrue(restListPage.checkSearch());
        String lab =restListPage.checkIndexlabel();
        assertTrue(restListPage.checkIndexlabel().contains(index));

        //action (we select restoraunt)
        menupage= restListPage.selectRest(restName);

        //assertion
        assertTrue(restName.equals(menupage.checkLabel()));




    }
}
