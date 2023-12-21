import java.util.*;
class Multiplication_table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int N= sc.nextInt();
        for (int i=1; i<11; i++){
            System.out.println(N+" X "+ i+ " = "+ N*i);
        }
    }
    
}
