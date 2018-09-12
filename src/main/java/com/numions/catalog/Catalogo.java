package com.numions.catalog;

import org.springframework.http.ResponseEntity;

import java.util.*;

import static sun.misc.Version.print;

public class Catalogo {

    List<Producto> productosDelCatalogo;


    public int size(){return productosDelCatalogo.size();}

    public Catalogo() {
        this.productosDelCatalogo =new ArrayList<>();
    }

    public List<Producto> getProductosDelCatalogo() {
        return productosDelCatalogo;
    }

    public void setProductosDelCatalogo(List<Producto> productosDelCatalogo) {
        this.productosDelCatalogo = productosDelCatalogo;
    }

    public void addProduct (Producto prod) {
        productosDelCatalogo.add(prod);
        System.out.print(productosDelCatalogo.size());

    }


}
