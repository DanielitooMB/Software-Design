/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.aa_uc2_269990;

/**
 *
 * @author Daniel
 */
public class Ordenamientos {
    
public static void burbuja(int[] arreglo) {
    
    int n = arreglo.length; // 1

        // Ciclo externo
        for (int i = 0; i < n - 1; i++) { // 1 + n + n-1
            
            // Ciclo interno
            for (int j = 0; j < n - 1; j++) { // 1 + n + n-1
                
                // Comparación de elementos
                if (arreglo[j] > arreglo[j + 1]) { // 1
                    
                    // Intercambio de valores
                    int aux = arreglo[j];        // 1 
                    arreglo[j] = arreglo[j + 1];  // 1
                    arreglo[j + 1] = aux;        // 1 
                }
            }
        }
        
           //1 + (1 + n + n-1) + (n-1) * [1 + n + n-1 + 1 + 3]
           //Complejidad temporal: O(n^2)
    
}
}
