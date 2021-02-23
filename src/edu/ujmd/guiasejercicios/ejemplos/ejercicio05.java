/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.guiasejercicios.ejemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author Cesia Coto
 */
public class ejercicio05 {
     public static void main(String[]args)
    {
        // TODO code application logic here
        double sueldo=0, mayor=0,menor=10000;
        int i=1, contador=0, empleados=0;
        while(i<=5)
        {
            sueldo= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Sueldo del Empleado " +i));
            while(sueldo<=0)
            {
                sueldo= Double.parseDouble(JOptionPane.showInputDialog("Error, el salario debe de ser mayor a 0\n"
                        + "Ingrese el Sueldo del Empleado " +i));
            }
            if(sueldo>300)
                contador= contador + 1;
            if(sueldo>mayor)
                mayor=sueldo;
            if(sueldo<menor)
                menor=sueldo;
            i=i+1;
        }
        empleados= i-1;
        JOptionPane.showMessageDialog(null, " El sueldo Mayor es de $: " + mayor + 
        "\n El sueldo Menor es de $: " + menor +
        "\n"+ contador + " Empleados tienen un sueldo mayor de $300");
        System.exit(0);
    }
}
