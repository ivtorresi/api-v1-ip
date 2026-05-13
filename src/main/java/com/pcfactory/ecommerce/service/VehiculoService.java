package com.pcfactory.ecommerce.service;

import com.pcfactory.ecommerce.model.Vehiculo;
import com.pcfactory.ecommerce.repository.VehiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService {

    private final VehiculoRepository vehiculoRepository;

    public VehiculoService(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    public List<Vehiculo> listarTodosLosVehiculos() {
        return vehiculoRepository.findAll();
    }

    public Optional<Vehiculo> mostrarVehiculoPorId(Long id) {
        return vehiculoRepository.findById(id);
    }

    public Vehiculo guardarVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }
}