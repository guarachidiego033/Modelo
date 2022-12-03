/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DIEGO
 */
public class clsModelo {
   public String mostrarProducto(String nombre,String descripcion,double precio){
   
   String cadena="";
   cadena +="Nombre del Producto:  "+nombre;
   cadena +="\nDescripcion del Producto:  "+descripcion;
   cadena +="\nPrecio del Producto:  "+Double.toString(precio);
   return cadena;
   
   
   }
}
