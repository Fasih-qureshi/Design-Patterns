/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brigdepatterndemo;

/**
 *
 * @author imran
 */
public class TimedSliceSchedular extends ThreadSchedular{
    public TimedSliceSchedular(Thread c)
	{
		
		super(c);
		
	}


	@Override
	void preemtiveschedular() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void timesliceschedular() {
		System.out.println("Time Slice Schedular");
		
	}
	
	
    
}
