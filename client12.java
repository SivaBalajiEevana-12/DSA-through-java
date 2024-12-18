import java.net.*;
import java.io.*;
public class client12 {
    public static void main(String[] args) throws Exception {
        Socket s= new Socket("localhost",6000);
        DataInputStream dis =new DataInputStream(s.getInputStream());
        DataOutputStream dos =new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String stream="";
        String input ="";
        while(!stream.equals("stop")){
            input=br.readLine();
            dos.writeUTF(input);
            dos.flush();
            stream=dis.readUTF();
            System.out.println("Server:"+stream);    }
dis.close();
dos.close();
s.close();
    }
}
