package day1_6;

import java.util.Scanner;

public class OrangeDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOranges;

        System.out.print("Enter number of oranges plucked : ");
        numOranges = sc.nextInt();

        int ownerShare = (numOranges * 40) / 100;
        int remainingOranges = numOranges - ownerShare;
        int workerShare = remainingOranges / 4;
        int juiceBalance = remainingOranges % 4;

        System.out.println("Total oranges for the owner is " + ownerShare);
        System.out.println("Total oranges for each worker is " + workerShare);
        System.out.println("Balance of oranges to make juice is " + juiceBalance);
    }
}
