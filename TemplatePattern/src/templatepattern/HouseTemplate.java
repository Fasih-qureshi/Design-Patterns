
package templatepattern;


public abstract class HouseTemplate {
    
    
    
    abstract void buildHouse();
    abstract void buildWindows();
    
    abstract void buildWalls();
    abstract void buildPillar();
    abstract void buildFounation();
    
    
   public final void Build(){
       
       
       
         buildFounation();
          buildPillar();
           buildWalls();
                buildWindows();
       buildHouse();
    }
    
}
