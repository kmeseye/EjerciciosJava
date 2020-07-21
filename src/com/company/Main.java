package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
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

       /* System.out.println("Introduce cinco numeros");
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
        for (int i = 4; i >= 0; i--) {
            System.out.println(Numeros[i] + ",");


        }

    }*/
/*

        int[] numeros = new int[20];
        int contador=0,suma=0,num;

        for (int i = 0; i < 20; i++) {

            if(suma>100){
                numeros[i]=0;
            }else {
                System.out.println("introduce un numero");
                num=leer.nextInt();
                leer.nextLine();
                suma+=num;
                numeros[i]=num;

            }
        }


        for (int i = 0; i <20; i++) {
            System.out.println(numeros[i]+",");
        }
        System.out.println("");

*/
/*
        int[] loteria = new int[6];
        int contador = 0;
        do {

            Random rd = new Random();
            Integer numero = rd.nextInt(50);


            if (!comprobarArray(numero, loteria)) {
                loteria[contador] = numero;
                contador++;
            }

        } while (contador < 6);
        for (int i = 0; i < loteria.length; i++) {
            System.out.println(loteria[i] + ",");
        }
        System.out.println("");
    }

    private static boolean comprobarArray(Integer numero, int[] loteria) {
        for (int i = 0; i < loteria.length; i++) {
            if (loteria[i]==numero) return true;

        }

        return false;
        */

        String[][] temperaturas = new String[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.println("Nombre de Ciudad");
            String ciudad = leer.nextLine();
            System.out.println("Temperatura");
            String temperatura = leer.nextLine();
            temperaturas[1][0] = ciudad;
            temperaturas[i][1] = temperatura;

        }
        double media = 0.0;
        for (int i = 0; i < temperaturas.length; i++) {
            media += convertirEntero(temperaturas[i][1]);

        }
        media = media / 10;

        for (int i = 0; i <temperaturas.length ; i++) {
            if(convertirEntero(temperaturas[i][1])<media){
                System.out.println("Ciudad: "+temperaturas[i][0]+", temperatura: "+temperaturas[i][1]);
            }

        }
    }



    public static int convertirEntero(String valor) {
        return Integer.parseInt(valor);
    }
}
