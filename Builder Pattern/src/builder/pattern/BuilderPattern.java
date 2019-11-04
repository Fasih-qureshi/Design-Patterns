/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.pattern;

/**
 *
 * @author imran
 */
public class BuilderPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CDBuilder cdBuilder=new CDBuilder();  
   CDType cdType1=cdBuilder.buildSonyCD();  
   cdType1.showItems();  
  
   CDType cdType2=cdBuilder.buildSamsungCD();  
   cdType2.showItems(); 
    }
    
}
