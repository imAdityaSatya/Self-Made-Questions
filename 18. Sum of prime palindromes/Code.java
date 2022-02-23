import java.util.*;
public class Code {
	
	static Long findSum(int a, int b) {
        long sum=0;
        for(int i=a; i<=b; i++){
            if(isPrime(i) && isPal(i)) {
	            sum+=i;
            }
        }return sum;
    }
    public static boolean isPrime(int n) {
        if(n==1)
        	return false;
        for(int i=2; i*i<=n; i++) {
            if(n%i==0)
            return false;
        }return true;
    }
    public static boolean isPal(int p) {
        int rev=0, tmp=p;
        while(p!=0){
            rev= rev*10+ p%10;
            p/=10;
        }
        if(tmp==rev) {
            return true;
        }return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		System.out.println(findSum(x,y));
	}

}
