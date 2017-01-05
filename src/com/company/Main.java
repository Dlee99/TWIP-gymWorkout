package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Customer {
    Scanner sc = new Scanner(System.in);
    private int SSN;
    public int visits, weight;
    public Customer(int ss){
        SSN = ss;
        Visit();
    }
    public void Visit(){
        System.out.println("How much does the customer weigh?");
        visits++;
        weight = sc.nextInt();
    }
    public int getSSN(){
        return SSN;
    }
}
class Member extends Customer {
    super(int ss){
        SSN = ss;
    }
    private int SSN;

}
