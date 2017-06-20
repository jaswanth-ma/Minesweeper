/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import javax.swing.JFrame;

/**
 *
 * @author Jaswanth
 */
public class Minesweeper {

    JFrame obj;
    
    public Minesweeper()
    {
        obj=new JFrame();
        obj.setTitle("Minesweeper");
        obj.setVisible(true);
        obj.setSize(450,400);
        
                
    }
    
    public static void main(String[] args) {
        Minesweeper fobj=new Minesweeper();
    }
    
}
