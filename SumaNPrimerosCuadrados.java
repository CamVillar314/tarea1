import java.io.*;
import java.lang.*;
import java.util.*;
import java.io.IOException;

public class SumaNPrimerosCuadrados{

	public static int sumaNPrimerosCuadrados(int n){

		int i = 1;
		int a = 0;

		while(i <= n){

			a += i*i;
			++i;
		}
		
		return a;

	}

	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()){
		
			String line = sc.nextLine();
			int n = Integer.parseInt(line);
			int result = sumaNPrimerosCuadrados(n);	
			System.out.println(result);
		}
	}
}
