/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brigdepatterndemo;

/**
 *
 * @author fasih
 */
public abstract class ThreadSchedular {
    protected Thread th;
	ThreadSchedular(Thread c){	
		this.th=c;
	}
	
	
	
	
	abstract void preemtiveschedular();
	abstract void timesliceschedular();
}
