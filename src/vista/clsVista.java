/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import controlador.clsControlador;
import modelo.clsModelo;
import javax.swing.JOptionPane;

public class clsVista {
 public static void main(String[]args){
 clsControlador ctr=new clsControlador();
 
 String producto=JOptionPane.showInputDialog("Ingrese Nombre del Producto");
 String descripcion=JOptionPane.showInputDialog("Ingrese Descripcion del Producto");
 double precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese Precio del Producto"));
 String[]registro=new String[3];
 registro[0]=producto;
  registro[1]=descripcion;
   registro[2]=Double.toString(precio);
   String pantalla="";
   pantalla=ctr.InsertarProducto(registro);
   System.out.println("\n"+pantalla);
 }   
}
