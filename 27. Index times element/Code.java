import java.util.*;
public class Code {
	
	public static int indxTimesElem(int n, int ar[]) {
		Arrays.sort(ar);
        long res=0;
        for(int i=0; i<n; i++){
            res= (res+ i*(long)ar[i]);
        }return (int)res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int ar[]= new int[n];
		for(int i=0; i<n; i++) {
			ar[i]= sc.nextInt();
		}
		System.out.println(indxTimesElem(n, ar));
	}

}
