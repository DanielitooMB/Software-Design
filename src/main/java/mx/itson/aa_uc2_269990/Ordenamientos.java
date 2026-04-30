/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.aa_uc2_269990;

/**
 *
 * @author Daniel
 */
import java.util.Arrays;

public class Ordenamientos {
    
    public static void BubbleSort(int[] arreglo) { // arreglo inicial: [10, 4, 24, 3, 8, 12]

                        //complejidad temp // conteo

        int n = arreglo.length; // 1 // n = 6

        for (int i = 0; i < n - 1; i++) { // 1 + n + n-1 // i=0:[10,4,24,3,8,12] i=1:[4,10,3,8,12,24] i=2:[4,3,8,10,12,24] i=3:[3,4,8,10,12,24] i=4:[3,4,8,10,12,24]

            for (int j = 0; j < n - i - 1; j++) { // 1 + n + n-1 // j=0:10>4 correcto j=1:10>24 incorrecto j=2:...

                // Comparación de elementos
                if (arreglo[j] > arreglo[j + 1]) { // 1 // compara par actual con siguiente
                    // Intercambio de valores
                    int temp = arreglo[j];          // 1 // guarda elemento mayor: temp=10
                    arreglo[j] = arreglo[j + 1];   // 1 // coloca el menor en posición actual
                    arreglo[j + 1] = temp;          // 1 // coloca temp en posición siguiente
                }
            }
        }
        //1 + (2n) + (n-1) * [2n + (n-1) * 4]
        //Complejidad temporal: O(n^2)
        //Arreglo inicial:    [10,  4, 24,  3,  8, 12]
        //Despues i=0:        [ 4, 10,  3,  8, 12, 24]
        //Despues i=1:        [ 4,  3,  8, 10, 12, 24]
        //Despues i=2:        [ 3,  4,  8, 10, 12, 24]
        //Despues i=3,4:      [ 3,  4,  8, 10, 12, 24] sin cambios
        //Arreglo final:      [ 3,  4,  8, 10, 12, 24]
    }

    
    public static void selectionSort(int[] arr) { // arreglo inicial: [10, 4, 24, 3, 8, 12]

                        //complejidad temp // conteo

        int n = arr.length; // 1 // n = 6

        for (int i = 0; i < n - 1; i++) { // 1 + n + n-1 // i=0:[10,4,24,3,8,12] i=1:[3,4,24,10,8,12] i=2:[3,4,24,10,8,12] i=3:[3,4,8,10,24,12] i=4:[3,4,8,10,24,12]

            int indiceMinimo = i; // 1 // asume que el elemento actual es el mínimo

            for (int j = i + 1; j < n; j++) { // 1 + n + n-1 // busca el elemento menor en el resto del arreglo

                if (arr[j] < arr[indiceMinimo]) { // 1 // compara con el mínimo actual
                    indiceMinimo = j;             // 1 // actualiza el índice del mínimo si encuentra uno menor
                }
            }

            int aux = arr[indiceMinimo]; // 1 // guarda el valor mínimo encontrado
            arr[indiceMinimo] = arr[i];  // 1 // coloca el elemento actual en la posición del mínimo
            arr[i] = aux;                // 1 // coloca el mínimo en la posición actual
            // 1 + (2n) + (n-1) * [2n + (n-1) * 3]
            //Complejidad temporal: O(n^2)
            //Arreglo inicial:    [10,  4, 24,  3,  8, 12]
            //Despues de i=0:     [ 3,  4, 24, 10,  8, 12]
            //Despues de i=1:     [ 3,  4, 24, 10,  8, 12]
            //Despues de i=2:     [ 3,  4,  8, 10, 24, 12]
            //Despues de i=3:     [ 3,  4,  8, 10, 24, 12]
            //Despues de i=4:     [ 3,  4,  8, 10, 12, 24]
            //Arreglo final:      [ 3,  4,  8, 10, 12, 24]
        }
    }
    
    public static void insertionSort(int[] arr) { // arreglo inicial: [10, 4, 24, 3, 8, 12]

                        //complejidad temp // conteo

        int n = arr.length; // 1 // n = 6

        for (int i = 1; i < n; i++) { // 1 + n + n-1 // i=1:[10,4,24,3,8,12] i=2:[4,10,24,3,8,12] i=3:[4,10,24,3,8,12] i=4:[3,4,10,24,8,12] i=5:[3,4,8,10,24,12]

            int key = arr[i]; // 1 // guarda el elemento actual como clave a insertar
            int j = i - 1;   // 1 // j apunta al elemento anterior a la clave

            // Mover elementos mayores que la clave
            while (j >= 0 && arr[j] > key) { // n + n-1 // desplaza hacia la derecha elementos mayores que key
                arr[j + 1] = arr[j];          // 1       // mueve elemento mayor una posición a la derecha
                j = j - 1;                    // 1       // retrocede j para comparar el siguiente elemento
            }

            arr[j + 1] = key; // 1 // inserta la clave en su posición correcta
            // 1 + (2n) + (n-1) * [2n + (n-1) * 3]
            //Complejidad temporal: O(n^2)
            //Arreglo inicial:    [10,  4, 24,  3,  8, 12]
            //Despues de i=1:     [ 4, 10, 24,  3,  8, 12]
            //Despues de i=2:     [ 4, 10, 24,  3,  8, 12]
            //Despues de i=3:     [ 3,  4, 10, 24,  8, 12]
            //Despues de i=4:     [ 3,  4,  8, 10, 24, 12]
            //Despues de i=5:     [ 3,  4,  8, 10, 12, 24]
            //Arreglo final:      [ 3,  4,  8, 10, 12, 24]
        }
    }

    public static void quicksort(int[] arr, int inicio, int fin) { // arreglo inicial: [4, 2, 4, 3, 1, 4]

                    //complejidad temp // conteo

        if (inicio < fin) { // 1 // verifica que el subarreglo tenga mas de un elemento

            int pivoteIndice = particion(arr, inicio, fin); // 1 // obtiene el indice del pivote ya en su posicion correcta

            System.out.println("El indice del pivote es: " + pivoteIndice + ". El arreglo actualmente es: " + Arrays.toString(arr)); // imprime estado actual

            // Sub arreglo Izquierdo
            System.out.println("Izquierda");                    // imprime indicador de llamada izquierda
            quicksort(arr, inicio, pivoteIndice - 1);           // 1 // ordena recursivamente la mitad izquierda del pivote

            // Sub arreglo Derecho
            System.out.println("Derecha");                      // imprime indicador de llamada derecha
            quicksort(arr, pivoteIndice + 1, fin);              // 1 // ordena recursivamente la mitad derecha del pivote
        }
        // Complejidad temporal: O(n log n) promedio, O(n^2) peor caso
        // Arreglo inicial:          [4, 2, 4, 3, 1, 4]
        // Tras primera particion:   [2, 3, 1, 4, 4, 4]  pivote=4 en indice 3
        // Tras partir izquierda:    [1, 2, 3, 4, 4, 4]  pivote=1 en indice 0
        // Arreglo final:            [1, 2, 3, 4, 4, 4]
    }

    public static int particion(int[] arr, int inicio, int fin) { // 1 // divide el arreglo usando el ultimo elemento como pivote

        int pivote = arr[fin]; // 1 // toma el ultimo elemento como pivote: pivote=arr[fin]

        int i = inicio - 1; // 1 // i apunta a la posicion del ultimo elemento menor que el pivote

        for (int j = inicio; j < fin; j++) { // 1 + n + n-1 // recorre el arreglo comparando cada elemento con el pivote

            if (arr[j] < pivote) { // 1 // si el elemento actual es menor que el pivote
                i++;               // 1 // avanza i para marcar nueva posicion de elemento menor

                int temp = arr[i]; // 1 // guarda elemento en posicion i
                arr[i] = arr[j];   // 1 // coloca elemento menor en la zona izquierda
                arr[j] = temp;     // 1 // completa el intercambio
            }
        }

        int temp = arr[i + 1];  // 1 // guarda el elemento que esta donde ira el pivote
        arr[i + 1] = arr[fin];  // 1 // coloca el pivote en su posicion correcta
        arr[fin] = temp;        // 1 // mueve el elemento desplazado al final

        return i + 1; // 1 // retorna el indice donde quedo el pivote
        // 1 + (2n) + (n-1) * [4]
    }

    public static void mergeSort(int[] arr, int inicio, int fin) { // arreglo inicial: [10, 4, 24, 3, 8, 12]

                //complejidad temp // conteo

        if (inicio < fin) { // 1 // verifica que el subarreglo tenga mas de un elemento

            int medio = (inicio + fin) / 2; // 1 // calcula el punto medio para dividir el arreglo

            // Sub arreglo Izquierdo
            mergeSort(arr, inicio, medio);        // 1 // ordena recursivamente la mitad izquierda
            // Sub arreglo Derecho
            mergeSort(arr, medio + 1, fin);       // 1 // ordena recursivamente la mitad derecha

            merge(arr, inicio, medio, fin);       // 1 // mezcla ambas mitades ya ordenadas
        }
        // Complejidad temporal: O(n log n) en todos los casos
        // Arreglo inicial:         [10,  4, 24,  3,  8, 12]
        // Despues division izq:    [4,  10, 24,  3,  8, 12]
        // Despues division der:    [4,  10, 24,  3,  8, 12]
        // Despues merge final:     [3,   4,  8, 10, 12, 24]
        // Arreglo final:           [3,   4,  8, 10, 12, 24]
    }

    public static void merge(int[] arr, int inicio, int medio, int fin) { // 1 // mezcla dos subarreglos ordenados en uno solo

        int n1 = medio - inicio + 1; // 1 // calcula el tamaño del subarreglo izquierdo
        int n2 = fin - medio;        // 1 // calcula el tamaño del subarreglo derecho

        int[] izq = new int[n1]; // 1 // crea arreglo temporal para la mitad izquierda
        int[] der = new int[n2]; // 1 // crea arreglo temporal para la mitad derecha

        for (int i = 0; i < n1; i++) { // 1 + n + n-1 // copia elementos al subarreglo izquierdo
            izq[i] = arr[inicio + i];  // 1
        }
        for (int j = 0; j < n2; j++) { // 1 + n + n-1 // copia elementos al subarreglo derecho
            der[j] = arr[medio + 1 + j]; // 1
        }

        int i = 0; // 1 // indice para recorrer subarreglo izquierdo
        int j = 0; // 1 // indice para recorrer subarreglo derecho
        int k = inicio; // 1 // indice para colocar elementos en el arreglo original

        while (i < n1 && j < n2) { // n + n-1 // compara elementos de ambos subarreglos
            if (izq[i] <= der[j]) { // 1 // si elemento izquierdo es menor o igual
                arr[k] = izq[i];    // 1 // coloca elemento izquierdo en posicion correcta
                i++;                // 1 // avanza indice izquierdo
            } else {
                arr[k] = der[j];    // 1 // coloca elemento derecho en posicion correcta
                j++;                // 1 // avanza indice derecho
            }
            k++;                    // 1 // avanza indice del arreglo original
        }

        while (i < n1) {         // copia elementos restantes del subarreglo izquierdo si los hay
            arr[k] = izq[i];     // 1
            i++;                 // 1
            k++;                 // 1
        }

        while (j < n2) {         // copia elementos restantes del subarreglo derecho si los hay
            arr[k] = der[j];     // 1
            j++;                 // 1
            k++;                 // 1
        }
        // 1 + (2n) + (n-1) * [4]
    }

    // Método que ejecuta todas las operaciones del BST
    public static void ejecutarBST() {
        Bst arbolBinario = new Bst();

        // a) Insertar valores uno por uno
        int[] valores = {50, 30, 70, 20, 40, 60, 80};
        for (int v : valores) {
            arbolBinario.insertar(v);
        }

        // b) Recorrido inorden antes de eliminar
        System.out.println("Recorrido inorden antes de eliminar:");
        arbolBinario.inorden();

        // c) Eliminar el nodo 50
        // Se usa el SUCESOR INORDEN: como el nodo 50 tiene dos hijos,
        // se busca el valor mínimo del subárbol derecho (que es 60),
        // se copia ese valor al nodo eliminado y se borra el 60 del subárbol derecho.
        System.out.println("Eliminando nodo 50...");
        arbolBinario.eliminar(50);

        // d) Recorrido inorden después de eliminar
        System.out.println("Recorrido inorden despues de eliminar:");
        arbolBinario.inorden();

        // e) Búsquedas
        System.out.println("Busqueda de valores:");
        int[] busquedas = {30, 50, 60};
        for (int b : busquedas) {
            System.out.println("Valor " + b + ": " + (arbolBinario.buscar(b) ? "Encontrado" : "No encontrado"));
        }
    }

}

// Clase que representa cada nodo del árbol, guarda el valor y referencias a sus hijos
class Nodo {
    int valor; // El dato que guarda el nodo
    Nodo izq;  // Referencia al hijo izquierdo
    Nodo der;  // Referencia al hijo derecho

    // Constructor que inicializa el nodo con un valor y sin hijos
    public Nodo(int valor) {
        this.valor = valor;
        this.izq = null;
        this.der = null;
    }
}

// Clase que implementa el Árbol de Búsqueda Binaria
class Bst {

    Nodo raiz; // Raíz del árbol, punto de entrada para todas las operaciones

    // Método público para insertar un valor en el árbol
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    // Recorre el árbol recursivamente hasta encontrar el lugar correcto para insertar
    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor); // Caso base: inserta aquí el nodo
        }
        if (valor < actual.valor) {
            actual.izq = insertarRecursivo(actual.izq, valor); // Ir a la izquierda
        } else if (valor > actual.valor) {
            actual.der = insertarRecursivo(actual.der, valor); // Ir a la derecha
        }
        return actual; // Devuelve la raíz del subárbol
    }

    // Método público para buscar un valor, devuelve true si existe
    public boolean buscar(int clave) {
        return buscarRecursivo(raiz, clave);
    }

    // Recorre el árbol comparando el valor buscado con cada nodo
    private boolean buscarRecursivo(Nodo actual, int clave) {
        if (actual == null) return false; // No encontrado
        if (clave == actual.valor) return true; // Encontrado
        if (clave < actual.valor) {
            return buscarRecursivo(actual.izq, clave); // Buscar a la izquierda
        } else {
            return buscarRecursivo(actual.der, clave); // Buscar a la derecha
        }
    }

    // Método público para eliminar un nodo con el valor indicado
    public void eliminar(int valor) {
        raiz = eliminarRecursivo(raiz, valor);
    }

    // Elimina un nodo manejando 3 casos: sin hijos, un hijo o dos hijos
    private Nodo eliminarRecursivo(Nodo actual, int valor) {
        if (actual == null) return null;
        if (valor < actual.valor) {
            actual.izq = eliminarRecursivo(actual.izq, valor);
        } else if (valor > actual.valor) {
            actual.der = eliminarRecursivo(actual.der, valor);
        } else {
            // Caso 1: Sin hijos
            if (actual.izq == null && actual.der == null) {
                return null;
            }
            // Caso 2: Un hijo
            if (actual.izq == null) return actual.der;
            if (actual.der == null) return actual.izq;
            // Caso 3: Dos hijos, se reemplaza con el sucesor inorden (mínimo del subárbol derecho)
            actual.valor = encontrarMinimo(actual.der); // Reemplaza valor
            actual.der = eliminarRecursivo(actual.der, actual.valor); // Elimina el sucesor
        }
        return actual;
    }

    // Función auxiliar para encontrar el mínimo de un subárbol
    private int encontrarMinimo(Nodo actual) {
        int min = actual.valor;
        while (actual.izq != null) {
            min = actual.izq.valor;
            actual = actual.izq;
        }
        return min;
    }

    // Método público que inicia el recorrido inorden (imprime valores de menor a mayor)
    public void inorden() {
        inordenRecursivo(raiz);
        System.out.println();
    }

    // Método auxiliar recursivo del recorrido inorden
    private void inordenRecursivo(Nodo actual) {
        if (actual == null) return;
        inordenRecursivo(actual.izq);
        System.out.print(actual.valor + " ");
        inordenRecursivo(actual.der);
    }
}