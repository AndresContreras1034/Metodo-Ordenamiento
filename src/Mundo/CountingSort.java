package mundo;

import java.util.ArrayList;

public class CountingSort {
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
        if (datos.size() == 0) {
            return;
        }
        int max = getMax();
        int min = getMin();
        int range = max - min + 1;

        int[] count = new int[range];
        for (int i = 0; i < datos.size(); i++) {
            count[datos.get(i) - min]++;
        }

        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i]-- > 0) {
                datos.set(index++, i + min);
            }
        }
    }

    private int getMax() {
        int max = datos.get(0);
        for (int i = 1; i < datos.size(); i++) {
            if (datos.get(i) > max) {
                max = datos.get(i);
            }
        }
        return max;
    }

    private int getMin() {
        int min = datos.get(0);
        for (int i = 1; i < datos.size(); i++) {
            if (datos.get(i) < min) {
                min = datos.get(i);
            }
        }
        return min;
    }

    public void mostrar() {
        System.out.println("Datos: " + datos);
    }
}
