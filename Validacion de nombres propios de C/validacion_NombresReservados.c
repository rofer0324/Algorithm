#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{

    char cad[11], resp = 's';
    int i, val = 0;

    static char veca[32][15] = {{"char"},{"int"}, {"float"}, {"double"}, {"if"}, {"else"}, {"do"}
    , {"while"}, {"for"}, {"short"}, {"long"}, {"extern"}, {"static"}, {"default"}, {"continue"}
    , {"break"}, {"register"}, {"sizeof"}, {"typedef"}, {"case"}, {"return"}, {"printf"}, {"scanf"}
    , {"goto"},  {"enum"}, {"const"}, {"signed"}, {"struct"}, {"union"}, {"unsigned"}, {"void"}, {"volatile"}};

    static char vecb[32] = {0};

    while(resp == 's' || resp == 'S') {

        system("cls");

        system("color F0");

        fflush(stdin);
        printf("\n Introduzca el nombre de una variable: ");
        gets(cad);

        for(i = 0; i < 32; i++){
                if(strcmp(cad, veca[i]) != 0){
                    vecb[i] = 0; //False
                }else{
                    vecb[i] = 1; //True
                    }
        }

        for(i = 0; i < 32; i++){
            if (vecb[i] == 1){
                val = 1;
                printf("\n SU PALABRA ES RESERVADA DEL LENGUAJE");
            }
        }

        if(val == 0){
            printf("\n SU NO PALABRA ES RESERVADA DEL LENGUAJE");
        }

        fflush(stdin);
        printf("\n Desea ingresar otra palabra? (s/n): ");
        resp = getchar();
    }
    return 0;
}
