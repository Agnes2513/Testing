package com.batch2.artifact1.repository;

import com.batch2.artifact1.domain.booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<booking, Long> {
}
