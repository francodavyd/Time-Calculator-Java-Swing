/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.francodavyd;

import com.francodavyd.vista.MenuPrincipal;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Ema
 */
public class Calcular_fechas {

    public static void main(String[] args) {
        MenuPrincipal menu = new MenuPrincipal();
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setTitle("Time Calculator");
        menu.setVisible(true);
        

    }
}
