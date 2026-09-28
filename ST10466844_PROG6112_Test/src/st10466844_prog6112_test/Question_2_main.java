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
public class Question_2_main {

    
    public static void main(String[] args) 
    {
       Scanner input = new Scanner (System.in);
       
      
       System.out.print("Enter the city for the store number: ");
       String store =input.nextLine();
       
       System.out.print("Enter the total sales for : "+ store + ": ");
       int totalSales = input.nextInt();
       
        String consoleType = null;
       
       Console report = new  Console(consoleType, store, totalSales);
       
       report.printAccidentReport();
       
       input.close();
    }
    
}
