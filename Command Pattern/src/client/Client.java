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
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      RemoteController control = new RemoteController();
    Light light = new Light();
    command lightsOn = new LightON(light);
    command lightsOff = new LightOFF(light);
    //switch on
    control.setCommand(lightsOn);
    control.pressButton();
    //switch off
    control.setCommand(lightsOff);
    control.pressButton();
    }
    
}
