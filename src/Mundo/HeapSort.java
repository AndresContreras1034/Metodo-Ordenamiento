package mundo;

import java.util.ArrayList;

public class HeapSort {
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
        int n = datos.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = datos.get(0);
            datos.set(0, datos.get(i));
            datos.set(i, temp);
            heapify(i, 0);
        }
    }

    private void heapify(int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && datos.get(left) > datos.get(largest)) {
            largest = left;
        }

        if (right < n && datos.get(right) > datos.get(largest)) {
            largest = right;
        }

        if (largest != i) {
            int swap = datos.get(i);
            datos.set(i, datos.get(largest));
            datos.set(largest, swap);
            heapify(n, largest);
        }
    }

    public void mostrar() {
        System.out.println("Datos: " + datos);
    }
}
