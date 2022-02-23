import java.util.*;
public class Code {
	public static boolean isPrime(int n) {
        if(n==0 || n==1) {
            return false;
        }
        for(int i=2; i*i<=n; i++) {
            if(n%i==0) {
                return false;
            }
        }return true;
    }
	public static String isPrimeNeighbour(int N) {
		if(isPrime(N-1) && isPrime(N+1)) {
            return "YES";
        }
        return "NO";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		System.out.println(isPrimeNeighbour(N));
	}

}
