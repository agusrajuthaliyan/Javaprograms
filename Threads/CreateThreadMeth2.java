import java.lang.Thread;
//using Implements Runnable
class ThreadDemo implements Runnable {
    private String sth;
    public ThreadDemo(String thn) {
        sth = thn;
    }

    public void run() {
        try {
            System.out.println(sth + " is Running!");
            for (int i = 0; i < 5; i++) {
                System.out.println(sth + " Thread " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class CreateThreadMeth2 {
    public static void main(String[] args) {
        try {
            ThreadDemo demo1 = new ThreadDemo("A");
            Thread th1 = new Thread(demo1, "A"); // Pass Runnable and name
            th1.start();

            ThreadDemo demo2 = new ThreadDemo("B");
            Thread th2 = new Thread(demo2, "B"); // Pass Runnable and name
            th2.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
