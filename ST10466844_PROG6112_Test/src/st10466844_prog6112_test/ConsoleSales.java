/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10466844_prog6112_test;

/**
 *
 * @author emeris
 */
public abstract class ConsoleSales implements IConsole 
{
     private String consoleType;
    private String store;
    private int totalSales;
    
    public ConsoleSales (String consoleType,String store,int totalSales)
    {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales= totalSales;
    }
    
    @Override
    public String getConsoleType()
    {
        return consoleType;
    }
    
    @Override
    public String getStore()
    {
        return store;
    }
    
    @Override
    public int getTotalSales()
    {
        return  totalSales;
    }
}
