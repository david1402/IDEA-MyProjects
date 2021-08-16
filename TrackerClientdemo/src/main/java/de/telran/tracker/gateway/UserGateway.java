package de.telran.tracker.gateway;

import de.telran.tracker.model.Token;
import de.telran.tracker.model.User;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class UserGateway {

    RestTemplate rest = new RestTemplate();

    public boolean register(User user) {
        String userRegisterURL = "http://localhost:8080/user/register";
        System.out.println(user);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<User> entity = new HttpEntity<>(user, headers);


      /*  ResponseEntity<String> response = rest.postForEntity(userRegisterURL,
                entity,
                String.class);*/

        ResponseEntity<String>response =rest.exchange(userRegisterURL,
                HttpMethod.POST,
                entity,
                String.class);

        System.out.println(response.getStatusCode());

        return response.getStatusCode() == HttpStatus.OK;


    }

    public Token login (User user){
        String loginUrl = "http://localhost:8080/user/login";
        HttpEntity<User> entity = new HttpEntity<>(user);
        ResponseEntity<Token> exchange = rest.exchange(loginUrl,
                HttpMethod.POST,
                entity,
                Token.class);
        return exchange.getBody();

    }
}
