import java.util.*;
public class Code {
	
	public static int totalBill(String s) {
        int sum=0, n=s.length();
        for(int i=0; i<n; i++){
            if(Character.isDigit(s.charAt(i))){
                String tmp="";
                while(i<n && Character.isDigit(s.charAt(i))){
                    tmp+= s.charAt(i);
                    i++;
                }
                sum+=Integer.parseInt(tmp);
            }
        }return sum;
	}
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		System.out.println(totalBill(s));
	}

}
