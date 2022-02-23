import java.util.*;
public class Code {
	
	public static int[] openOrClosed(int N) {
        // code here
        int doors[]= new int[N];
        for(int i=1; i*i<=N; i++){
            doors[i*i-1] = 1;
        }return doors;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		int res[]= openOrClosed(N);
		for(int i=0; i<N; i++) {
			System.out.print(res[i]+" ");
		}
	}

}
