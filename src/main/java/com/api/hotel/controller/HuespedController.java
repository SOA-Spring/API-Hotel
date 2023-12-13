package com.api.hotel.controller;

import com.api.hotel.entity.Huesped;
import com.api.hotel.service.HuespedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/huesped")
public class HuespedController {

    @Autowired
    private HuespedService huespedService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Huesped> findHuespedAll() {

        return huespedService.findHuespedAll();
    }

    @GetMapping("/{idhuesped}")
    @ResponseStatus(HttpStatus.OK)
    public Huesped findHuespedById(@PathVariable Long idhuesped) {

        return huespedService.findHuespedById(idhuesped);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Huesped saveHuesped(@RequestBody Huesped huesped) {

        return huespedService.saveHuesped(huesped);
    }

    @PutMapping("/editar/{idhuesped}")
    @ResponseStatus(HttpStatus.OK)
    public Huesped updateHuesped(@RequestBody Huesped huesped, @PathVariable Long idhuesped) {
        huesped.setIdHuesped(idhuesped);
        return huespedService.updateHuesped(huesped);
    }

    @DeleteMapping("/{idhuesped}")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void deleteHuesped(@PathVariable Long idhuesped) {

        huespedService.deleteHuesped(idhuesped);
    }

}
