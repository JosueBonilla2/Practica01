/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Papubonilla
 */
public class frame1 extends javax.swing.JFrame implements ActionListener{
    
    JLabel nombre;
    JButton hola;
    JButton adios;
    JTextField dato;
    
    
    public frame1() {
        setTitle("My first frame");
        setSize(500, 300);
        setLayout(null);
        
        nombre = new JLabel("NOMBRE: ");
        nombre.setBounds(140, 50, 100, 50);
        add(nombre);
        
        hola = new JButton("HOLA");
        hola.setBounds(80, 150, 100, 50);
        hola.addActionListener(this);
        add(hola);
        
        adios = new JButton("ADIOS");
        adios.setBounds(280, 150, 100, 50);
        adios.addActionListener(this);
        add(adios);
        
        dato = new JTextField();
        dato.setBounds(200, 67, 150, 20);
        dato.addActionListener(this);
        add(dato);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == hola){
            String text = dato.getText();
            System.out.println("HOLA " + text + ":)");
        } else {
            String text = dato.getText();
            System.out.println("ADIOS " + text + ":)");
        } 
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
