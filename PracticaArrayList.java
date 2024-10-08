/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quieres2;

/**
 *
 * @author Alumno
 */
//Es para importar todas las clases (scanner, arraylist, etc)
import java.util.*;

//ARRAY LIST
public class PracticaArrayList {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exp;
        //Pueden ser de: String, Integer, Boolean, Character
        ArrayList<Integer> numeros = new ArrayList();
        //add - agregar dato
        numeros.add(2); //Posicion 0, 2 nuevo valor
        numeros.add(3); //Posicion 1, 3 nuevo valor
        numeros.add(4); //Posicion 2, 4 nuevo valor
        //set - modificar dato
        numeros.set(1,5); //Posicion 1, 5 nuevo valor (sustituye al 3)
        //get - imprimir lo que esta almacenado
        numeros.get(1);
        exp = numeros.get(1); //Almacena la posición 1 del arreglo en una variable
        System.out.println(+exp); //Imprime la variable exp(Posición 1 del arreglo)
        System.out.println(numeros.get(2)); //Imprime la posición 2
        //size - saber el tamaño del arreglo
        numeros.size();
        exp = numeros.size(); //Almacena la longitud del arreglo en una variable
        System.out.println(+exp); //Imprime la variable exp(Posición 1 del arreglo)
        System.out.println(numeros.size()); //Imprime la longitud del arreglo
        //contains - buscar un dato dentro del arreglo
        numeros.contains(2); //Busca el número 2 dentro del arreglo
        System.out.println(numeros.contains(2)); //Arroja true porque si esta
        System.out.println(numeros.contains(152)); //Arroja false porque no esta
        //clear - vaciar el arreglo
        numeros.clear();
    }
}