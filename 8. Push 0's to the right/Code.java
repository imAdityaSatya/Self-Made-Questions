import java.util.*;
public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		int ar[]= new int[N];
		for(int i=0; i<N; i++) {
			ar[i]= sc.nextInt();
		}
		int j=0;
        for(int i=0; i<N; i++){
            if(ar[i]!=0){
                ar[j++]= ar[i];
            }
        }
        while(j<N){
            ar[j++]=0;
        }
        for(int i=0; i<N; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
