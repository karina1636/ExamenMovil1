package org.example;
import org.example.modelos.*;

public class Main {
    public static void main(String[] args) {

        Seguro seguro = new Seguro();
        seguro.setEdadAsegurado(29);
        System.out.println(seguro.calcularPrima());

    }
}