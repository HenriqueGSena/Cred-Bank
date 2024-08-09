package com.credbank.backend.controller;

import com.credbank.backend.entity.Leads;
import com.credbank.backend.service.LeadsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class LeadsController {

    @Autowired
    private LeadsService leadsService;

    @GetMapping("/leads")
    public ResponseEntity<?> getRandomLeads() {
        try {
            Leads leads = leadsService.getRandomLead();

            if (leads == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Nenhum lead encontrado.");
            }
            return ResponseEntity.ok(leads);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Ocorreu um erro ao buscar o lead.");
        }
    }
}
