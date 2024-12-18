class Threads1 implements Runnable {
    public void run(){
        System.out.println("THREAD IS RUNNING...........");
    }
}
public class Threads extends Thread {
    public  void run(){
        for(int i=1;i<=5;i++){
        System.out.println("THREAD IS RUNNING..........."+Thread.currentThread().getName());
        try{
        sleep(500);
        }
        catch(InterruptedException r){
            r.printStackTrace();
        }
    }
}
    public static void main(String args[]){
        Threads t=new Threads();
        t.setName("iam 1");
        t.start();
        Threads t1=new Threads();
        t1.setName("iam 2");
        t1.start();
        Threads t2=new Threads();
      t2.setName("iam 1");
      t2.start();
        Threads1 t3=new Threads1();
        Thread t4= new Thread(t3);
        t4.start();
    }
}
