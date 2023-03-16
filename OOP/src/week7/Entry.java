package week7;
//Ngo NGoc Vuong 20206221
import java.io.*;
import java.util.*;
public class Entry {
	public class DataOutputExample {
		 public static void main(String[] args) { 
			 Student s1= new Student("Hoang",9,10);
			 
			   System.out.println("Menu");
			   System.out.println("--------------");
			   System.out.println("1.Save");
			   System.out.println("2.Read file");
			   System.out.println("3.Exit");
		  try {
		   FileOutputStream in = new FileOutputStream("d:/file/mydata.bin");
		   ObjectOutputStream out =new ObjectOutputStream(in);
		   out.writeObject(s1);
		   in.close();
		   out.close();
		   System.out.println("Done!");
		  } catch (IOException ex) {
		    System.out.println("ERROR");
		    ex.printStackTrace();
		  } 
		 }}
public class ReadFile{
        String url = ":D\\file-content.txt";

        // Đọc dữ liệu từ File với File và FileReader
        File file = new File(url);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        reader.close();
                // file.close();
            } 
    }

 
	
