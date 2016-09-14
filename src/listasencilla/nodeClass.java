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
public class nodeClass<N> {
    N data;
    nodeClass next;
    
    public nodeClass(N data){
        this.data = data;
        this.next = null;
    }
}