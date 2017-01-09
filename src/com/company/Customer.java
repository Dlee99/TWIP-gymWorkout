package com.company;

import java.util.Scanner;

public class Customer {
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    private int SSN;
    public double visits, weight, visitlng, hours, rate, buym, buycl, buyret, buyaq, buyp, cost, monthly;
    public boolean member = false;
    public Customer(int ss){
        SSN = ss;
        Visit();
    }
    public Customer(){}
    public void Visit(){
        buym = 0;
        buycl = 0;
        buyaq = 0;
        buyp = 0;
        monthly = 0;
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
                member = false;
                break;
            }
            else{
                System.out.println("Is the customer a member? (Y) or (N)");
                y1 = sc2.nextLine().toUpperCase();
            }
        }
        String buy = "";
        while(true){
            if(buy.equals("membership")){
                if(getMember()){
                    System.out.println("Customer already has a membership." +
                            "\nPlease buy something else.");
                    buy = sc2.nextLine();
                }
                else{
                    buym++;
                }
            }
            else if(buy.equals("classes")){
                buycl++;
            }
            else if(buy.equals("retail")){
                System.out.println("Sorry, no retail is available for purchase right now." +
                        "\nPlease buy something else.");
                buy = sc2.nextLine();
                //sout("What items from retail?");
                //while(true){
                // if(buy2.equals("<item>"){
                // int <item>++;
                // }
                // }
                //double buyret = (<price> * <item>) + (<price2> * <item2>);
            }
            else if(buy.equals("aquatics")){
                if(getMember()){
                    buyaq++;
                }
                else{
                    System.out.println("Non-members may not buy aquatics!" +
                            "\nPlease buy something else.");
                    buy = sc2.nextLine();
                }
            }
            else if(buy.equals("personal trainer")){
                System.out.println("How many hours would you like to have a personal trainer for?");
                double hr = sc.nextDouble();
                buyp = buyp + hr;
                System.out.println("What else would you like to buy?");
                buy = sc2.nextLine();
            }
            else if(buy.equals("nothing")){
                System.out.println("Thank you for shopping!");
                break;
            }
            else{
                System.out.println("What would you like to purchase?\n" +
                        "Membership\n" +
                        "Classes\n" +
                        "Retail\n" +
                        "Aquatics\n" +
                        "Personal Trainer\n" +
                        "Nothing");
                buy = sc2.nextLine().toLowerCase();
            }
        }
        System.out.println("That will cost: $" + getCost() + "\nAnd a monthly rate of: $" + getMonthly());
        System.out.println("Customer");
    }
    public double getMonthly(){
        if(getMember()){
            monthly = 65;
        }
        return monthly;
    }
    public double getCost(){
        if(getMember()){
            cost = (8 * buycl) + (10 * buyaq) + (20 * buyp);
        }
        else{
            cost = (10 * buycl) + (25 * buyp);
        }
        return cost;
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
