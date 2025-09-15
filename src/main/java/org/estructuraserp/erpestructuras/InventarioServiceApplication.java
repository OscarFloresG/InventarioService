package org.estructuraserp.erpestructuras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class InventarioServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventarioServiceApplication.class, args);
        System.out.println("InventarioService iniciado. Escuchando en el puerto 8081.");
    }

    @GetMapping("/inventario/{productoId}")
    public int getStock(@PathVariable String productoId) {
        // En un caso real, esto consultaría una base de datos.
        // Para la PoC, siempre devolvemos una cantidad fija.
        System.out.println(" [✓] Petición de stock recibida para el producto: " + productoId);
        return 50; // Siempre hay 50 unidades en stock
    }
}