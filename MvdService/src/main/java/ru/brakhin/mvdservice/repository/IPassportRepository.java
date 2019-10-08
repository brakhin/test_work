package ru.brakhin.mvdservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ru.brakhin.mvdservice.models.Passport;

public interface IPassportRepository extends CrudRepository<Passport, Integer> {
    Passport findPassportBySerAndNumber(String ser, String num);
}
