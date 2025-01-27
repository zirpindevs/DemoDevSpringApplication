package com.example.demoDevSpring.controller;

import com.example.demoDevSpring.model.Proveedor;
import com.example.demoDevSpring.service.ProveedorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

    private final ProveedorService proveedorService;

    public ProveedorController(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    @Operation(summary = "Obtener todos los proveedores", description = "Devuelve una lista con todos los proveedores disponibles en la base de datos.")
    @ApiResponse(responseCode = "200", description = "Lista de proveedores obtenida con éxito.")
    @GetMapping
    public List<Proveedor> obtenerProveedores() {
        return proveedorService.obtenerTodosLosProveedores();
    }
}