/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.aa_uc2_269990;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] arreglo = {10, 4, 24, 3, 8, 12};
        
        System.out.println("--- Menu de Algoritmos ---");
        System.out.println("1. Ordenamiento Burbuja");
        System.out.println("2. Ordenamiento por Seleccion");
        System.out.println("3. Ordenamiento por Insercion");
        System.out.println("4. Ordenamiento por Quicksort");
        System.out.println("5. Ordenamiento por Merge Sort");
        System.out.print("Selecciona una opcion: ");
        
        int opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Ordenando por Burbuja...");
                Ordenamientos.BubbleSort(arreglo);
                imprimirArreglo(arreglo);
                break;
            case 2:
                System.out.println("Ordenamiento por Seleccion...");
                Ordenamientos.selectionSort(arreglo);
                imprimirArreglo(arreglo);
                break;
            case 3:
                System.out.println("Ordenamiento por Insercion...");
                Ordenamientos.insertionSort(arreglo);
                imprimirArreglo(arreglo);
            case 4:
                System.out.println("Ordenamiento por Quicksort...");
                Ordenamientos.quicksort(arreglo, 0, arreglo.length - 1); // arreglo=datos a ordenar, 0=indice donde inicia el ordenamiento, arreglo.length-1=indice del ultimo elemento ya que los arreglos empiezan en 0
                imprimirArreglo(arreglo);
            case 5:
                System.out.println("Ordenamiento por Merge Sort...");
                Ordenamientos.mergeSort(arreglo, 0, arreglo.length - 1); // arreglo=datos a ordenar, 0=indice donde inicia, arreglo.length-1=indice del ultimo elemento ya que los arreglos empiezan en 0
                imprimirArreglo(arreglo);
            default:
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        System.out.print("Resultado: [ ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
    
}
