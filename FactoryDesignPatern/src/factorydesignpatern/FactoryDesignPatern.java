
package factorydesignpatern;

import java.util.Scanner;

/**
 *
 * @author imran
 */
public class FactoryDesignPatern {

   
    public static void main(String[] args) {
       
        Scanner obj=new Scanner(System.in);
        
        ShapeFactory f=new ShapeFactory();
        System.out.println("Enter Your Choice to draw");
        String shape=obj.nextLine();
        Shape p=f.getShape(shape);
        p.draw();
        
        
        
        
        
    }
    
}
