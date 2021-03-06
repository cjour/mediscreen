package com.cjour.mediscreen.repository;

import com.cjour.mediscreen.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
    Patient findByFirstname(String firstname);
}
