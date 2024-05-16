/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6_ed;

/**
 *
 * @author patri
 */
public class Tarea6EDClase {
    
    private static final int LIMITE = 3;

    private void mensaje(double precioFinalProducto) {
        System.out.println("El total a pagar es:"+precioFinalProducto);
        System.out.println("Enviado");
    }
    
    
    public void aplicarDescuento(double precioProducto, int numProductos){     double precioFinalProducto;
    if(numProductos>LIMITE)
        precioProducto-=5;
            if (numProductos!=0){
            precioFinalProducto = precioProducto*0.8;
            mensaje(precioFinalProducto);
        }else {
            precioFinalProducto = precioProducto*0.95;
            mensaje(precioFinalProducto);
        }   

    }

}
