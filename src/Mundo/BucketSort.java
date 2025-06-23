package mundo;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
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
        int max = Collections.max(datos);
        int min = Collections.min(datos);
        int bucketCount = max / 10 - min / 10 + 1;
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>(bucketCount);

        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int num : datos) {
            int bucketIndex = (num - min) / 10;
            buckets.get(bucketIndex).add(num);
        }

        datos.clear();
        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
            datos.addAll(bucket);
        }
    }

    public void mostrar() {
        System.out.println("Datos: " + datos);
    }
}
