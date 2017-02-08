import java.util.*;

public class ForLoops {
    
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[100];
         int b[] = new int[100];
         int N[] = new int[100];
         
      
        for(int i=0;i<n;i++)
        {
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
                N[i] = sc.nextInt();  
        }
      //  System.out.println("Outside both for");
        
        int sum=0;  
       for(int j=0;j<n;j++)
        {
            sum = (int) (a[j]+(Math.pow(2,0)*b[j]));
            System.out.println(sum+" ");
            for(int k=1;k<N[j];k++)
            {
                //Actual sum
             sum = (int) (sum + Math.pow(2, k)*b[j]);
             System.out.print(sum+" ");
            }
            
            System.out.println();
            sum =0;
        }
    }
    
}
