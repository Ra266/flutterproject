
import java.io.*;
import java.util.*;
public class Solution {
    public static void targetSum(int arr[], int target, int start, int end,int prevNumberOfTriplet){
        int i = start, j = end;
        while ( i < j ) {
            // first try to avoid any dublicated num pointed by left point
            while(i < j && arr[i] == arr[i+1]){
                i++;
            }
            if(arr[i]+arr[j] == target ){
                    System.out.println(prevNumberOfTriplet+" "+arr[i]+" "+arr[j]);
                    i++;
                    j--;
                }
            else if(arr[i]+ arr[j] > target){
                j--;
                }
            else {
                i++;
            }
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i=0; i< n; i++){
          arr[i]=sc.nextInt();
        }
        int k = 0;
        Arrays.sort(arr);
        for(int i = 0 ; i < n ; i++){
            if(i > 0 && arr[i] == arr[i-1]){
                continue;
            }
            targetSum(arr,k-arr[i],i+1,n-1,arr[i]);
       }
    }
}
    

