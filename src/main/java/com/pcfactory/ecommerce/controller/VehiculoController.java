package com.pcfactory.ecommerce.controller;

import com.pcfactory.ecommerce.model.Vehiculo;
import com.pcfactory.ecommerce.service.VehiculoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    private final VehiculoService vehiculoService;

    public VehiculoController(VehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }

    @GetMapping
    public List<Vehiculo> listarTodosLosVehiculos() {
        return vehiculoService.listarTodosLosVehiculos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehiculo> mostrarVehiculoPorId(@PathVariable Long id) {
        return vehiculoService.mostrarVehiculoPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Vehiculo guardarVehiculo(@RequestBody Vehiculo vehiculo) {
        return vehiculoService.guardarVehiculo(vehiculo);
    }
}