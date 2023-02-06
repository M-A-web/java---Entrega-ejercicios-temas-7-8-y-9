package com.matiasayala;

import jdk.internal.icu.text.UnicodeSet;

import java.util.Vector;

public class VectorNombres {

    public void nombres(){
        Vector<String> nombre = new Vector();
        nombre.add("Manolo");
        nombre.add("Raul");
        nombre.add("Maria");
        nombre.add("Pablo");
        nombre.add("Juana");

        System.out.println(nombre);

        nombre.remove(1);
        nombre.remove(1);
        System.out.println(nombre);
    }
}
