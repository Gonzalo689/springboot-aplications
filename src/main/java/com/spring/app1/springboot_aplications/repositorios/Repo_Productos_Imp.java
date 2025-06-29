package com.spring.app1.springboot_aplications.repositorios;
import com.spring.app1.springboot_aplications.models.Productos;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Repo_Productos_Imp implements ProductoRepositorio {
    List <Productos> productos ;

    public Repo_Productos_Imp() {
        this.productos = Arrays.asList(
            new Productos(1, "Producto 1", 100),
            new Productos(2, "Producto 2", 200),
            new Productos(3, "Producto 3", 300),
            new Productos(4, "Producto 4", 400),
            new Productos(5, "Producto 5", 500)

        );
    }
    @Override
    public List<Productos> getProductos() {
        return productos;
    }
    @Override
    public Productos getProductoById(long id) {
        return productos.stream()
                .filter(producto -> producto.getId() == id)
                .findFirst()
                .orElse(null);
    }

}
