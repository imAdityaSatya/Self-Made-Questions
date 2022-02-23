import java.util.*;
public class Code {
	
	public static int getMinOps(int[][] mat, int n) {
        int max=0;
        int sum=0;
    	for(int i=0; i<n; i++) {
    	    int rowSum=0;
    		for(int j=0; j<n; j++) {
	    		rowSum+= mat[i][j];
		    }
		    sum+= rowSum;
		    max= max < rowSum ? rowSum : max;
	    }
	    for(int i=0; i<n; i++) {
	        int colSum=0;
    		for(int j=0; j<n; j++) {
			    colSum+= mat[j][i];
    		}
		    max= max<colSum ? colSum : max;
	    }return (max*n)-sum;
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
		}System.out.println(getMinOps(mat,n));
	}

}
