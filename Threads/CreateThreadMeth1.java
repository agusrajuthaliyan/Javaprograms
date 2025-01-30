import java.lang.Thread;

class ThreadDemo extends Thread {
    private String sth;
    public ThreadDemo(String thn) {
        sth = thn;
    }

    public void run() {
        try {
            System.out.println(sth + " is Running!");
            for (int i = 0; i < 5; i++) {
                System.out.println(sth + " Thread " + i);
                sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class CreateThreadMeth1 {
    public static void main(String[] args) {
        try {
            ThreadDemo t1 = new ThreadDemo("A");
            t1.start();
            ThreadDemo t2 = new ThreadDemo("B");
            t2.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
