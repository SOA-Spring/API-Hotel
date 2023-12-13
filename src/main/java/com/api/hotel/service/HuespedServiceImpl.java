package com.api.hotel.service;

import com.api.hotel.entity.Huesped;
import com.api.hotel.repository.HuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HuespedServiceImpl implements HuespedService {

    @Autowired
    private HuespedRepository huespedRepository;

    @Override
    public List<Huesped> findHuespedAll() {
        List<Huesped> huespedes = (List<Huesped>) huespedRepository.findAll();

        return huespedes;
    }

    @Override
    public Huesped findHuespedById(Long idhuesped) {
        Optional<Huesped> existingHuesped = huespedRepository.findById(idhuesped);
        Huesped huesped = existingHuesped.orElse(null);
        return huesped;
    }

    @Override
    public Huesped saveHuesped(Huesped huesped) {
        return huespedRepository.save(huesped);
    }

    @Override
    public Huesped updateHuesped(Huesped huesped) {
        return huespedRepository.save(huesped);
    }

    @Override
    public void deleteHuesped(Long idhuesped) {
        huespedRepository.deleteById(idhuesped);
    }
}
