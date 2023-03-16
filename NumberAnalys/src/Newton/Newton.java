package Newton;
import java.io.BufferedReader;
import java.io.FileReader;
public class Newton {
	public void readFile() {
	
		try {
			FileReader input=new FileReader("input.txt");
			BufferedReader br=new BufferedReader(input);
			String line=" ";
			while(true) {
			line=br.readLine();
			if (line==null) {
				break;}
			String txt[]=line.split("\\t+");
			double x=Double.parseDouble(txt[0]);
			double y=Double.parseDouble(txt[1]);
			System.out.print(x);
				
			}
		
		}
		catch(Exception e) {
			System.out.println("Input error");
		}
	}
	public static void main(String[] args) {
				Newton a=new Newton();

				
			}
}

