package com.api.hotel.service;

import com.api.hotel.entity.Reserva;
import java.util.List;

public interface ReservaService {

    List<Reserva> findReservaAll();
    Reserva findReservaById(Long idreserva);
    Reserva saveReserva(Reserva reserva);
    Reserva updateReserva(Reserva reserva);
    void deleteReserva(Long idreserva);
}
