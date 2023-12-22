import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 0 or 1:");
        int a= sc.nextInt();
        if (a==1){
            System.out.print("Enter marks: ");
            int marks= sc.nextInt();
            if (marks>=90){
                System.out.println("This is Good");
            }else if ((marks<=89) && (marks>=60)){
                System.out.println("This is also Good");
            }else{
                System.out.println("This is Good as well");
            }
        }else if (a==0){
            System.out.println("Programming stopping.");
        }else{
            System.out.println("Wrong input.");
        }

    }
}