package com.matiasayala;


// 1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
public class ArrayUnidimencional {

    public void recorrerArray(){

        String array[] = {" Mi nombre es"," Matias"," Emanuel", " Ayala."};

        for (String i : array){
            System.out.print(i);
        }
    }
}
