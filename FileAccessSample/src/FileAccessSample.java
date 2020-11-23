import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.URI;
import java.util.Scanner;

public class FileAccessSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File file=new File("abc.doc");
		try {
			//Scanner sc=new Scanner(file);
			//Scanner sc=new Scanner(new File("abc.txt"));
			Scanner sc=new Scanner(new File(new URI("192.168.0.3")));
			sc.nextInt();
			sc.next();
			sc.nextLine();
			sc.nextDouble();
		} 
		catch (Exception e) {
			System.out.println("Error:"+e.getMessage());
		} finally {
			
		}
		
		InputStream in=null;
		try {
			//in=new FileInputStream("abc.doc");//in=new FileInputStream(file);
			Scanner sc=new Scanner(new FileInputStream("abc.txt"));
			sc.nextInt();
			sc.next();
			sc.nextLine();
			sc.nextDouble();
			
			in.close();
		} catch (Exception e) {
			System.out.println("Error:"+e.getMessage());
		} finally {
		}
		
		try {
			//PrintStream out=new PrintStream(new File("abc.txt"));
			//PrintStream out=new PrintStream(new FileOutputStream("abc.txt"));
			PrintStream out=new PrintStream(new File(new URI("http://www.amazon.com")));
			out.println("the 1st line");
			out.print("a="+3);
		} catch (Exception e) {
			System.out.println("Error:"+e.getMessage());
		}
		
		try {
			//BufferedReader reader=new BufferedReader(new FileReader("abc.txt"));
			BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream("abc.txt")));
			String line=reader.readLine();
			String[] words=line.split(" ");
			for (String word:words) {
				int i=Integer.parseInt(word); //"123"->123
				double d=Double.parseDouble(word); //"123"->123.0, "1.2"->1.2
			}
			
		} catch (Exception e) {
			System.out.println("Error:"+e.getMessage());
		}
		
		try {
			//BufferedReader reader=new BufferedReader(new FileReader("abc.txt"));
			FileWriter fw=new FileWriter("abc.txt");
			BufferedWriter writer=new BufferedWriter(fw);
			FileOutputStream stream=new FileOutputStream("abc.data");
			//BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("abc.txt")));
			writer.write("abc");
			byte[] b= {0x33,0x10,0x00,(byte) 0xAB,(byte) 0xFE};
			stream.write(b);
			
		} catch (Exception e) {
			System.out.println("Error:"+e.getMessage());
		}
		

	}

}
