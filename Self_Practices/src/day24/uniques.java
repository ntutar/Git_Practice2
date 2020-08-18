package day24;

import java.util.Scanner;

public class uniques {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String result = "";

        for (int i =0; i<=str.length()-1; i++){
            char ch = str.charAt(i);
            int count =0;

            for (int j= 0; j<=str.length()-1; j++){
                char each = str.charAt(j);
                if (each == ch){
                    count+=1;
                }
            }
            if (count ==1){
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
/*
Scanner scan = new Scanner(System.in);
        String str = scan.next();
        // "aabcc"

        String expectedResult = ""; // "b

        for(int j = 0; j <= str.length()-1; j++){ // because we need the frequency of every single character

            char ch1 = str.charAt(j); // a a b c c
            int count1 = 0; // 1+1  // frequnecy of ch
            for(int i = 0; i <= str.length()-1; i++){  // used for finding the frequnecy of ch and assign it to count
                char each = str.charAt(i);  // a  a  b  c  c
                if(ch1 == each){
                    count1+=1;
                }
            }

            if(count1 == 1 ){ // if it only occured one time
                expectedResult += ch1;
            }

        }

        System.out.println(expectedResult);
 */