/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pablo
 */
public class Arreglo {
    
    public static void sumaLista(int arr[]){
        int sum = 0;
        double prom;
        for(int num:arr){
            sum += num;
             }
    System.out.println("La suma de los elementes es: " + sum );
    prom = (double)sum/arr.length;
    System.out.println("El promedio de los elementos es: " + prom);
    }
    public static void buscarMayor(int matriz[][]){
    int mayor=0;
        for (int[] a : matriz) {
            for (int b:a) {
                if (mayor < b) {
                    mayor = b;
                }
            }
        }
    System.out.println("El numero mayor de la matriz es: "+ mayor);
    }

    public static void cuentaVocales(String palabra){
        
        int cont=0;
        for(int i=0;i<palabra.length() ;i++){
            if(palabra.charAt(i)== 'a' || palabra.charAt(i)=='e' || palabra.charAt(i)=='i' 
                    || palabra.charAt(i)=='o' || palabra.charAt(i)=='u'||palabra.charAt(i)== 'A' || palabra.charAt(i)=='E' || palabra.charAt(i)=='I' 
                    || palabra.charAt(i)=='O' || palabra.charAt(i)=='U'){
            
                cont++;
            }        
        
        }
    System.out.println("La cantidad de vocales es: " + cont);
    }
    
    public static void cuantaCaracter(String palabra,char caracter){
        
        int cont=0;
        for(int i=0;i < palabra.length();i++){
            if(palabra.charAt(i)== caracter){
            cont++;
            }
        }
        System.out.println("La cantidad de veces que se repite el caracter ingresado es: "+cont);
    
    }


}
