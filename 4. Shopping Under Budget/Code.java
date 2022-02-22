import java.util.*;
public class Code {
	
	static int items(int n, int ar[], int b) {
        Arrays.sort(ar);
        int i=0;
        int sum=0;
        while(i<n){
            if(b<sum+ar[i]){
                break;
            }
            sum+=ar[i];
            i++;
        }return i;
    }

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int ar[]= new int[n];
		for(int i=0; i<n; i++){
            ar[i]= sc.nextInt();
        }
		int b= sc.nextInt();
		System.out.println(items(n,ar,b));
	}

}
