import java.util.*;
public class Code {
	
	public static String isDiv(int N) {
		int num=N, digit;
		while(N!=0) {
			digit= N%10;
			N/=10;
			if(digit==0 || num%digit!=0) {
				return "NO";
			}
		}return "YES";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		System.out.println(isDiv(N));
	}

}
