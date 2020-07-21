package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("introduce 10 numeros");
        for (int i = 0; i < 10; i++) {
            numeros[1] = leer.nextInt();
            leer.nextLine();

        }
        System.out.println("Introduce el numero a buscar");
        int numero = leer.nextInt();
        leer.nextLine();
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > numero) {
                contador++;

            }

        }
    }


}
