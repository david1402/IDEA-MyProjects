package de.telran.tracker.gateway;

import de.telran.tracker.model.SearchResult;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class WeatherGateway {
    RestTemplate rest = new RestTemplate();

    public String findWoeid(String city) {

        String url = "https://www.metaweather.com/api/location/search/?query="+city;

        System.out.println(url);
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        HttpEntity<Void> entity = new HttpEntity<>(headers);

        ResponseEntity<SearchResult[]> forEntity = rest.exchange(url, HttpMethod.GET, null, SearchResult[].class);

        return forEntity.getBody()[0].getWoeid();

    }
}
