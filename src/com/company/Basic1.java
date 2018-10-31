package com.company;
import java.util.Scanner;

public class Basic1 {

    public static void main(String[] args) {

        //Leer año introducido
        System.out.println("Introduce un año (yyyy):");
        Scanner yyyy = new Scanner(System.in);

        //Variable año Year = YYYY
        int year=yyyy.nextInt();

        //Condicion Si año entre 4 = Resto 0 = Bisiesto ≠ No Bisiesto
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println("Es Multiplo");
                }else{
                    System.out.println("No es Multiplo");
                }
            }else{
                System.out.println("Es multiplo");
            }
        }else{
            System.out.println("No es Multiplo");
        }
    }
}

/*
if (year%4==0){
    if (year%100){
        if (year%400){
           SI
        }else{
           NO
        }
    }else{
        SI
    }
}else{
   NO
}
 */


