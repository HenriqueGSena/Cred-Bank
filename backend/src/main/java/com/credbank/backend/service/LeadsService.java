package com.credbank.backend.service;

import com.credbank.backend.entity.Leads;
import com.credbank.backend.repository.LeadsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class LeadsService {

    @Autowired
    private LeadsRepository leadsRepository;

    public Leads getRandomLead() {
        List<Leads> leads = leadsRepository.findAll();
        if (leads.isEmpty()) {
            throw new IllegalStateException("No leads found in the database");
        }
        Random random = new Random();
        int randomIndex = random.nextInt(leads.size());
        return leads.get(randomIndex);
    }
}
