package ru.brakhin.depservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ru.brakhin.depservice.models.Service;

public interface IServiceRepository extends CrudRepository<Service, Integer> {
    Service findFirstByName(String name);
}
