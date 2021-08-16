import com.sun.corba.se.spi.ior.ObjectKey;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.nio.charset.Charset;

public class APITest {

    String baseURL = "https://api.github.com/";
    CloseableHttpClient client;
    HttpGet request;
    HttpDelete deleteRequest;
    HttpResponse response;
    HttpPost postrequest;

    String jsonMimeType = "application/json";
    String email = "mailfrom61@gmail.com";
    String user ="Evgenygroup";
    String password ="Friend1967!";


    String token ="";
    private String auth;

    @BeforeClass
    public void setUp() {

    }

    @BeforeTest
    public void init() {
        client = HttpClientBuilder.create().build();
    }

    @AfterTest
    public void tearDown() throws IOException {
        client.close();
    }


    @DataProvider(name = "users")
    public Object[][] data() {
        return new Object[][] { {"inUserxxx", "404"},{"Evgenygroup", "200"}};
    }

    @DataProvider(name = "endpoints")
    public Object[][] url() {
        return new Object[][] {{"user"}, {"user/followers"}};
    }

    @Test(dataProvider = "users")
    public void testUserGeneric(String user, String status) throws IOException {
        // Given условие
        // endpoints user_url": "https://api.github.com/users/{user}
        request = new HttpGet(baseURL +"users/" + user);
        request.setHeader(HttpHeaders.AUTHORIZATION, makeHeader());

        // When действие
        response = client.execute(request);

        //Then проверка
        String currentStatus = String.valueOf(response.getStatusLine().getStatusCode());
        Assert.assertEquals(currentStatus, status);
    }

    private String makeHeader() {
        auth = email + ":" + password;
        byte[] encodeAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("ISO-8859-1")));
        String authHeader = "Basic " + new String(encodeAuth);
        //System.out.println(authHeader);
        return authHeader;
    }
}