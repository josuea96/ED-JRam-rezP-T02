//Josué Alexis Ramírez Pérez 513622 4º Semestre
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasencilla;

/**
 *
 * @author josuealexis96
 */
public class ListaSencilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        linealListClass list = new linealListClass();
        list.insertFirst(3);
        list.insertFirst(3.563); 
        list.insertFirst("Hola Compañero"); 
        list.insertFirst(true); 
        list.insertFirst("H");
        list.insertFinal(false);
        list.showList();
        System.out.println("");
        list.eraseLast();
        list.showList();
        list.eraseFirst();
        System.out.println("");
        list.showList();
        list.eraseList();
        System.out.println("");
        list.showList();               
    } 
}
