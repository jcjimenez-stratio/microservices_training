package com.numions.catalog;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//PAtron ressts: Como se comunican las aplicaciones,estructura de endpoints
@RestController //Se devuele un string , un json etc...
public class controlador {

    Catalogo cat = new Catalogo();
/*@GetMapping ("Example")

    public ResponseEntity<String> holaMundo() {
    String x = "HelloWorld";
    return new ResponseEntity<>(x, HttpStatus.OK);
    }
    */

    @GetMapping ("Catalog")
    public ResponseEntity<String> mostrarProdcutos(){

        String var1 = "Estas viendo la lista de productos del catalogo \n";
        String var2 = "";

        if (cat.getProductosDelCatalogo().size()==0){
            var2 = "No hay productos \n";
        }
        else {
            for (int i=0;i<cat.size();i++){
                var2 += cat.getProductosDelCatalogo().get(i).nombre + "\n";
            }
        }


    return new ResponseEntity<>(var1 + var2,HttpStatus.OK);
    }

    @GetMapping("Catalog/{idProducto}")


    public ResponseEntity<String> mostrar1Producto (@PathVariable int idProducto){
        String var = "Estas viendo el producto" +"" + idProducto;
        return new ResponseEntity<>(var,HttpStatus.OK);
    }

    @PostMapping ("addCatalog/{idProducto}/{nombre}")

    public ResponseEntity<Object> añadirProducto (@PathVariable int idProducto,@PathVariable String nombre){

       Producto prueba = new Producto(idProducto,nombre);

        cat.addProduct(prueba);

     if (cat.getProductosDelCatalogo().size()==0){
         String var = "No hay productos en el catalogo";
         return new ResponseEntity<>(var,HttpStatus.OK);

     }
     else{
         String var = "Has añadido el producto " + nombre  + "\n";
         return new ResponseEntity<>(var,HttpStatus.CREATED);

     }

    }
}
