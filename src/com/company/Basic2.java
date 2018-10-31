package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Basic2 {
    public static void main(String[] args) {
        //Hacer una calculadora (Pedir primer numero + Pedir Segundo numero + Pedir operacion)
        System.out.println("Introduce el Primer Valor:");
        Scanner valor1 = new Scanner(System.in);
        int val1 = valor1.nextInt();

        System.out.println("Introduce el Segundo Valor:");
        Scanner valor2 = new Scanner(System.in);
        int val2 = valor2.nextInt();

        System.out.println("Introduce Operación [Sumar = 1 | Multiplicar = 2 | Division = 3 | Resta 4]");
        Scanner op = new Scanner(System.in);
        int op1 = op.nextInt();


        if (op1 == 1){
            int valsum;
            valsum=val1+val2;
            System.out.println("El Resultado es: " + valsum);
        }else if (op1 == 2){
            int valmul;
            valmul=val1*val2;
            System.out.println("El Resultado es: " + valmul);
        }else if (op1 == 3){
            int valdiv;
            valdiv=val1/val2;
            System.out.println("El Resultado es: " + valdiv);
        }else if (op1 == 4){
            int valres;
            valres=val1-val2;
            System.out.println("El Resultado es: " + valres);

        }





    }
}
