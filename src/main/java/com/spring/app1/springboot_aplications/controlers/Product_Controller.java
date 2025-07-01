package com.spring.app1.springboot_aplications.controlers;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.spring.app1.springboot_aplications.models.Productos;
import com.spring.app1.springboot_aplications.services.ProductoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/productos")
public class Product_Controller  {
    @Autowired
    private ProductoServicio services ;

    @GetMapping()
    public List<Productos> getProducts() {
        return services.getAllProductos();
    }

    @GetMapping("/{id}")
    public Productos getProduct(@PathVariable long id) {
        return  services.getProductoById(id);
    }

}
