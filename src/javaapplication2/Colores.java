/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.Color;
import java.util.Random;
import javax.swing.JTextArea;

/**
 *
 * @author Sala_01
 */
public class Colores extends Thread{   
        Color color;
        JTextArea area;
        String nombre;
        
        public Colores(JTextArea area, Color color, String nombre){            
            this.area = area;
            this.color = color;
            this.nombre = nombre;        
        }
        
        public void run(){
          for(int i=0;i<10;i++){
            area.setBackground(color);            
            long rango = (long) (Math.random() * 5001);
            System.err.println(nombre+" "+i);
          esperarXsegundos();
        }
        }
          private void esperarXsegundos() {
              Random x= new Random();
             int r=x.nextInt(5);
        try {
            Thread.sleep(r * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    }

