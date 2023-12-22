import java.util.*;
class even_numbers{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N= sc.nextInt();
        for (int i=0; i<N; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}