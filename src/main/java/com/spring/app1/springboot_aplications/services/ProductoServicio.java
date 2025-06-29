package com.spring.app1.springboot_aplications.services;

import com.spring.app1.springboot_aplications.models.Productos;
import java.util.List;
public interface ProductoServicio {
    public Productos getProductoById(long id);
    public List<Productos> getAllProductos();
 
}
