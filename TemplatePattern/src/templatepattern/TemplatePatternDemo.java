/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatepattern;

/**
 *
 * @author fa16-bse-090
 */
public class TemplatePatternDemo {
    
    
    public static void main (String args[]){
        
        
        
        HouseTemplate temp1=new WoodenHouse();
        
        temp1.Build();
        
        
         HouseTemplate temp=new WoodenHouse();
         
        
   temp.Build();
        
        
        
        
       
        
        
        
        
        
    }
    
}
