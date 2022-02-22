import java.util.*;
public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		int ar[]= new int[N];
		for(int i=0; i<N; i++) {
			ar[i]= sc.nextInt();
		}
		for(int i=1; i<N; i+=2) {
	        int tmp= ar[i];
	        ar[i]= ar[i-1];
	        ar[i-1]= tmp;
	    }
		for(int i=0; i<N; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
