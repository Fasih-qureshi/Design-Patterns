
package templatepattern;


public class WoodenHouse extends HouseTemplate{

    @Override
    void buildHouse() {
        System.out.println("......Wooden House is Building......");
    }

    @Override
    void buildWindows() {
        System.out.println("Windows are Building.........");
    }

    @Override
    void buildWalls() {
        System.out.println("Walls are building...");
    }
    
    @Override
    void buildPillar() {
         System.out.println("Pillars are building...");
    }

    @Override
    void buildFounation() {
                 System.out.println("Foundation is done...");
    }
    
}
