package com.pcfactory.ecommerce.model;

import jakarta.persistence.*;

@Entity
@Table(
        name = "vehiculos",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "patente")
        }
)
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehiculo;

    @Column(nullable = false)
    private Long idMarca;

    @Column(nullable = false)
    private Long idModelo;

    @Column(nullable = false)
    private Integer anio;

    @Column(nullable = false, length = 30)
    private String color;

    @Column(nullable = false, unique = true, length = 10)
    private String patente;

    public Vehiculo() {
    }

    public Vehiculo(Long idMarca, Long idModelo, Integer anio, String color, String patente) {
        this.idMarca = idMarca;
        this.idModelo = idModelo;
        this.anio = anio;
        this.color = color;
        this.patente = patente;
    }

    public Long getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Long idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Long getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Long idMarca) {
        this.idMarca = idMarca;
    }

    public Long getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Long idModelo) {
        this.idModelo = idModelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}