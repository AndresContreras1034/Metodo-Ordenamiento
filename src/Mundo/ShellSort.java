package mundo;

import java.util.ArrayList;

public class ShellSort {
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
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = datos.get(i);
                int j;
                for (j = i; j >= gap && datos.get(j - gap) > temp; j -= gap) {
                    datos.set(j, datos.get(j - gap));
                }
                datos.set(j, temp);
            }
        }
    }

    public void mostrar() {
        System.out.println("Datos: " + datos);
    }
}
