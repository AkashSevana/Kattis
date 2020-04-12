import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Autori {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = br.readLine();
			String[] tokens = line.split("-");
			for(String s : tokens)
			System.out.print(s.charAt(0));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
