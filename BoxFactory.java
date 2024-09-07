// BoxFactory.java
// Jacquelinle T.
// 8/31/24
// Class that represents a boxy factory

public class BoxFactory{

   //class constants outside the main method, but in the BoxFactory class.
   // Make constant to never change 
   public static final String COLOR_RED = "RED";
   public static final String COLOR_GREEN = "GREEN";
   public static final String COLOR_BLUE = "BLUE";
   
   // constant for number of boxes in factory
   public static final int NUM_BOXES = 3;
      
   public static void main(String[] args){
   
      // Box factory contains 3 boxes.
      // First box is a RED box.
      // Second box is a GREEN box.
      // Third box is a BLUE box.
      
      System.out.println("Box Factory contains " + NUM_BOXES + " boxes.");
      System.out.println("First box is a " + COLOR_RED + " box.");
      System.out.println("First box is a " + COLOR_GREEN + " box.");
      System.out.println("First box is a " + COLOR_BLUE + " box.");
   
      //System.out.println("Color 1 is " + COLOR_RED);
      //System.out.println("Color 1 is " + COLOR_GREEN);
      //System.out.println("Color 1 is " + COLOR_BLUEy);
      
      //System.out.println("Here is a tab: \nand now we continue on.");
      
   }
}

