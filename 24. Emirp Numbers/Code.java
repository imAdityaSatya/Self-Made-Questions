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
	public static int reverse(int n) {
		int rev=0;
        while(n!=0) {
            rev= rev*10 + n%10;
            n/=10;
        }return rev;
	}
	public static String chkEmirp(int n) {
		if(isPrime(n) && isPrime(reverse(n))) {
			return "YES";
		}return "NO";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		System.out.println(chkEmirp(N));
	}

}
