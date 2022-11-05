
import java.util.*;

public class Solution {
    public static int maxStore(int []arr,int n){
         int [] lmax=new int [n];
        lmax[0]=arr[0];
        for(int i=1;i<n;i++){
            lmax[i]=Math.max(arr[i],lmax[i-1]);
            
              
        }
       
      // System.out.println();
      
        int rmax[]=new int[n];
        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(arr[i],rmax[i+1]);
           
        }
         
        
       
         
       int ans=0;
        for(int i=0;i<n;i++){
         int  miniNum=Math.min(lmax[i],rmax[i]);
       
            ans+=miniNum-arr[i];
          
        }
        
          return ans;
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         var scd= new Scanner(System.in);
        int n=scd.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scd.nextInt();
            
        }
        System.out.println(maxStore(arr,n));
       
    }
}