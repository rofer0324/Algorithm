public class Metodo_Busqueda_Lineal {
    public static void main(String[] args) {

        int i, aux = 0, clave = 5;
        int arreglo[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }; //No es necesario un arreglo ordenado.

        for (i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == clave) {
                aux = arreglo[i];
            }
        }

        System.out.print("Clave: " + aux);

    }
}
