/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testchain;

/**
 *
 * @author fasih
 */
public class TestChain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //configure Chain of Responsibility 
        Chain c1 = new NegativeProcessor(); 
        Chain c2 = new ZeroProcessor(); 
        Chain c3 = new PositiveProcessor(); 
        c1.setNext(c2); 
        c2.setNext(c3); 
  
        //calling chain of responsibility 

        c1.process(new Number(-30)); 
        c1.process(new Number(0)); 
        c1.process(new Number(51)); 
    }
    
}
