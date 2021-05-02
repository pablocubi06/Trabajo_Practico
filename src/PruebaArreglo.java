/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pablo
 */
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] ={10,7,5,8,9};
        Arreglo.sumaLista(arr);
        int matriz[][]={{1,5,6,3},{7,1,5,3},{9,7,1,5}};
        Arreglo.buscarMayor(matriz);
        Arreglo.cuentaVocales("Ahora");
        Arreglo.cuantaCaracter("palabra", 'a');
    }
    
}
