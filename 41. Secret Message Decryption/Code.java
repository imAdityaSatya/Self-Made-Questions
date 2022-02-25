import java.util.Scanner;
public class Code {

	public static void main(String[] args) {
		// Code below...
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();		// Encrypted (actual) message
		char[] ch= s.toCharArray();
		for(int i=0;i<ch.length; i++) {
			if(ch[i]=='z') 
				ch[i]='a';
			else if(ch[i]=='Z') 
				ch[i]='A';
			else if( (ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z'))
				ch[i]+= 1;
			System.out.print(ch[i]);	// Decrypted (simplified) message
		}	
	}

}
