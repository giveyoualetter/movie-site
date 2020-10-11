package com.movie.config;

import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.config.HttpClientConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JElasticsearchClientConfig {
    @Bean
    public JestClient createJestClient(){
        JestClientFactory factory = new JestClientFactory();
        factory.setHttpClientConfig((new HttpClientConfig.Builder("http://localhost:9200")).build());
        return factory.getObject();
    }
}
