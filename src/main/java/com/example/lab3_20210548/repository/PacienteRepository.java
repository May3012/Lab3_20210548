package com.example.lab3_20210548.repository;

import com.example.lab3_20210548.entity.Paciente;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PacienteRepository extends JpaRepository<Paciente,Integer> {
    List<Paciente> findByClinica_Id(int clinica_id);
    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "update paciente set numero_habitacion=?1  where id = ?2")
    void actualizarHabitacion(String numeroHbaitacion, int id_paciente);

}
