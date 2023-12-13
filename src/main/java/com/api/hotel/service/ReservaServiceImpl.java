package com.api.hotel.service;

import com.api.hotel.entity.Reserva;
import com.api.hotel.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ReservaServiceImpl implements ReservaService{

    @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public List<Reserva> findReservaAll() {
        List<Reserva> reservas = (List<Reserva>) reservaRepository.findAll();

        return reservas;
    }

    @Override
    public Reserva findReservaById(Long idreserva) {
        Optional<Reserva> existingReserva = reservaRepository.findById(idreserva);
        Reserva reserva = existingReserva.orElse(null);
        return reserva;
    }

    @Override
    public Reserva saveReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @Override
    public Reserva updateReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @Override
    public void deleteReserva(Long idreserva) {
        reservaRepository.deleteById(idreserva);
    }
}
