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
public class ZeroProcessor implements Chain{
    private Chain nextInChain; 

 
    public void setNext(Chain c) 
    { 
        nextInChain = c; 
    } 
  
    public void process(Number request) 
    { 
        if (request.getNumber() == 0) 
        { 
            System.out.println("ZeroProcessor : " + request.getNumber()); 
        } 
        else
        { 
            nextInChain.process(request); 
        } 
    } 
}
