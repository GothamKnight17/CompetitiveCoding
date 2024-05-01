/**
 * myClass
 */

 class GFG

 {
 
     int a = 1;
 
  
 
     void func()
 
     {
 
         demo obj = new demo();
 
         obj.display();
 
     }
 
     class demo
 
     {
 
         int b = 2;
 
  
 
         void display()
 
         {
 
             System.out.println("a = " + a);
 
         }
 
     }
 
     void get()
 
     {
 
         System.out.println("b = " + b);
 
     }
 
 }
 
 class Test
 
 {
 
     public static void main(String args[])
 
     {
 
         GFG obj = new GFG();
 
         obj.func();
 
         obj.get();
 
  
 
     }
 
 }