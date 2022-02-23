import java.util.*;
public class Code {		

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int ar[]= new int[n];
        for(int i=0; i<n; i++){
            ar[i]= sc.nextInt();
        }
        int t= sc.nextInt();
        System.out.println(Search(ar,t));
	}
	
	public static int Search(int ar[], int t) {
		int n= ar.length;
    	int res=-1;
        for(int i=0; i<n; i++){
            if(ar[i]==t){
                res=i;
                break;
            }
        }return res;
    }

}
