package com.example.ben_api.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DataService {

    private final RestTemplate restTemplate = new RestTemplate();

    public String fetchData() {
        String url = "https://opendata.paris.fr/api/explore/v2.1/catalog/datasets/stationnement-sur-voie-publique-emprises/records?limit=20";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return response.getBody();
    }
}


