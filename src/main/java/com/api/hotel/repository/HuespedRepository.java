package com.api.hotel.repository;

import com.api.hotel.entity.Huesped;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HuespedRepository extends JpaRepository<Huesped, Long> {
}
