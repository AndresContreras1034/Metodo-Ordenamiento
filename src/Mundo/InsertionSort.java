package mundo;

import java.util.ArrayList;

public class InsertionSort {
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
        for (int i = 1; i < datos.size(); i++) {
            int key = datos.get(i);
            int j = i - 1;
            while (j >= 0 && datos.get(j) > key) {
                datos.set(j + 1, datos.get(j));
                j--;
            }
            datos.set(j + 1, key);
        }
    }

    public void mostrar() {
        System.out.println("Datos: " + datos);
    }
}
