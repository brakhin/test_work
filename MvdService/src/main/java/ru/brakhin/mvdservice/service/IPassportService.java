package ru.brakhin.mvdservice.service;

import ru.brakhin.mvdservice.models.Passport;

public interface IPassportService {
    Passport save(Passport passport);
    Passport findPassportBySerAndNumber(String ser, String num);
}
