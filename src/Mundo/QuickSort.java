package mundo;

import java.util.ArrayList;

public class QuickSort {
    private ArrayList<Integer> datos = new ArrayList<>();

    public void insertar(int valor) {
        datos.add(valor);
    }

    public boolean buscar(int valor) {
        return datos.contains(valor);
    }

    public boolean eliminar(int valor) {
        return datos.remove((Integer) valor);
    }

    public void ordenar() {
        quickSort(0, datos.size() - 1);
    }

    private void quickSort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }

    private int partition(int low, int high) {
        int pivot = datos.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (datos.get(j) <= pivot) {
                i++;
                int temp = datos.get(i);
                datos.set(i, datos.get(j));
                datos.set(j, temp);
            }
        }
        int temp = datos.get(i + 1);
        datos.set(i + 1, datos.get(high));
        datos.set(high, temp);
        return i + 1;
    }

    public void mostrar() {
        System.out.println("Datos: " + datos);
    }
}
