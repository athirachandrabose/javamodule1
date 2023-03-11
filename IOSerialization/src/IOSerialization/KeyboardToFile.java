package IOSerialization;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class KeyboardToFile {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
           String data=null;
           InputStreamReader isr=new InputStreamReader(System.in);
           BufferedReader reader=new BufferedReader(isr);
           FileWriter writer =new FileWriter("Nammude file");
           System.out.println("enter some text");
           data=reader.readLine();
           while(!data.equals("quit")) {
         //  System.out.println("you have entered...."+data);
           writer.write(data);
           data=reader.readLine();
           }
           writer.flush();
           writer.close();
           System.out.println("main exited");
	}

}
