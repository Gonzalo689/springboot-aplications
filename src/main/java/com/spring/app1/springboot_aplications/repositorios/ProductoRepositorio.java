package com.spring.app1.springboot_aplications.repositorios;

import com.spring.app1.springboot_aplications.models.Productos;
import java.util.List;
public interface ProductoRepositorio {
 
    List<Productos> getProductos();
    Productos getProductoById(long id);
}
