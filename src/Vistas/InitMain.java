/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author crist
 */
public class InitMain {
    
    public void mostrar(JPanel panMain, JPanel content) {

        content.setSize(810, 590);
        content.setLocation(10, 0);

        panMain.removeAll();
        panMain.add( content, BorderLayout.CENTER);
        panMain.revalidate();
        panMain.repaint();
    }
}
