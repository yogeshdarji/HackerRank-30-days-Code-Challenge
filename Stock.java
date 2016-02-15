import java.util.*;

/**
 *
 * @author yogeshdarji
 */
public class Stock {
    
    
    public static void main(String args[])
    {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of days:");
        int n = sc.nextInt();
        System.out.print("Enter the Buying price and selling price");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int a[] =new int[10];
        int b[] = new int[10];
        
        int j=0;
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(i%2!=0)
            {
                b[j]=arr[i];
                j++;
            }
            
            else
            {
                a[k] = arr[i];
                //System.out.println("a[k]"+a[k]);
                k++;
            }
        }
        
        for(int i=0;i<n/2;i++)
        {
            System.out.print(a[i]+" "+b[i]+" ");
        }
        
        int sum = 0;
        for(int i=0;i<n/2;i++)
        {
            if(b[i]-a[i]<0)
            {
                
            }
            else{
                sum = sum + (b[i]-a[i]);
            }
            
        }

        
        System.out.println("The profit="+sum);
    }
}
