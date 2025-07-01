package com.spring.app1.springboot_aplications.services;

import com.spring.app1.springboot_aplications.models.Productos;
import com.spring.app1.springboot_aplications.repositorios.ProductoRepositorio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Servicio para manejar productos.
 * Este servicio interactúa con el repositorio de productos para obtener
 * una lista de productos y buscar un producto por su ID.
 */
@Service
public class Producto_Services_Imp  implements ProductoServicio{

    @Autowired
    private ProductoRepositorio repoProductos;

    @Override
    public List<Productos> getAllProductos() {
        
        // return repoProductos.getProductos().stream()
        //         // cuida con el precio, se multiplica por 2, con una base de datos no pasaria 
        //         //porque se cogeria continuamente el precio de la base de datos de la base de datos
        //         .map(producto -> new Productos(producto.getId(), producto.getNombre(), producto.getPrecio()* 2)) 
        //         .toList();

        return repoProductos.getProductos().stream()
                .map(producto -> {
                    // Clonamos el producto para evitar modificar el original
                    Productos clonedProducto = (Productos) producto.clone();
                    // Modificamos el precio del clon
                    clonedProducto.setPrecio(clonedProducto.getPrecio() * 2);
                    return clonedProducto;
                })
                .toList();
    }
    @Override
    public Productos getProductoById(long id) {
        return repoProductos.getProductoById(id);
    }

}
