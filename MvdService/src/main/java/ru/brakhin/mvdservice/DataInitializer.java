package ru.brakhin.mvdservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.brakhin.mvdservice.models.Mvd;
import ru.brakhin.mvdservice.models.Passport;
import ru.brakhin.mvdservice.repository.IPassportRepository;

@Component
@Slf4j
public class DataInitializer implements CommandLineRunner {

    @Autowired
    IPassportRepository passportRepository;

    @Override
    public void run(String... args) throws Exception {

        if (!this.passportRepository.findAll().iterator().hasNext()) {

            passportRepository.save(new Passport("0456", "246485",
                    new Mvd("ПВС УВД Прикубанского округа г. Краснодара", "232-002"),
                    "02.04.1998", "Сидорова", "Ирина", "Семеновна",true));
            passportRepository.save(new Passport("1549",  "154832",
                    new Mvd("ПВС УВД Карасунского округа г. Краснодара", "254-258"),
                    "01.07.1988", "Иванов", "Иван", "Петрович",true));
            passportRepository.save(new Passport("1683", "485920",
                    new Mvd("ПВС УВД г. Армавира", "254-125"),
                    "24.09.2007", "Пантелеев", "Сергей", "Сергеевич",false));
            passportRepository.save(new Passport("1218", "584532",
                    new Mvd("ПВС УВД Прикубанского округа г. Краснодара", "232-002"),
                    "14.07.2005", "Иванова", "Татьяна", "Петровна",true));
            passportRepository.save(new Passport("2422", "435678",
                    new Mvd("ПВС УВД Западного округа г. Краснодара", "548-025"),
                    "07.11.1990", "Сухоруков", "Егор", "Кузьмич",false));
            passportRepository.save(new Passport("0564", "854238",
                    new Mvd("ПВС УВД Западного округа г. Краснодара", "548-025"),
                    "05.09.2008", "Семенова", "Алла", "Степановна",true));
        }
    }
}
