/* Escriba un programa que normalice los 20 numeros enteros que debe leerse y luego
almacenarse en un arreglo denominado estadistica. Para llevar a cabo la normalizacion
se debe en primer lugar, buscar el numero mayor y luego dividir cada numero del arreglo
por dicho valor mayor, de forma que los valores resultantes esten comprendidos en el
intervalo del 0 al 1.
 Imprima el arreglo original y luego cuando es normalizado. */

#include<stdio.h>
#include<gotoxy.h>
#define NUM 20

void normalizar(int estadistica[]){
    int i, j, h, val, aux = 0;

    for(i = 0; i < NUM; i++) {
        for(j = 0; j < NUM - 1; j++) {
            if(estadistica[j] > estadistica[j + 1]) {
                aux = estadistica[j];
                estadistica[j] = estadistica[j + 1];
                estadistica[j + 1] = aux;
            }
        }
    }
    for(h = 0; h < NUM; h++){
        val = estadistica[h]/estadistica[19];
        estadistica[h] = val;
    }
}

int main(){

    system("color F0");

    int num, i, z = 0, x, clean, estadistica[NUM];
    char val[15];

    for(i = 0; i < NUM; i++) {
        z = 0;

        gotoxy(2,2); printf("                                                    ");
        gotoxy(2,2); printf("Introduzca un numero entero para la posicion %i => ", i + 1);
        gets(val);

        while (z < strlen(val) || val[0] == '\0'){
            while (z < strlen(val)){
                if (val[z] < 48 || val[z] > 57){
                    for (x = 0; x < strlen(val); x++){
                        val[x] = '\0';
                    }
                    printf ("Debe ser un numero entero y positivo. Ingrese nuevamente: ");
                    fflush(stdin);
                    gets(val);
                    z = -1;
                }
                z++;
            }
            while (val[0] == '\0'){                                                              //VALIDACION DE ENTER VACIO
                printf ("!ERROR, No ingreso nada. Ingrese un entero nuevamente: ");
                fflush(stdin);
                gets(val);
            }

            system("cls");
        }
        num = atoi(val);
        estadistica[i] = num;
    }

    for(i = 0; i < NUM; i++) {
        gotoxy(2,3 + i); printf("El Arreglo ORIGINAL es: %i ", estadistica[i]);
    }
    normalizar(estadistica);
    for(i = 0; i < NUM; i++) {
        gotoxy(33,3 + i); printf("El Arreglo Normalizado es: %i \n", estadistica[i]);
    }

    return 0;
}
