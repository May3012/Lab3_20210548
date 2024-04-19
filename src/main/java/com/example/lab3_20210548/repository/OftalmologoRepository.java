package com.example.lab3_20210548.repository;

import com.example.lab3_20210548.entity.Oftalmologo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OftalmologoRepository extends JpaRepository<Oftalmologo,Integer> {
    List<Oftalmologo> findByClinica_id(int clinica_id);

}
