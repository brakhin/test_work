package ru.brakhin.workplace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.brakhin.workplace.model.Mvd;
import ru.brakhin.workplace.repository.IMvdRepository;

@Service
@Repository
public class MvdServiceImpl implements IMvdService {

    @Autowired
    private IMvdRepository mvdRepository;

    @Override
    public Mvd save(Mvd mvd) {
        return mvdRepository.save(mvd);
    }
}
