import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class matri{
    public static void main(String aa[]){
    int n;
    int c=0;
    int h=0;
    int sum=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
   int  m=s.nextInt();
   int a[][]=new int[n][m];
   for(int i=0;i<n;i++){
       for(int j=0;j<m;j++){
           a[i][j]=s.nextInt();
       }
   }
    for(int i=0;i<n;i++){
       for(int j=0;j<m;j++){
          if(a[i][j]==0){
              c++;
          }
       }
       if(i==0){
           sum=c;
           c=0;
           h=i+1;
       }
 else{
           if(c<sum){
               sum=c;
               h=i+1;
               c=0;
           }
 }

   }

   System.out.print(h);
   System.out.println(sum);
   
    
}
}

