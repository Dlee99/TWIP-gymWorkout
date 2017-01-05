package com.company;

import java.util.Scanner;

public class Customer {
    Scanner sc = new Scanner(System.in);
    private int SSN;
    public int visits, weight;
    public Customer(int ss){
        SSN = ss;
        Visit();
    }
    public Customer(){}
    public void Visit(){
        System.out.println("How much does the customer weigh?");
        visits++;
        weight = sc.nextInt();
    }
    public int getSSN(){
        return SSN;
    }
}
