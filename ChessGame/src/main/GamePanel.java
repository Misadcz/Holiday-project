package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{
    final int tileSize = 16 * 3;
    final int maxScreenColRow = 16;
    final int screenWidth = tileSize * maxScreenColRow;
    final int screenHeight = tileSize * maxScreenColRow;

    Thread gameThread;
    public GamePanel()
    {
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setDoubleBuffered(true);
    }


    public void startGameThread()
    {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

    while(gameThread != null)
    {

        update();

        repaint();

    }
    }

    public void update()
    {

    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2  = (Graphics2D) g;

        for(int j = 0 ; j < 8 ; j++)
        for(int i = 0 ; i < 8 ; i++)
        {
                if (i % 2 == j%2)
                    g2.setColor(new Color(239, 202, 159));
                else
                    g2.setColor(new Color(183, 97, 50));
            g2.fillRect(i*96,j*96,96,96);
        }
    }



}
