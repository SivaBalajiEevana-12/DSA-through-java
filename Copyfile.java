import java.io.*;
import java.util.Scanner;
public class Copyfile {
    public static void main(String[] args) throws IOException,FileNotFoundException{
        Scanner sc= new Scanner(System.in);
        String file=sc.next();
        String file2=sc.next();
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(file2);
        int data;
        while((data=fis.read())!=-1){
            System.out.println("uploading......");
            fos.write(data);
        }
        System.out.println("success......");
        fis.close();
        fos.close();
        sc.close();
    }
}
