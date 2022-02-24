import java.util.Scanner;
public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i=0, sum=0;
        while(i<n){
            i++;
            sum+=i;
        }
        System.out.println(sum);
	}

}
