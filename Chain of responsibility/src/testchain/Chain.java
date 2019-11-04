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
public interface Chain {
    public abstract void setNext(Chain nextInChain); 
    public abstract void process(Number request); 

 
}
