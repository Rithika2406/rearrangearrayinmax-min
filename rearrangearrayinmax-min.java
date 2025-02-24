import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner S=new Scanner(System.in);
	    int n=S.nextInt();
	    int []arr=new int[n];
	    int[]result=new int[n];
	    
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=S.nextInt();
	        
	    }
	    Arrays.sort(arr);
	    int i=0;
	    int j=n-1;
	    int k=0;
	    while(i<=j)
	    {
	        if(k%2==0)
	        {
	           result[k]=arr[j];
	           k++;
	           j--;
	        }
	        else{
	            result[k]=arr[i];
	            k++;
	            i++;
	        }
	    }
	    for(k=0;k<n;k++){
	    System.out.println(result[k]);
	    }
	    
	}
}