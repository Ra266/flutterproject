
import java.util.*;

public class Solution {
    public static String tictak(int arr[][],int n){
       int  diagonalcount1=0,diagonalcount=0;
        for(int i=0;i<n;i++){
           int rowcount=0,colcount=0;
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    rowcount++;
                }
                if(arr[j][i]==0){
                    colcount++;
                }
                if(i==j &&arr[i][j]==0){
                    diagonalcount1++;
                }
                if(i+j==n-1  && arr[i][j]==0){
                    diagonalcount++;
                }
            }
            if(rowcount==3||colcount==3||rowcount==0||colcount==0){
                return "Games End";
            }
            
        }
        if(diagonalcount1==3||diagonalcount1==0||diagonalcount==0||diagonalcount==3){
            return "Games End";
        }
        return "Draw";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(tictak(arr,n));
    }
}