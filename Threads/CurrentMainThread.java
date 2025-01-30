import java.lang.Thread.*;
class CurrentMainThread {
    public static void main(String[] args) {
        try{
            Thread t = Thread.currentThread();
            System.out.println(t.getName());
            t.setName("AgusThread");
            System.out.println(t.getName());
            System.out.println(t.getPriority());
            t.setPriority(7);
            //sleeping the threads
            for(int i=0;i<5;i++)
            {
                System.out.println(i);
                t.sleep(1000);
            }
            System.out.println(t.isAlive());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}