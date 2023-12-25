import java.util.*;
class Main{
    public static void main(String args[]){
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int N= sc.nextInt();
        int[] maxmin= new int[N];
        for (int i=0; i<N; i++){
            System.out.print("Enter number:");
            maxmin[i]= sc.nextInt();
        }
        int max= maxmin[0];
        int min= maxmin[0];
        for(int i=0; i<N; i++){
            if(max<maxmin[i]){
                max= maxmin[i];
            }if(min> maxmin[i]){
                min= maxmin[i];
            }
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+ min);
    }
}