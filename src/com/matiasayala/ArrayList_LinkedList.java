package com.matiasayala;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_LinkedList {


    public void arrayList(){
        ArrayList<String> listaDeElementos = new ArrayList<String>();
        listaDeElementos.add("elemento1");
        listaDeElementos.add("elemento2");
        listaDeElementos.add("elemento3");
        listaDeElementos.add("elemento4");

        for (String i : listaDeElementos){
            System.out.println("valor de arrayList: "+i);
        }


        LinkedList<String> copiaElementos = new LinkedList<String>(listaDeElementos);

        for (String i : copiaElementos){
            System.out.println("valor de linkedList: "+i);
        }
    }
}
