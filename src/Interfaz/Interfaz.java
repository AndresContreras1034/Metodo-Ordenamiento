package interfaz;

import Mundo.BubbleSort;
import mundo.InsertionSort;
import mundo.SelectionSort;
import mundo.MergeSort;
import mundo.QuickSort;
import mundo.ShellSort;
import mundo.HeapSort;
import mundo.RadixSort;
import mundo.CountingSort;
import mundo.BucketSort;
import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BubbleSort bubble = new BubbleSort();
        InsertionSort insertion = new InsertionSort();
        SelectionSort selection = new SelectionSort();
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();
        ShellSort shell = new ShellSort();
        HeapSort heap = new HeapSort();
        RadixSort radix = new RadixSort();
        CountingSort counting = new CountingSort();
        BucketSort bucket = new BucketSort();

        // Insertar 20 números aleatorios por defecto
        int[] numeros = {88, 39, 15, 11, 60, 54, 75, 55, 30, 27, 45, 61, 46, 92, 90, 1, 13, 13, 16, 24};
        for (int num : numeros) {
            bubble.insertar(num);
            insertion.insertar(num);
            selection.insertar(num);
            merge.insertar(num);
            quick.insertar(num);
            shell.insertar(num);
            heap.insertar(num);
            radix.insertar(num);
            counting.insertar(num);
            bucket.insertar(num);
        }

        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Insertar");
            System.out.println("2. Buscar");
            System.out.println("3. Eliminar");
            System.out.println("4. Ordenar");
            System.out.println("5. Mostrar");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese valor a insertar: ");
                    int valor = scanner.nextInt();
                    bubble.insertar(valor);
                    insertion.insertar(valor);
                    selection.insertar(valor);
                    merge.insertar(valor);
                    quick.insertar(valor);
                    shell.insertar(valor);
                    heap.insertar(valor);
                    radix.insertar(valor);
                    counting.insertar(valor);
                    bucket.insertar(valor);
                    break;
                case 2:
                    System.out.print("Ingrese valor a buscar: ");
                    int buscar = scanner.nextInt();
                    System.out.println("BubbleSort: " + (bubble.buscar(buscar) ? "Encontrado" : "No encontrado"));
                    System.out.println("InsertionSort: " + (insertion.buscar(buscar) ? "Encontrado" : "No encontrado"));
                    System.out.println("SelectionSort: " + (selection.buscar(buscar) ? "Encontrado" : "No encontrado"));
                    System.out.println("MergeSort: " + (merge.buscar(buscar) ? "Encontrado" : "No encontrado"));
                    System.out.println("QuickSort: " + (quick.buscar(buscar) ? "Encontrado" : "No encontrado"));
                    System.out.println("ShellSort: " + (shell.buscar(buscar) ? "Encontrado" : "No encontrado"));
                    System.out.println("HeapSort: " + (heap.buscar(buscar) ? "Encontrado" : "No encontrado"));
                    System.out.println("RadixSort: " + (radix.buscar(buscar) ? "Encontrado" : "No encontrado"));
                    System.out.println("CountingSort: " + (counting.buscar(buscar) ? "Encontrado" : "No encontrado"));
                    System.out.println("BucketSort: " + (bucket.buscar(buscar) ? "Encontrado" : "No encontrado"));
                    break;
                case 3:
                    System.out.print("Ingrese valor a eliminar: ");
                    int eliminar = scanner.nextInt();
                    System.out.println("BubbleSort: " + (bubble.eliminar(eliminar) ? "Eliminado" : "No encontrado"));
                    System.out.println("InsertionSort: " + (insertion.eliminar(eliminar) ? "Eliminado" : "No encontrado"));
                    System.out.println("SelectionSort: " + (selection.eliminar(eliminar) ? "Eliminado" : "No encontrado"));
                    System.out.println("MergeSort: " + (merge.eliminar(eliminar) ? "Eliminado" : "No encontrado"));
                    System.out.println("QuickSort: " + (quick.eliminar(eliminar) ? "Eliminado" : "No encontrado"));
                    System.out.println("ShellSort: " + (shell.eliminar(eliminar) ? "Eliminado" : "No encontrado"));
                    System.out.println("HeapSort: " + (heap.eliminar(eliminar) ? "Eliminado" : "No encontrado"));
                    System.out.println("RadixSort: " + (radix.eliminar(eliminar) ? "Eliminado" : "No encontrado"));
                    System.out.println("CountingSort: " + (counting.eliminar(eliminar) ? "Eliminado" : "No encontrado"));
                    System.out.println("BucketSort: " + (bucket.eliminar(eliminar) ? "Eliminado" : "No encontrado"));
                    break;
                case 4:
                    bubble.ordenar();
                    insertion.ordenar();
                    selection.ordenar();
                    merge.ordenar();
                    quick.ordenar();
                    shell.ordenar();
                    heap.ordenar();
                    radix.ordenar();
                    counting.ordenar();
                    bucket.ordenar();
                    System.out.println("Datos ordenados.");
                    break;
                case 5:
                    System.out.println("BubbleSort:");
                    bubble.mostrar();
                    System.out.println("InsertionSort:");
                    insertion.mostrar();
                    System.out.println("SelectionSort:");
                    selection.mostrar();
                    System.out.println("MergeSort:");
                    merge.mostrar();
                    System.out.println("QuickSort:");
                    quick.mostrar();
                    System.out.println("ShellSort:");
                    shell.mostrar();
                    System.out.println("HeapSort:");
                    heap.mostrar();
                    System.out.println("RadixSort:");
                    radix.mostrar();
                    System.out.println("CountingSort:");
                    counting.mostrar();
                    System.out.println("BucketSort:");
                    bucket.mostrar();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}