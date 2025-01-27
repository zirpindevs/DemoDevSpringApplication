package com.example.demoDevSpring.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "proveedores")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private Long idProveedor;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "fecha_de_alta")
    private LocalDate fechaDeAlta;

    @Column(name = "id_cliente")
    private Long idCliente;

    // Getters y setters
    public Long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(LocalDate fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                ", nombre='" + nombre + '\'' +
                ", fechaDeAlta=" + fechaDeAlta +
                ", idCliente=" + idCliente +
                '}';
    }
}
