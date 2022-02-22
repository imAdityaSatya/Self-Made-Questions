import java.util.*;
public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String S= sc.nextLine();
		int cnt=0, n= S.length();
        char ar[]= S.toCharArray();
        for(int i=0; i<n; i++){
            if(ar[i]>='a' && ar[i]<='z' || ar[i]>='A' && ar[i]<='Z'){
                cnt++;
            }
        }
        System.out.println(cnt);
	}

}
