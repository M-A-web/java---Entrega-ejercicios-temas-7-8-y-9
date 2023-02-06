package com.matiasayala;

public class ArrayBidimencional {

    public void recorrerArrayBi(){

        int arrayBidi[][] = new int [3][5];

        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;
        arrayBidi[0][4] = 5;

        arrayBidi[1][0] = 10;
        arrayBidi[1][1] = 20;
        arrayBidi[1][2] = 30;
        arrayBidi[1][3] = 40;
        arrayBidi[1][4] = 50;

        arrayBidi[2][0] = 100;
        arrayBidi[2][1] = 200;
        arrayBidi[2][2] = 300;
        arrayBidi[2][3] = 400;
        arrayBidi[2][4] = 500;

        for(int i = 0; i < arrayBidi.length;i++){
            System.out.println("Fila: " + i);

            for (int j = 0; j < arrayBidi[i].length; j++){
                System.out.println("fila: "+i + " valor: "+j);


            }
        }
    }
}
