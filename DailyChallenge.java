import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//find triplet a^2+b^2==c^2
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Boolean print=true;
		int[] ar=new int[n];
		for(int i=0;i<n;i++){
		    ar[i]=sc.nextInt();
		}
		Arrays.sort(ar);
		for(int i=0;i<n&& print;i++){
		    for(int j=i+1;j<n&&print;j++){
		        for(int k=j+1;k<n&&print;k++){
		            if(ar[i]*ar[i]+ar[j]*ar[j]==ar[k]*ar[k]){
		                print=false;
		                System.out.print("yes");
		            }
		        }
		    }
		}
		if(print)
		System.out.print("no");

	}
}
