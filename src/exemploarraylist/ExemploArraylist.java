/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExemploArraylist {

    public static void main(String[] args) {
    
        boolean exit=false;
        ArrayList <Integer>lista=new ArrayList<Integer>();  
        int opcion;
        Metodos a= new Metodos();
   
        do{
        
    
      opcion=Integer.parseInt(  JOptionPane.showInputDialog("MENU   \n1-agregar\n2- visualizar  \n3- borrrarPosicion\n4- exit\n teclea opcion"));
      switch(opcion){
          case 1: a.agregar(lista);
          break;
          case 2: a.visualizar(lista);
          break;
          case 3: a.borrarPosicion(lista);
          break;
          case 4: exit=true;
          break;
      }
        }
     while(exit==false);
    }
    
}
