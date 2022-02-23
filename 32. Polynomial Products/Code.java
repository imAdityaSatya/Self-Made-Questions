import java.util.*;
public class Code {
	
	public static int[] prodOfPolys(int M, int N, int[] A, int[] B) {
        int res[]= new int[M+N-1];
        for(int i=0; i< M+N-1; i++) {
	        res[i]=0;
        }
        for(int i=0; i<M; i++) {
	        for(int j=0; j<N; j++) {
    		    res[i+j]+= A[i]*B[j];
	        }
        }return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int M= sc.nextInt();
		int N= sc.nextInt();
		int[] A= new int[M];
		for(int i=0; i<M; i++) {
			A[i]=sc.nextInt();
		}
		int[] B= new int[N];
		for(int i=0; i<N; i++) {
			B[i]=sc.nextInt();
		}
		int[] prod= prodOfPolys(M,N,A,B);
		for(int i=0; i<prod.length; i++) {
			System.out.print(prod[i]+" ");
		}
	}

}
