package com.api.hotel.controller;

import com.api.hotel.entity.Reserva;
import com.api.hotel.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reserva")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Reserva> findReservaAll() {

        return reservaService.findReservaAll();
    }

    @GetMapping("/{idreserva}")
    @ResponseStatus(HttpStatus.OK)
    public Reserva findReservaById(@PathVariable Long idreserva) {

        return reservaService.findReservaById(idreserva);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Reserva saveReserva(@RequestBody Reserva reserva) {

        return reservaService.saveReserva(reserva);
    }

    @PutMapping("/editar/{idreserva}")
    @ResponseStatus(HttpStatus.OK)
    public Reserva updateReserva(@RequestBody Reserva reserva, @PathVariable Long idreserva) {
        reserva.setIdReserva(idreserva);
        return reservaService.updateReserva(reserva);
    }

    @DeleteMapping("/{idreserva}")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void deleteReserva(@PathVariable Long idreserva) {

        reservaService.deleteReserva(idreserva);
    }
}
