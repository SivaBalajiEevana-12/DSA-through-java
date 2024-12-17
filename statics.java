class main12
{
    // ;;;;;;;
    public void show(){
        System.out.println(Thread.currentThread().getName());
    synchronized(this){
        for(int i=0;i<5;i++){
            System.out.println("hello how are you");
        }
    }
}
}
class thread1 extends Thread{
    main12 m;
    thread1(main12 m){
        this.m=m;
    }
    public void run(){
        m.show();
    }
}
public class statics {
 public static void main(String[] args) {
    main12 s=new main12();
    thread1 t1=new thread1(s);
    thread1 t2=new thread1(s);
    t1.setName("siava");
    t2.setName("balaji");
    t1.start();
    t2.start();
   
    
 }   
}
