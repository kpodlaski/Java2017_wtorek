package pl.uni.lodz.wfis.java2017w.zajecia8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Krzysztof Podlaski on 30.05.2017.
 */
public class Arcanoid extends JPanel {
    double ballX=200, ballY =100;
    double radius = 30;
    double vx=1, vy=1;
    double paletteX =200, paletteY=320;
    Image ball;

    public Arcanoid(){
        startAnimation();
        ball =  Toolkit.getDefaultToolkit().createImage(
                ".\\ball.gif");
    }
    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        g.setColor(new Color(0xffffff));
        g.fillRect(0,0,500,500);
        g.setColor(new Color(0xff0000));
        //g.fillArc((int) ballX, (int) ballY,
        //        (int) radius, (int) radius,
        //        0,360);
        g.drawImage(ball,(int)ballX,(int)ballY,
                (int) radius, (int) radius,null);
        g.setColor(new Color(0x424242));
        g.fillRoundRect((int) paletteX, (int) paletteY,
                80, 20,12,12);
    }

    public void startAnimation(){
        Thread t = new Thread (new Animation());
        t.start();
    }
    class Animation implements  Runnable{
        void moveBall(){
            ballX+=vx;
            ballY +=vy;
            checkBordersforBall();
        }

        void checkBordersforBall(){
            if (ballX<0) {
                ballX=0;
                vx=-vx;
            }
            else if (ballX>getWidth()-radius) {
                ballX=getWidth()-radius;
                vx=-vx;
            }

            if (ballY <0) {
                ballY =0;
                vy=-vy;
            }
            else if (ballY >getHeight()-radius) {
                ballY =getHeight()-radius;
                vy=-vy;
            }
        }

        void checkColisionsBallPalette(){}
        @Override
        public void run() {
            while (true){
                moveBall();
                checkColisionsBallPalette();
                repaint();
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private KeyListener getKListener() {
        return new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch( e.getKeyCode()){
                    case KeyEvent.VK_LEFT : paletteX-=5;break;
                    case KeyEvent.VK_RIGHT : paletteX+=5;break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
    }

    public static void main(String[] args) {
        JFrame frame =  new JFrame("Arcanoid");
        Arcanoid game  = new Arcanoid();
        frame.setContentPane(game);
        frame.setSize(400,400);
        frame.setLocation(200,200);
        frame.addKeyListener(game.getKListener());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}
