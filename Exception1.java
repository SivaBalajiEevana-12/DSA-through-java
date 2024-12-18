import java.util.Scanner;
import java.lang.*;
public class Exception1 {
    public static void most() throws ArithmeticException{
        throw new ArithmeticException("welcome to exception Handling"); 
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int d=0; 
       
        while(true){
            System.out.println("enter a & b values");
            int a=sc.nextInt();
            int b=sc.nextInt();
            try{
                int c=a/b;
                System.out.println("result is : "+c);
                d++;
                if((d==5)){
                    most();
                }
            }
            catch(ArithmeticException e){
                System.out.println("yooooooooooooo..........................................");
                System.exit(0);
            }
        }
    }
}
