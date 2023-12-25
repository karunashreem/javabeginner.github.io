import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of names you want to enter: ");
        int N= sc.nextInt();
        String[] names= new String[N];
        for (int i=0; i<N; i++){
            System.out.print("Enter name:");
            names[i]= sc.nextLine();
        }
        for (int j= 0; j<N; j++){
            System.out.print(names[j]+ " ");
        }

    }
}