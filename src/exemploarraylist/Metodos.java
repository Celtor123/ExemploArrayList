/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;


import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author oracle
 */
public class Metodos {
    public void agregar(ArrayList<Integer>lista){
        
        int valor= Integer.parseInt(JOptionPane.showInputDialog("Introduce valor"));
        lista.add(valor);
        
        System.out.println(lista);
       
    }
    public void visualizar(ArrayList<Integer>lista){
         int valor1= Integer.parseInt(JOptionPane.showInputDialog("Introduce valor"));
        lista.add(valor1);
        System.out.println(lista);
    }
    public void borrarPosicion(ArrayList<Integer>lista){
        int r=Integer.parseInt(JOptionPane.showInputDialog("Qué posicion quiere eliminar?"));
        lista.remove(r-1);
    }
    
}
