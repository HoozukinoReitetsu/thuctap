package DesignPattern.src.ChainofResponsibility;

public class FirstProcess extends Process 
 {  
   protected void RunNext(){
    try {
      // thread to sleep for 1000 milliseconds
      System.out.println(" Beginning first process ....  ");
      Thread.sleep(1000);
      System.out.println(" Ending first process ....  ");
   } catch (Exception e) {
      System.out.println(e);
   }
   }  
 } 