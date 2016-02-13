/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionarypractice;

import java.util.Scanner;

public class Pattern {
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = n;
        
        for(int i=1;i<=n;i++)
         {
            for(int space=count;space>0;space--)
               {
                System.out.print(" ");
                
                }
           
            for(int j=1;j<=i;j++)
                System.out.print("#");
             //   i--;
           
                System.out.println();
                count--;
        }
    }
    
}
