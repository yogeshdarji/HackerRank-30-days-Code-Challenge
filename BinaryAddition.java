
package dictionarypractice;

public class BinaryAddition {
    
  public static void main(String args[])
  {
      String a = "011";
      String b = "110";
      int ans[] = new int[100];
      char carry = '0';
      
      //StringBuilder sb = new StringBuilder(a);
      //sb.reverse();
      
      
      for(int i=a.length()-1;i>=0;i--)
      {
          System.out.println("Inside for loop");
          System.out.println(a.charAt(i));
             System.out.println(b.charAt(i));
          
          if((a.charAt(i)=='1' && b.charAt(i)=='0')||(a.charAt(i)=='0' && b.charAt(i)=='1'))
          {
            System.out.println("Inside 1 and 0");
              ans[i]=1;
          }
          
          else if(a.charAt(i)=='1' && b.charAt(i)=='1' && carry=='1')
          {
              System.out.println("Inside 1 and 1");
               ans[i]=0;
               carry='1';
              // ans[i-1]=carry;
 
          }
          
          else if(a.charAt(i)=='0' && b.charAt(i)=='0')
          {
              System.out.println("Inside 0 and 0");
                ans[i] = 0;
          }
      }
      
      for(int j=a.length();j>0;j--)
      {
          System.out.print(ans[j]);
      }
      
    // for(int i =0; i<)
  }
}
