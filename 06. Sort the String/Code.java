import java.util.*;
public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		char[] ch= s.toCharArray();
        Arrays.sort(ch);
        System.out.println(String.valueOf(ch));
	}

}
