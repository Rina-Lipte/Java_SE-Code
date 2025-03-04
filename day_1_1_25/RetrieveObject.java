package day_1_1_25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RetrieveObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		var fis=new FileInputStream("C:\\JavaNareshaIT\\new\\Student.txt");
		var ois=new ObjectInputStream(fis);
		
		try(fis;ois)
		{
			ArrayList<Object> list=(ArrayList<Object>) ois.readObject();
			System.out.println(list);
		}

	}

}
