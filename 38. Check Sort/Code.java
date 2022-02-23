import java.util.*;
public class Code {

	public static boolean chkSort(int[] arr, int N) {
		int ar[]= arr.clone();
        Arrays.sort(arr);
        for(int i=0; i<N; i++){
            if(arr[i]!=ar[i]){
                return false;
            }
        }return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		int arr[]= new int[N];
		for(int i=0; i<N; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println(chkSort(arr,N));
	}

}
