package com.assaabloy.despachos.utility;

import com.assaabloy.despachos.dto.EnvioDto;
import com.assaabloy.despachos.dto.RespuestaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class ConsumirRest {

    
    /* Metodo Post para consumir un servico */
    public static String addEnviosRest(String url, Object envioDto) {
        RestTemplate template = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<Object>(envioDto,headers);
        ResponseEntity<String> responseEntity = template.exchange(url, HttpMethod.POST, entity, String.class);
        return responseEntity.getBody();
        
    }
    
    /*Metodo Put para Consumir un servicio */    
    public static String updateServicioRest(String url,Object object){
        RestTemplate restTemplate =new RestTemplate();
         HttpHeaders headers =new HttpHeaders();
         headers.setContentType(MediaType.APPLICATION_JSON);
         HttpEntity<Object> entity=new HttpEntity<Object>(object,headers);
         ResponseEntity<String> responseEntity=restTemplate.exchange(url, HttpMethod.PUT,entity,String.class);
        return responseEntity.getBody();
    }
    
    /*Metodo Delete para Consumir un servicio */    
    public static String deleteServicioRest(String url,Object object){
        RestTemplate restTemplate =new RestTemplate();
         HttpHeaders headers =new HttpHeaders();
         headers.setContentType(MediaType.APPLICATION_JSON);
         HttpEntity<Object> entity=new HttpEntity<Object>(object,headers);
         ResponseEntity<String> responseEntity=restTemplate.exchange(url, HttpMethod.DELETE,entity,String.class);
        return responseEntity.getBody();
    }
    
    /*Metodo GET   para Consumir un servicio */    
    public static String getServicioRestFind(String url,Object object){
        RestTemplate restTemplate =new RestTemplate();
         HttpHeaders headers =new HttpHeaders();
         headers.setContentType(MediaType.APPLICATION_JSON);
         HttpEntity<Object> entity=new HttpEntity<Object>(object,headers);
         ResponseEntity<String> responseEntity=restTemplate.exchange(url, HttpMethod.GET,entity,String.class);
        return responseEntity.getBody();
    }
    
    

}
