package internal;
import java.applet.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class BlinkingMessage extends Applet implements Runnable {
    private String message;
    private int x, y;
    private boolean blink;
    private Thread thread;

    @SuppressWarnings("deprecation")
	public void init() {
        message = getParameter("message");
        x = Integer.parseInt(getParameter("x"));
        y = Integer.parseInt(getParameter("y"));
        blink = true;
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        while (true) {
            blink = !blink;
            repaint();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(0, 0, 500, 600);
        g.setColor(Color.WHITE);
        g.drawRect(100, 300, 300, 100);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        if (blink) {
            g.drawString(message, x, y);
        }
    }
}