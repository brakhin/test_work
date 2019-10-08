package ru.brakhin.depservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.brakhin.depservice.models.Service;
import ru.brakhin.depservice.repository.IServiceRepository;

@Component
@Slf4j
public class DataInitializer implements CommandLineRunner {

    @Autowired
    IServiceRepository serviceRepository;

    @Override
    public void run(String... args) throws Exception {

        if (!this.serviceRepository.findAll().iterator().hasNext()) {

            for (int i = 1; i < 10; i++) {
                serviceRepository.save(new Service("Услуга № " + i));
            }

        }
    }
}
