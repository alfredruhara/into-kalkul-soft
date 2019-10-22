/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import computersciencetools.MainActivity;

/**
 *
 * @author Alfred ChadA
 */
public class UserInterface {
    
    private int xPosition;
    private int yPosition; 
    
    public void decorationBarAxis(java.awt.event.MouseEvent evt, MainActivity classActivity){
        
        int xAxis = evt.getXOnScreen();
        int yAxis = evt.getYOnScreen();

        classActivity.setLocation( xAxis-xPosition, yAxis-yPosition);     
    }
    
    public void decorationBarCoordinates(java.awt.event.MouseEvent evt){
          xPosition = evt.getX();
          yPosition = evt.getY();
    }
    
    
    public void load_pane(javax.swing.JPanel conatiner_pane , javax.swing.JPanel load_pane){
            
         try {
           conatiner_pane.removeAll();
           conatiner_pane.repaint();
           conatiner_pane.revalidate();

           conatiner_pane.add(load_pane);
           conatiner_pane.repaint();
           conatiner_pane.revalidate();
           
         }catch(Exception e){  System.out.println("Chada bug report : " + e); }
    }
    
    public void setBackgroundPane(javax.swing.JPanel pane,int r, int g, int b){
       pane.setBackground(new java.awt.Color(r,g,b));
    }
    
    public void setBackgroundLabel(javax.swing.JLabel label,int r, int g, int b){
       label.setBackground(new java.awt.Color(r,g,b));
    }
      
    public void onHover(javax.swing.JLabel label){
        setBackgroundLabel(label, 248,249,250);
    } 
    
    public void unHover(javax.swing.JLabel label){
        setBackgroundLabel(label, 255,255,255);
    }
    
    public void labelText(javax.swing.JLabel label, String value){
        label.setText(value);
    }
    
}
