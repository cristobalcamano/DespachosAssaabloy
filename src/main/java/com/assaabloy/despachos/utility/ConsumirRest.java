package com.assaabloy.despachos.utility;

import com.assaabloy.despachos.dto.EnvioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class ConsumirRest {

    public static String addEnviosRest(String url, Object envioDto) {
        RestTemplate template = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<Object>(envioDto,headers);
        ResponseEntity<String> responseEntity = template.exchange(url, HttpMethod.POST, entity, String.class);
        return responseEntity.getBody();
    }

}
