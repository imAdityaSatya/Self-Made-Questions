import java.util.*;
public class Code {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int ar[]= new int[n];
		for(int i=0; i<n; i++) {
			ar[i]= sc.nextInt();
		}
		int x= sc.nextInt();
		int cnt=0;
        for(int i=0; i<n; i++){
            if(ar[i]==x){
                cnt++;
            }
        }System.out.println(cnt);
	}
}
