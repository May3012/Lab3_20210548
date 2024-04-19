package com.example.lab3_20210548.entity;
import jakarta.persistence.*;

@Entity
@Table(name="paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "edad")
    private int edad;
    @Column(name = "genero")
    private String genero;
    @Column(name = "diagnostico")
    private String diagnostico;
    @Column(name = "fecha_cita")
    private String fecha_cita;
    @Column(name = "numero_habitacion")
    private String numero_habitacion;

    @ManyToOne
    @JoinColumn(name = "oftalmologo_id")
    private Oftalmologo oftalmologo;

    @ManyToOne
    @JoinColumn(name="clinica_id")
    private Clinica clinica;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(String fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public String getNumero_habitacion() {
        return numero_habitacion;
    }

    public void setNumero_habitacion(String numero_habitacion) {
        this.numero_habitacion = numero_habitacion;
    }

    public Oftalmologo getOftalmologo() {
        return oftalmologo;
    }

    public void setOftalmologo(Oftalmologo oftalmologo) {
        this.oftalmologo = oftalmologo;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }
}
