
package com.mycompany.trabajolistasenlazadas;

import com.mycompany.actividadestruct.Nodo;
import com.mycompany.actividadestruct.Nodo;
import javax.swing.JOptionPane;

 
public class lista {
    
   

    public Nodo inicio;

    public lista() {
        inicio = null;
    }
    public lista insertarcabeza(String name, int edad, int CantDias, String Id,int Habitacion) {
        Nodo nuevo = new Nodo(name,edad,CantDias,Id,Habitacion);
        nuevo.enlace = inicio;
        inicio = nuevo;
        return this;
    }
    public void visualizar() {
        Nodo actual;
        actual = inicio;
        while (actual != null) {
            System.out.print(" " + actual.name + " " + actual.Id+" "+actual.toString());
            actual = actual.enlace;
        }
    } 
    public void add(Nodo newNodo){
        //puntero temporal para recorreme en la lista
        Nodo tmp = inicio;

        //si la lista esta vacia
        if(tmp==null){
            //lo agregamos al root
            inicio = newNodo;
        }else{
            //de lo contrario nos recorremos hasta el ultimo
            while(tmp.enlace!=null)
                tmp = tmp.enlace;
            //en el ultimo hacemos el enlace 
            tmp.enlace = newNodo;
        }
        
    }

    public lista insertar(String name, int edad, int CantDias, String Id, int Habitacion) {
        Nodo nuevo = new Nodo(name,edad,CantDias,Id,Habitacion);
        nuevo.enlace = nuevo.enlace;
       nuevo.enlace = nuevo;
        return this;

    }
    public Nodo buscar(String name, int edad, int CantDias, String Id, int Habitacion) {
    Nodo j = inicio;  // Inicializa el nodo 'j' como el primer nodo de la lista (llamado 'inicio')
    
    // Recorre la lista hasta que no haya más nodos
    while (j != null) {
        // Compara los datos del nodo actual con los parámetros proporcionados
        if (j.name.equals(name) && j.edad == edad && j.CantDias == CantDias && j.Id.equals(Id) && j.Habitacion == Habitacion) {
            return j;  // Si los datos coinciden, retorna el nodo 'j'
        }
        j = j.enlace;  // Pasa al siguiente nodo en la lista
    }
    
    // Si no encontró el nodo con esos valores, muestra un mensaje
    JOptionPane.showMessageDialog(null, "El dato buscado no está en la lista");
    
    return null;  // Retorna null si no encontró ningún nodo con los valores buscados
}
}