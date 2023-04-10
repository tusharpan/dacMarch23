import java.util.Scanner;
import java.util.Arrays;
class array{
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        System.out.println("Enter the size of array");
        
        int size = s.nextInt();//size =7 as input
        
        System.out.println("enter the value of k");
        int k = s.nextInt(); // k=3
        int arr[] = new int[size]; //arr of sieze 7 will be created
        System.out.println("Enter elements of array");
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt(); //  entered elements are 1 4 17 7 25 3 100
           
        }
        Arrays.sort(arr); // array will be sorted
        for(int i=size-1;i>=size-k;i--)
        {
            System.out.println(arr[i]); // 100 25 17 as output
        }
        
    }
}