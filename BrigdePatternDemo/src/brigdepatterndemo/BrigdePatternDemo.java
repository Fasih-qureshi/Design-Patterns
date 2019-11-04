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
public class BrigdePatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadSchedular obj=new PreemtiveThreadSchedular(new windowspts());
        obj.preemtiveschedular();
		
		
	ThreadSchedular obj1=new TimedSliceSchedular(new windowststs());
        obj1.timesliceschedular();
		
    }
    
}
