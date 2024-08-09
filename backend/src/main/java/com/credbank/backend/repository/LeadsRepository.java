package com.credbank.backend.repository;

import com.credbank.backend.entity.Leads;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadsRepository extends JpaRepository<Leads, Long> {
}
