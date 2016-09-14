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
public class linealListClass<T> {
    
    private nodeClass first;//Se crean los nodos que se usaran como privados
    private nodeClass last;
    
    //Métodos
    
    public void insertFirst(T n){
        nodeClass node = new nodeClass(n);
        if(isEmpty()){//Si está vacia la lista
            first = node;
            last = node;
        }
        else{//Si no está vacia la lista
            node.next = first;
            first = node;
        }
    }
    
    public void insertFinal(T n){//Método para insertar un nodo al final
        nodeClass node = new nodeClass(n);//Se crea un nodo
        if(isEmpty()){//Si está vacia la lista
            first = node;
            last = node;
        }
        else{//Si no está vacia la lista
            node.next = null;//El nodo creado apuntara a null
            last = node;//y el ultimo nodo apuntara al nodo creado
        }
    }
    
    public void eraseFirst(){//Método para borrar primer nodo
        first = first.next;//Se cambia de lugar el puntero first al siguiente para no tomar en cuenta el nodo
    }
    
    public void eraseLast(){//Método para borrar el ultimo nodo
        nodeClass node = first;//Se crea un puntero que sea igual a primero
        nodeClass prev = null;//Se crea otro puntero que sea igual a null
        while(node.next!=null){//Se verifica si node.next es diferente de null
            prev = node;//De ser asi el siguiente puntero es igual a node
            node = node.next;//Mientras que node es igua a node.next, de esta forma se va
            //verificando si lo que sigue del ultimo nodo es igual a null, se elimina
        }
        last = prev;
        prev.next = null;
    }
    
    public void showList(){//Método para mostrar la lista
        if(!isEmpty()){//Se verifica si la lista no vacia
            nodeClass point;//Se crea un puntero
            point = (nodeClass) first;//Y se iguala a primero para empezar a recorrer
            while(point != null){//Si la ubicación en donde esta el puntero es diferente de null
                System.out.print("[ " + point.data + " ] " + " ==> ");//Se imprime el dato encontrado en el nodo
                point = point.next;//Se recorre la posición del puntero en 1
            }
            System.out.print(" ==> ☠");//Se imprime una calavera para indicar que es null
        }
        else{
            System.out.println("La lista esta vacia");//Si la lista esta vacia se imprime un mensaje
            //indicando que esta vacia
        }
    }
    
    private boolean isEmpty(){//Método boolean para ver si la lista esta vacia o no
        return first == null;//First es igual a null
    }

    public void eraseList(){//Método para borrar toda la lista
        first = null;//Se iguala first a null
    }
}