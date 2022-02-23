import java.util.*;
public class Code {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long num= sc.nextLong();
		long i=2, sum=1;
        while(i<Math.sqrt(num)) {
            if(num%i==0) {
                if(i==num/i){
                    sum+=i;
                }else{
                    sum+=i;
                    sum+=num/i;
                }
            }
            i++;
        }
		if(sum==num && num!=1){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
	
}
