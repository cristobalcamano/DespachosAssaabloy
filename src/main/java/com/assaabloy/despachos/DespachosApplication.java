package com.assaabloy.despachos;

import com.assaabloy.despachos.repository.PedidosRepository;
import com.assaabloy.despachos.services.PedidosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DespachosApplication {

    public static void main(String[] args) {
        SpringApplication.run(DespachosApplication.class, args);
    }
    
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();                
    }
    
}
