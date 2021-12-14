package com.programacion;

import javax.swing.*;

public class Garaxe {

   private int numeroCoches;
    private int matricula;


    public void amosarPlazas () {

        numeroCoches = Integer.parseInt(JOptionPane.showInputDialog(" Introduce el número de coches que hay en el garaje"));
        if (numeroCoches < 5) {
            JOptionPane.showMessageDialog(null, "PLAZAS DISPONIBLES");
            matricula = Integer.parseInt(JOptionPane.showInputDialog(" Introduce la matrícula del coche"));
        } else if (numeroCoches >= 5) {
            JOptionPane.showMessageDialog(null, " COMPLETO ");
        }
    }


    public void amosarPrezo () {
        int horas;
        horas = Integer.parseInt(JOptionPane.showInputDialog(" Introduce o número de horas que está o coche no garaxe"));

        double prezo;

        if (horas < 3) {
            JOptionPane.showMessageDialog(null, " Usted tiene que pagar 1,5 euros");
        } else if (horas > 3) {
            JOptionPane.showMessageDialog(null, "Usted tiene que pagar 0,20 euros por hora " + "\n" + "PRECIO = " + (horas * 0.20));
        }


    }


}
