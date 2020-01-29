/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numPeople, busCapacity, vanCapacity;
        System.out.println("How many people are coming on the trip?");
        numPeople = in.nextInt();
        
        System.out.println("How many people can a bus fit?");
        busCapacity = in.nextInt();
        
        System.out.println("How many people can a van fit?");
        vanCapacity = in.nextInt();
        
        // TODO: Output you need "You need X buses and Y vans"
    }
}
