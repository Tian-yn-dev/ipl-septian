package MultipleCatchBlocks;

import java.io.*;

public class ExcepTes2 {
	public static void main(String args[]) {
		try {
			file = new FileInputStream(fileName);
			x = (byte) file.read();
		} catch (IOException i) {
			i.printStackTrace();
			return -1;
		} catch (FileNotFoundException f) // Not valid! {
			f.printStackTrace();
			return -1;
		
}