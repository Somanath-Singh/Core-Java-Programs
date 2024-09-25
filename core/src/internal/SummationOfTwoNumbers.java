package internal;
import javax.swing.JOptionPane;

public class SummationOfTwoNumbers {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Enter the first number:");
        String input2 = JOptionPane.showInputDialog("Enter the second number:");

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        SumThread thread1 = new SumThread(num1, num2);
        SumThread thread2 = new SumThread(num1, num2);
        SumThread thread3 = new SumThread(num1, num2);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int sum = thread1.getSum() + thread2.getSum() + thread3.getSum();
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}

class SumThread extends Thread {
    private int num1;
    private int num2;
    private int sum;

    public SumThread(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run() {
        synchronized (this) {
            sum = num1 + num2;
        }
    }

    public int getSum() {
        return sum;
    }
}