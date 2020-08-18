package day24;
/*
2. write a program that asks user how many numbers he wants to enter,
 and get all the user inputs and store them into an array variable,
 and then write the program that can return maximum and minimum numbers
 */
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many number do you want to enter?");
        int n = scan.nextInt();
        int [] nums = new int[n];
        int max =nums [0];
        int min = nums[0];

        for (int i = 0; i<=nums.length-1; i++){
            System.out.println("Enter a number");
            nums[i]= scan.nextInt();

            if (nums[i]>max){
                max = nums[i];
            }


        }
        for (int i = 0; i<=nums.length-1; i++){
            if (nums[i]<min){
                min = nums[i];
            }
        }
        System.out.println(max);
        System.out.println(min);





    }
}
/*

/*
 2. write a program that asks user how many numbers he wants to enter,
 and get all the user inputs and store them into an array variable,
 and then write the program that can return maximum and minimum numbers

public class MaxMin_03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many number do you want to enter?");
        int n = scan.nextInt();

        int[]arr = new int[n];

        for (int i = 0; i<=n-1; i++){      // get user inputs and storing them in the array
            System.out.println("Enter a number");
            // int num = scan.nextInt();
            // arr[i]=num;  //  10 20 30 40 50
            //            i:    0, 1, 2, 3, 4
            arr[i]=scan.nextInt(); // 10 , 20, 30,
        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i<=arr.length-1; i++){

            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);

 */