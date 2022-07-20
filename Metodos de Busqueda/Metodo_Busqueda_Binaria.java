public class Metodo_Busqueda_Binaria {
    public static void main(String[] args) {

        int arreglo[] = {1,2,3,4,5,6,7,8,9,10}; //Necesariamente el Arreglo debe estar ordenado.

        int inicio = 0, fin = arreglo.length - 1;
        int clave = 5;
        int posicion = 0, resultado = 0;

        while(inicio <= fin){
            posicion = (inicio + fin) / 2;
            if(arreglo[posicion] == clave){
                resultado = posicion;
                break;
            } else if(arreglo[posicion] < clave){
                inicio = posicion + 1;
            } else {
                fin = posicion - 1;
            }
        }

        System.out.println("El numero buscado es: " + clave);
        System.out.println("Esta en la posicion [" + resultado + "]");
    }
}

