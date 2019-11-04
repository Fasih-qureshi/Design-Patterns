/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author imran
 */
public class RemoteController {
    private command command;
  public void setCommand(command command){
    this.command = command;
  }
  public void pressButton(){
    command.execute();
  }
}
