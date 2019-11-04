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
public class PreemtiveThreadSchedular extends ThreadSchedular {
    PreemtiveThreadSchedular(Thread c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
        @Override
	void preemtiveschedular() {
		
		System.out.println("Base Preemtive Schedular");
	}
        @Override
	void timesliceschedular() {
			// TODO Auto-generated method stub
		
	}
}
