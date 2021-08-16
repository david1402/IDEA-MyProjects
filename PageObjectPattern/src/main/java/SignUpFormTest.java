import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class SignUpFormTest extends  FunctionalTest {
    @Test
    public void signUp() throws InterruptedException{
        driver.get("https://kimschiller.com/page-object-pattern-tutorial/index.html");
        SignUpPage signUpPage =new SignUpPage(driver);
        assertTrue(signUpPage.isInitialised());

        signUpPage.enterName("First","Last");
        signUpPage.enterAddress("123 Street","13456");
        Thread.sleep(2000);

       ReceiptPage receiptPage = signUpPage.submit();


        /*
    public ReceiptPage submit(){
        submitButton.click();
        return  new ReceiptPage(driver);
    } */

        assertTrue(receiptPage.isInitialised());

        assertEquals("Thank you!",receiptPage.confirmationHeader());


    }
}
