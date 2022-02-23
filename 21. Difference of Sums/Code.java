import java.util.*;
public class Code {
	
	public static int diffOfSum(int mat[][], int n) {
        int sum1=0, sum2=0;
        for(int i=0; i<n; i++){
            sum1+=mat[i][i];
        }
        for(int i=0; i<n; i++){
            sum2+=mat[i][n-i-1];
        }
        return Math.abs(sum1-sum2);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int mat[][]= new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j]= sc.nextInt();
			}
		}System.out.println(diffOfSum(mat,n));
	}

}
