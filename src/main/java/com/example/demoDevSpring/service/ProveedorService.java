package com.example.demoDevSpring.service;

import com.example.demoDevSpring.model.Proveedor;
import com.example.demoDevSpring.repository.ProveedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {

    private final ProveedorRepository proveedorRepository;

    public ProveedorService(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    public List<Proveedor> obtenerTodosLosProveedores() {
        return proveedorRepository.findAll();
    }
}