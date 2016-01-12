import java.util.*;
import java.io.*;

/**
 *
 * @author yogeshdarji
 */
public class hackerDictionary {
    
     public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int N=in.nextInt();
      in.nextLine();
      Map<String,Integer> d = new HashMap<String, Integer>();
      for(int i=0;i<N;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
         d.put(name, phone);
      }
      System.out.println("Enter the names or enter Q to quit");
       ArrayList al = new ArrayList();
      while(in.hasNext())
      {
         
         String s=in.nextLine();
         
         if(s.equals("Q") || s.equals("q"))
         {
             System.out.println("Quitting!!!");
                     break;
         }
             else
         al.add(s);
      }
      
            
       int n= al.size();
       System.out.println("The contents of array list = "+al);
       
       for(int i=0;i<n;i++)
       {
           if(d.containsKey(al.get(i)))
           {
               System.out.println(al.get(i)+"="+d.get(al.get(i)));
           }
           
           else
           {
               System.out.println("Not found");
           }
       }
       
   }
}
