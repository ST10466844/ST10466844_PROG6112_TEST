/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10466844_prog6112_test;

import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class ST10466844_PROG6112_Test {

    public static void main(String[] args) 
    {
       Scanner input = new Scanner (System.in);
       
       String [] cities ={ "Cape town", "Port Elizabeth","Pretoria"};
       String [] consoles = {"PS5", " XBOX", "SWITCH"};
      
       
       int [][]sales = new int[3][3];
       int [] totals = new int[3];
       
       for (int i = 0; i <cities.length; i++)
       {
           System.out.print("Enter the number of sales for PS5 "+cities[i] +": ");
           sales[i][0] = input.nextInt();
           
           System.out.print("Enter the number of sales for XBOX "+cities[i] +": ");
          sales[i][1] = input.nextInt();
          
          
           System.out.print("Enter the number of sales for SWITCH "+cities[i] +": ");
          sales[i][1] = input.nextInt();
       }
       
       System.out.println();
       System.out.println("------------------------------------");
       System.out.println("GAMING CONSOLE REPORT");
       System.out.println("------------------------------------");
       System.out.printf("%-20s %-10s %-10s %-10s%n ","","PS5","XBOX","SWITCH");
       
       for (int i = 0; i <cities.length; i++)
       {
            System.out.printf("%-20s %-10s %-10s %-10s%n",cities[i],sales[i][0],sales[i][1],sales[i][2]);
       }
       
       System.out.println();
       System.out.println("------------------------------------");
       System.out.println("GAMING CONSOLE TOTAL FOR EACH CITY");
       System.out.println("------------------------------------");
       
        for (int i = 0; i <cities.length; i++)
        {
            totals[i] = sales[i][0] + sales[i][1] + sales[i][2];
            System.out.println(cities[i] + " " + totals[i]);
        }
        
        int highest = totals[0];
        int highestIndex = 0;
        
        for (int i = 0; i <cities.length; i++)
        {
            if (totals[i] > highest)
            {
                highest = totals[i];
                highestIndex = i;
            }
        }
        
       System.out.println();
       System.out.println("CITY WITH THE MOST SALES: "+cities[highestIndex]);
       System.out.println("------------------------------------");
       
       input.close();
    }
    
}
