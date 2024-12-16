class sharedResource{
    public synchronized void print1(int n){
        for(int i=1;i<=10;i++){
            System.out.println(" "+n*i);
        }
    }
}
class Thread1  extends Thread{
    sharedResource m;
    Thread1(sharedResource m){
        this.m=m;
    }
    @Override
        public
        void run(){
            m.print1(3);
        }
}
class Thread2  extends Thread{
    sharedResource m;
    Thread2(sharedResource m){
        this.m=m;
    }
    @Override
        public
        void run(){
            m.print1(9);
        }
}
public class method {
    public static void main(String[] args) {
        sharedResource m =new sharedResource();
        Thread1 t1=new Thread1(m);
    
        Thread2 t2=new Thread2(m);
        t1.start();
        t2.start();
        
    }
}
