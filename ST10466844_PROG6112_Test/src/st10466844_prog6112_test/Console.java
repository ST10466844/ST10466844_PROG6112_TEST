/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10466844_prog6112_test;

/**
 *
 * @author emeris
 */
public class Console extends ConsoleSales
{

    public Console(String consoleType, String store, int totalSales) 
    {
        super(consoleType, store, totalSales);
    }

    
    public void printAccidentReport()
    {
        System.out.println();
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("**************************");
        System.out.println("CONSOLE TYPE: "+ getConsoleType());
        System.out.println("STRE: "+getStore());
        System.out.println("TOTAL SALES: "+getTotalSales());
        System.out.println("**************************");
    }    
}
