/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author fasih
 */
public class Light {
    private boolean on;
  public void switchOn(){
    on = true;
    System.out.println("lights is on now");
  }
  public void switchOff(){
    on = false;
    System.out.println("lights is off now");
  }
}
