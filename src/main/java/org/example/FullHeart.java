package org.example;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class FullHeart extends JPanel {
    private static final long serialVersionUID = 1L;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        int size = 100;

        g.setColor(Color.RED);
        g.drawArc(x - (size / 4), y - (size / 2), size / 2, size / 2, -30, -120);
        g.drawArc(x - (size / 2), y - (size / 2), size / 2, size / 2, -150, -120);
        g.fillArc(x - (size / 4), y - (size / 2), size / 2, size / 2, -30, -120);
        g.fillArc(x - (size / 2), y - (size / 2), size / 2, size / 2, -150, -120);
        g.fillRect(x - (size / 4), y - (size / 4), size / 2, size / 2);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalp.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        FullHeart fullHeart = new FullHeart();
        frame.add(fullHeart);
        frame.setVisible(true);


    }
}


