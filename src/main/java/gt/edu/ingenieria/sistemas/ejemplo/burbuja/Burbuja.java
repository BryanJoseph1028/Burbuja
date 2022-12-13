package gt.edu.ingenieria.sistemas.ejemplo.burbuja;


import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bryan1010p
 */
public class Burbuja {
    public static void main(String [] args){
        Burbuja bur =new Burbuja();
            System.out.println("los valores en orden son");
            bur.orden();
            System.out.println("");
            System.out.println("los valores en desorden son");
            bur.desorden();
             }
    
    public void orden(){
        int aux= 0;
       int numeros[] = {2,6,5,4,7,8,9,1,4,6,3,7,6,5,4,3,2,4,5};
       Arrays.sort(numeros);
       for (int i= 0; i<numeros.length; i++){
           for(int j=i; j<numeros.length; j++){
               if(numeros[i] > numeros[j]){
                   aux = numeros[j];
                   numeros[i] = numeros[j];
                   numeros[j] = aux;
               }
           }
       }
       for(int i=0; i<numeros.length; i++){
           System.out.print(" " + numeros[i] + "," );
                }
    }
    public void desorden(){
        int aux= 0;
       int numeros[] = {2,6,5,4,7,8,9,1,4,6,3,7,6,5,4,3,2,4,5};
       for (int i= 0; i<numeros.length; i++){
           for(int j=i; j>numeros.length; j++){
               if(numeros[i] > numeros[j]){
                   aux = numeros[j];
                   numeros[i] = numeros[j];
                   numeros[j] = aux;
               }
           }
       }
       for(int i=0; i<numeros.length; i++){
           System.out.print(" " + numeros[i] + "," );
                }
    }
    
    
         }
