package mundo;

import java.util.ArrayList;

public class MergeSort {
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
        if (datos.size() < 2) {
            return;
        }
        mergeSort(0, datos.size() - 1);
    }

    private void mergeSort(int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(left, mid);
            mergeSort(mid + 1, right);

            merge(left, mid, right);
        }
    }

    private void merge(int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        ArrayList<Integer> leftArray = new ArrayList<>();
        ArrayList<Integer> rightArray = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            leftArray.add(datos.get(left + i));
        }
        for (int i = 0; i < n2; i++) {
            rightArray.add(datos.get(mid + 1 + i));
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray.get(i) <= rightArray.get(j)) {
                datos.set(k, leftArray.get(i));
                i++;
            } else {
                datos.set(k, rightArray.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            datos.set(k, leftArray.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            datos.set(k, rightArray.get(j));
            j++;
            k++;
        }
    }

    public void mostrar() {
        System.out.println("Datos: " + datos);
    }
}
