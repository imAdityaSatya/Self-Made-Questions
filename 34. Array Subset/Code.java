import java.util.*;
public class Code {
	
	public static boolean chkSubset(int A[], int B[], int M, int N) {
        Set<Integer>h1= new HashSet<Integer>();
        Set<Integer>h2= new HashSet<Integer>();
        for(int i=0; i<M; i++) {
            h1.add(A[i]);
        }
        for(int i=0; i<N; i++) {
            h2.add(B[i]);
        }
        return h1.containsAll(h2);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int M= sc.nextInt();
		int N= sc.nextInt();
		int A[]= new int[M];
		int B[]= new int[N];
		for(int i=0; i<M; i++) {
			A[i]= sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			B[i]= sc.nextInt();
		}
		System.out.println(chkSubset(A,B,M,N));
	}

}
