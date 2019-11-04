package client;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fasih
 */
public class LightOFF implements command {
    Light light;
  public LightOFF(Light light){
    this.light = light;
  }
  public void execute(){
    light.switchOff();
  }
}
