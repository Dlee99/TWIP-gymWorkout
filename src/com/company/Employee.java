package com.company;

public class Employee extends Customer {
    private int SSN;
    public Employee(int ss){
        SSN = ss;
        Visit();
    }
    public double getCost(){
        if(getMember()){
            cost = (3 * buycl) + (7 * buyaq) + (15 * buyp) + (.8 * buyret);
        }
        else{
            cost = (3 * buycl) + (7 * buyaq) + (15 * buyp) + (.9 * buyret);
        }
        return cost;
    }
    public double getMonthly(){
        if(getMember()){
            monthly = 1;
        }
        return monthly;
    }
}
