import java.util.*;
public class Code {
	static int primeSum(int N){
        int sum=0;
        while(N>0){
            int n= N%10;
            if(isPrime(n)){
                sum+=n;
            }N/=10;
        }return sum;
    }
    static boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		System.out.println(primeSum(N));
	}
}
