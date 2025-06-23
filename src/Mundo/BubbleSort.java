
package Mundo;

import java.util.ArrayList;

public class BubbleSort {
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
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (datos.get(j) > datos.get(j + 1)) {
                    int temp = datos.get(j);
                    datos.set(j, datos.get(j + 1));
                    datos.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public void mostrar() {
        System.out.println("Datos: " + datos);
    }
}