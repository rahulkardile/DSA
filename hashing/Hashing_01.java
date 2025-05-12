package hashing;

import java.util.Scanner;

public class Hashing_01 {

    //  what is hashing - prestoring and fetching.

    // first approch!
    public static int checkNumber(int n, int arr[]){
        int count = 0;
        for (int i : arr) {
            if(i == n){
                count++;
            }
        }
        return count;
    }

    public static void main(String arg[]){

        Scanner getInput = new Scanner(System.in);
        int n;
        System.out.println("Tell me the length of the array?");
        n = getInput.nextInt();
        int arrNum[] = new int[100];
        
        // System.out.println("count of n is : "+ checkNumber(n, arrNum));
        System.out.println("Please provide all the array index values.");
        for(int i = 0; i<n; i++){
            arrNum[i] = getInput.nextInt();
        }

        // precompute 
        int hash[] = new int[13];
        for(int i = 0; i<n; i++){
            hash[arrNum[i]] += 1;
        }

        System.out.println("let's find the number?");
        while (true) {
            int number = getInput.nextInt();
            System.out.println("found count is : " + hash[number]);            
        }

    }
    
}