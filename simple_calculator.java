import java.util.*;
class simple_calculator {
    public void arithematic(int a, int b){
        System.out.println("addition: " + (a+b));
        System.out.println("Subtraction: "+ (a-b));
        System.out.println("Multiplication: "+ (a*b));
        System.out.println("Division: "+ (a/b));
        System.out.println("Remainder: "+ (a%b));
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x= sc.nextInt();
        System.out.println("Enter another number: ");
        int y= sc.nextInt();
        simple_calculator obj1= new simple_calculator();
        obj1.arithematic(x,y);
    }
}