package com.example.lab3_20210548.repository;
import com.example.lab3_20210548.entity.Clinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicaRepository extends JpaRepository<Clinica,Integer> {

}
