/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author Administrator
 */
public class Assignments extends Applet {    
    
    @Override
    public  void paint(Graphics g){
        int w=getWidth()-20;
        int h=getHeight()-20;
        int x=20;
        int y=10;
           g.drawRect(x-10, y, w, h);           
           g.drawRect((x+w)/2, y, w/2, h/2);
           g.setColor(Color.blue);
           g.fillRect((x+w)/2, y, w/2, h/2);
           g.setColor(Color.black);
           g.drawLine(3*(x+w)/4, (h+x)/2, 3*(x+w)/4, h+y);
           g.setColor(Color.red);
           g.setFont(new Font("TimeRoman",Font.PLAIN, 20) );
           g.drawString("Graphice", x, h);
        }
   
    
}
