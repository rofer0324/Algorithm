public class Metodo_Ordenamiento_Burbuja {
    public static void main(String[] args) {

        int i, j, aux;
        int arreglo[] = { 10, 8, 9, 6, 5, 3, 4, 1, 2 };

        for (i = 1; i < arreglo.length; i++) {
            for (j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        for (i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}