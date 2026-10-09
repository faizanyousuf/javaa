import java.io.*;
public class ByteStream {
    public static void main(String[] args) throws Exception {

//        int data = System.in.read();
//
//        System.out.println(data);

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

       String name =  br.readLine();
       br.close();
        System.out.println(name);
    }
}