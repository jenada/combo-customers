package pl.ajn.combo.customers.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.ajn.combo.customers.converters.AddressConverter;
import pl.ajn.combo.customers.converters.CustomerConverter;
import pl.ajn.combo.customers.converters.DictionaryConverter;
import pl.ajn.combo.customers.converters.LocationConverter;

@Configuration
public class Converters {

    @Bean
    public CustomerConverter customerConverter() {
        return new CustomerConverter();
    }

    @Bean
    public AddressConverter addressConverter() {
        return new AddressConverter();
    }

    @Bean
    public LocationConverter locationConverter() {
        return new LocationConverter();
    }

    @Bean
    public DictionaryConverter dictionaryConverter() {
        return new DictionaryConverter();
    }
}
