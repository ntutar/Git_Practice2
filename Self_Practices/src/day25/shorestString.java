package day25;
/*
2. Write a program that can return the shortest string of text from a String array
 */
public class shorestString {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nicholas","Amir","Nurmamet","Abi", "Ali", "Joe"};

        int minLength = arr[0].length();
        int maxLength = arr[0].length();

        for (int i =0; i<=arr.length-1; i++){
            int l = arr[i].length();
            if (l<minLength){
                minLength=l;
            }

        }
        System.out.println(minLength);

        for (int i =0; i<=arr.length-1; i++){
            if (minLength==arr[i].length()){
                System.out.println(arr[i]);
            }
        }

        for (int i =0; i<=arr.length-1; i++){
            int x = arr[i].length();
            if (x>maxLength){
                maxLength=x;
            }
        }
        System.out.println(maxLength);
        for (int i =0; i<=arr.length-1; i++){
            if (maxLength==arr[i].length()){
                System.out.println(arr[i]);
            }
        }



    }
}
/*

  2. Write a program that can return the shortest string of text from a String array

public class ShortestString_01 {
    public static void main(String[] args) {

        String[] arr = {"Anam", "Nicholas","Amir","Nurmamet","Abi", "Ali", "Joe"};
        int minLength = arr[0].length();

        for (int i = 0; i<=arr.length-1; i++){  // to find out minimum length of the string in the array
            int l = arr[i].length();   // ==> 4 8 4 8

            if (l<minLength){
                minLength=l;
            }
        }
        System.out.println("Shoertest string's length is: "+minLength);     // ==> 4

        for (int i = 0; i<=arr.length-1; i++){ // ==> to see how many string's length in the array is matching with the minLength
            if (arr[i].length() == minLength){
                System.out.println(arr[i]);     // ==> Anam  Amir
            }
        }


 */
