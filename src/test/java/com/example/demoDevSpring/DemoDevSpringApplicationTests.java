package com.example.demoDevSpring;

import com.example.demoDevSpring.model.Proveedor;
import com.example.demoDevSpring.repository.ProveedorRepository;
import com.example.demoDevSpring.service.ProveedorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@SpringBootTest
class DemoDevSpringApplicationTests {

	private ProveedorRepository proveedorRepository;
	private ProveedorService proveedorService;

	@BeforeEach
	void setUp() {
		// Creamos un repositorio simulado usando Mockito
		proveedorRepository = Mockito.mock(ProveedorRepository.class);
		proveedorService = new ProveedorService(proveedorRepository);
	}

	@Test
	void testObtenerTodosLosProveedores_ListaConDatos() {
		// Preparamos datos simulados
		List<Proveedor> proveedores = new ArrayList<>();
		Proveedor proveedor1 = new Proveedor();
		proveedor1.setIdProveedor(1L);
		proveedor1.setNombre("Coca-cola");
		proveedor1.setFechaDeAlta(LocalDate.of(2025, 1, 1));
		proveedor1.setIdCliente(5L);

		Proveedor proveedor2 = new Proveedor();
		proveedor2.setIdProveedor(2L);
		proveedor2.setNombre("Pepsi");
		proveedor2.setFechaDeAlta(LocalDate.of(2025, 1, 2));
		proveedor2.setIdCliente(6L);

		proveedores.add(proveedor1);
		proveedores.add(proveedor2);

		// Simulamos el comportamiento del repositorio
		when(proveedorRepository.findAll()).thenReturn(proveedores);

		// Ejecutamos el método y verificamos el resultado
		List<Proveedor> resultado = proveedorService.obtenerTodosLosProveedores();
		assertEquals(2, resultado.size());
		assertEquals("Coca-cola", resultado.get(0).getNombre());
		assertEquals("Pepsi", resultado.get(1).getNombre());
	}

	@Test
	void testObtenerTodosLosProveedores_ListaVacia() {
		// Simulamos un repositorio vacío
		when(proveedorRepository.findAll()).thenReturn(new ArrayList<>());

		// Ejecutamos el metodo y verificamos que la lista está vacía
		List<Proveedor> resultado = proveedorService.obtenerTodosLosProveedores();
		assertTrue(resultado.isEmpty());
	}
}
