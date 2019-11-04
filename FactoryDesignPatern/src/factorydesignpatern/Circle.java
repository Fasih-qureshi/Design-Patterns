/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydesignpatern;

/**
 *
 * @author imran
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        
        int n=5;
        
        
        System.out.println("I am Circle");
                for (int i = -n; i <= n; i++) {
                for (int j = -n; j <= n; j++) {
                if (i*i + j*j <= n*n) System.out.print("* ");
                else                  System.out.print(". ");
            }
            System.out.println();
        }
 
  
    }
   
}
