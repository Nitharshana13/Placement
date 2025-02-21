import java.util.*;
class Calculator{
   public void add(){
       Scanner in=new Scanner(System.in);
       int a=in.nextInt();
       int b=in.nextInt();
       System.out.println("Sum = "+(a+b));
   }
   public int diff(){
       Scanner in=new Scanner(System.in);
       int a=in.nextInt();
       int b=in.nextInt();
       return (a-b);
   }
   public void prod(int a,int b){
       System.out.println("Product = "+(a*b));
   }
   public int div(int a,int b){
       return(a/b);
   }
   
}
class Main{
    public static void main(String[]args){
        Calculator obj=new Calculator();
        obj.add();
        System.out.println("Difference = "+obj.diff());
        obj.prod(5,7);
        System.out.println("Division = "+obj.div(4,8));
        
    }
}