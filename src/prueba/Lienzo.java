/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author daniel
 */
public class Lienzo extends JPanel implements MouseListener {
    private long inicio, fin;

    public Lienzo() {
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2 && fin - inicio <= 60)
            System.out.println("2 click");
        else if (e.getClickCount() == 1 && inicio - fin > 60)
            System.out.println("1 click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        fin = System.currentTimeMillis();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        inicio = System.currentTimeMillis();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
