package mundo;

import java.util.ArrayList;

public class SelectionSort {
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
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (datos.get(j) < datos.get(min_idx)) {
                    min_idx = j;
                }
            }
            int temp = datos.get(min_idx);
            datos.set(min_idx, datos.get(i));
            datos.set(i, temp);
        }
    }

    public void mostrar() {
        System.out.println("Datos: " + datos);
    }
}
