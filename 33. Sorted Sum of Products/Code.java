import java.util.*;
public class Code {

	public static int sumOfProds(int A[], int B[], int N) {
        Arrays.sort(A);
        Arrays.sort(B);
        int res=0;
        for(int i=0; i<N; i++){
            res+= A[i]*B[N-i-1];
        }return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		int A[]= new int[N];
		int B[]= new int[N];
		for(int i=0; i<N; i++) {
			A[i]= sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			B[i]= sc.nextInt();
		}
		System.out.println(sumOfProds(A,B,N));
	}

}
