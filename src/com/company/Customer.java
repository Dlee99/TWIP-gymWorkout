package com.company;

import java.util.Scanner;

public class Customer {
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    private int SSN;
    public double visits, weight, visitlng, hours, rate, buym, buycl, buyret, buyaq, buyp;
    public boolean member = false;
    public Customer(int ss){
        SSN = ss;
        Visit();
    }
    public Customer(){}
    public void Visit(){
        System.out.println("How much does the customer weigh?");
        visits++;
        weight = sc.nextDouble();
        String y1 = "";
        while(true) {
            if(y1.equals("Y")){
                member = true;
                break;
            }
            else if(y1.equals("N")){
                String y2 = "";
                while(true) {
                    if (y2.equals("Y") && !member) {
                        System.out.println("Membership purchased processed.");
                        break;
                    } else if(y2.equals("N")) {
                        System.out.println("Membership not purchased.");
                        break;
                    }
                    System.out.println("Would the customer like to purchase a membership? (Y) or (N)");
                }
                member = false;
                break;
            }
            else{
                System.out.println("Is the customer a member? (Y) or (N)");
                y1 = sc2.nextLine().toUpperCase();
            }
        }

    }
    public int getSSN(){
        return SSN;
    }
    public double getWeight() {
        return weight;
    }
    public boolean getMember(){
        return member;
    }
}
