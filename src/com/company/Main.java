package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       /* int[] numeros = new int[10];
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

        }*/

        System.out.println("Introduce cinco numeros");
        int[] Numeros = new int[5];
        int cont = 0, num;


        do {
            do {
                System.out.println("Introduce un Numero");
                num = leer.nextInt();
                leer.nextLine();

            } while (num < 0);
            System.out.println("Introduce un Numero");
            num = leer.nextInt();
            leer.nextLine();
            if (num > 0) {
                Numeros[cont] = num;
                cont++;
            }


        } while (cont < 5);
        for (int i = 4; i <= 0; i++) {
            System.out.println(Numeros[i] + ",");


        }

    }


}
