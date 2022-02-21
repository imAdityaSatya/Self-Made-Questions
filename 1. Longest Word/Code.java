import java.util.*;
public class Code {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		String arr[]= new String[n];
		for(int i=0; i<n; i++) {
			arr[i]= sc.next();
		}
		int i=0, longest=0;
        while(i<n) {
            if(arr[longest].length() < arr[i].length()) {
                longest= i;
            }
            i++;
        }
        System.out.println(arr[longest]);
	}

}
