package mundo;

import java.util.ArrayList;

public class RadixSort {
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
        if (datos.isEmpty()) {
            return;
        }

        int max = getMax();

        // Recorre cada dígito (unidades, decenas, centenas...)
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(exp);
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

    private void countSort(int exp) {
        int n = datos.size();
        int[] output = new int[n];  // Arreglo temporal ordenado por dígito actual
        int[] count = new int[10];  // Solo dígitos del 0 al 9

        // Contar ocurrencias por dígito
        for (int i = 0; i < n; i++) {
            int index = (datos.get(i) / exp) % 10;
            count[index]++;
        }

        // Convertir count[] a posiciones acumuladas
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Construir el arreglo de salida (de derecha a izquierda para mantener estabilidad)
        for (int i = n - 1; i >= 0; i--) {
            int index = (datos.get(i) / exp) % 10;
            output[count[index] - 1] = datos.get(i);
            count[index]--;
        }

        // Copiar el arreglo ordenado de vuelta a datos
        for (int i = 0; i < n; i++) {
            datos.set(i, output[i]);
        }
    }

    public void mostrar() {
        System.out.println("Datos: " + datos);
    }
}
