package com.api.hotel.service;

import com.api.hotel.entity.Huesped;
import java.util.List;

public interface HuespedService {

    List<Huesped> findHuespedAll();
    Huesped findHuespedById(Long idhuesped);
    Huesped saveHuesped(Huesped huesped);
    Huesped updateHuesped(Huesped huesped);
    void deleteHuesped(Long idhuesped);
}
