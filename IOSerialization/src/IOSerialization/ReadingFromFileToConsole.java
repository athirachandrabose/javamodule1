package IOSerialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFileToConsole {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader Reader=new FileReader("D:\\ustcore\\IOSerialization\\src\\IOSerialization\\KeyboardToFile.java");
         BufferedReader buffer=new BufferedReader(Reader);
         String data=buffer.readLine();
         while(data!=null) {
        	 System.out.println(data);
        	 data=buffer.readLine();
         }
         Reader.close();
         buffer.close();
	}

}
