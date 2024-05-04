import java.util.*;
public class Hello {
    public static int oneCount(int a){
        int c=0;//counter
        while(a>0){
            if(a%2==1){
                c++;
            }a/=2;
        }
        return c;
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=oneCount(a);
		int NewCount=0;
		while(count!=NewCount){
		    a++;
		    if(oneCount(a)==count){
		        NewCount=count;
		    }
		}
		System.out.print(a);

	}
}
