import java.util.*;
public class Code {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();	// Actual Message
		char[] ch= s.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='a') 
				ch[i]='z';
			else if(ch[i]=='A') 
				ch[i]='Z';
			else if((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z'))
				ch[i]-= 1;
			System.out.print(ch[i]);	// Encrypted Message
		}
	}

}
