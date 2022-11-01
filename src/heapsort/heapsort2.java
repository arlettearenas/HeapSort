/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heapsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Noena
 */
public class heapsort2 {
   // public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
   //public static String entrada;
    
    //creacion del metodo para la clasificacion del arreglo
    public void clasificacion(int array[]){
        //creacion de variable 
        int n = array.length;
        
        //agregamos el ciclo for i es igual a la variable n entre 2 - 1 , si i es mayor o igual a cero entonces i se decrementa
        for(int i = n / 2 - 1;i >= 0;i--)
        //los valores del metodo amontonar
        amontonar(array,n,i);
        
        //ciclo for pero ahora i es igual a n - 1 , si i es mayor a 0, i se decrementa
        for(int i = n - 1; i > 0; i--){
            //creamos valores que nos ayudan a almacenar los valores
            int evento = array[0];
            array[0] = array[i];
            array[i] = evento;
       
            //el metodo amontonar ahora almacena los valores de este ciclo for 
            amontonar(array,i,0);
        }
    }
    
    //creacion del metodo  no devuelve nada solo se almacena los valores
    void amontonar(int array[], int n,int i){
        //creacion de variables
        int largo  = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        
        //condicion con if si l es menos que n y el arreglo de l es mayor al arreglo de largo, entonces largo es igual a l
        if (l < n && array[l]> array[largo])
            largo = l;
        
        //condicion con if si r es menos a n y el array de r es mayor al array de largo,entonces largo es igual a r
        if(r < n && array[r] > array[largo])
            largo = r;
        
        //condicion con if si largo no es igual a i,(creamos una variable llamada intercambio) entonces intercambio es igual al array de i, 
        //array de i es igual a array de largo y array de largo es igual a intercambio
        if(largo != i){
            int intercambio = array[i];
            array[i] = array[largo];
            array[largo] = intercambio;
        
        //se almacena los valores en el metodo
        amontonar(array,n,largo);
        }
            
}
    //creacion del metodo que nos imprima el arreglo
    static void imprimirArray(int array[]){
        //creacion de variable
        int n = array.length;
        
        //ciclo for inicializamos a i con 0, si i es menor a n entonces i se incrementa
        for(int i = 0;i < n; i++)
           //que nos imprima el arreglo de i
          System.out.print(array[i] + " ");
        System.out.println();
    }

    
    
    public static void main(String[] args) throws IOException {
    //declaracion de array manual
    int array [] = {20,14,15,5,7,10,8,19};
    //creacion de variable que calcule el largo de el arreglo
    int n = array.length;
    
    //llamado de funcion 
    heapsort2 ob = new heapsort2();
    ob.clasificacion(array);
    
    //impresion del arreglo
        System.out.println("El acomodamiento es: ");
        imprimirArray(array);
 
    }
}
