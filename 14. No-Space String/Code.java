import java.util.*;
public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); 
		String s= sc.nextLine();
		System.out.println(delSpaces(s));
	}
	public static String delSpaces(String s) {
		String str= s.replaceAll(" ","");
        return str;
	}

}
