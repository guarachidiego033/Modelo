/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.clsModelo;
public class clsControlador {
    public String InsertarProducto(String[]detaPro){
    clsModelo mdl=new clsModelo();
    String nomPro=detaPro[0];
    String descPro=detaPro[1];
    double prePro=Double.parseDouble(detaPro[2]);
    String cadena="";
    cadena=mdl.mostrarProducto(nomPro, descPro, prePro);
    return cadena;
    }
    
}
