/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.guiasejercicios.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Cesia Coto
 */
public class ejercicio01 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int num1, num2;
        System.out.print("Digite el primer numero: ");
        num1 = reader.nextInt();
        System.out.print("Digite el segundo numero: ");
        num2 = reader.nextInt();
        System.out.println(num1 + "/" + num2);
        if(num1%num2==0)
        {
            System.out.println("El número " + num1 + " es divisible entre el numero " + num2);
        }
        else
        {
            System.out.println("Los numeros no son divisibles");
        }
    } 
}
